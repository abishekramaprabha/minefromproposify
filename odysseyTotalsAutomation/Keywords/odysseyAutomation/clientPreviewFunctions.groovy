package odysseyAutomation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import odysseyAutomation.navigateToSpecificUrl as navigateToSpecificUrl

import odysseyAutomation.randomFuctions as randomFunctions

public class clientPreviewFunctions {

	@Keyword
	def navigateToClientPreviewFromSnapshot() {

		String navigateToSnapshotURL = navigateToSpecificUrl.navigateToURLPage(WebUI.getUrl(), "edit", "snapshot")

		WebUI.navigateToUrl(navigateToSnapshotURL)

		WebUI.delay(3)

		String currentUrl = WebUI.getUrl()

		if(currentUrl.contains("snapshot")) {

			WebUI.comment("Navigate to Snapshot from editor Function - Successful")

			return true
		}

		else {

			WebUI.comment("Navigate to Snapshot from editor Function - Not Successful")

			return false
		}
	}



	@Keyword
	def clientEditTableValues() {

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//ul[contains(@class, 'section-list')]/li[2]"))

		WebUI.delay(2)

		String feeTableTotalClientPreview = WebUI.getText(randomFunctions.convertStringToXpath("//p[contains(@data-type, 'result')]/span"))

		WebUI.comment("Fee table total from the client preview page: "+feeTableTotalClientPreview)

		feeTableTotalClientPreview = feeTableTotalClientPreview.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeTableTotalIntClientPreview = Integer.parseInt(feeTableTotalClientPreview)

		System.out.println("Fee table total in form of Integer from the client preview page: "+feeTableTotalIntClientPreview)

		if(GlobalVariable.feeTableTotal==feeTableTotalIntClientPreview) {

			WebUI.comment("Editor value and client preview value match - for fee table")

			WebUI.delay(2)

			WebUI.scrollToElement(randomFunctions.convertStringToXpath("//strong[contains(text(), 'Unit fee 2')]//parent::p//parent::td"), 5)

			//		WebUI.mouseOver(randomFunctions.convertStringToXpath("//strong[contains(text(),'Unit fee')]//parent::p//preceding-sibling::span//input"))
			//
			//		WebUI.delay(2)
			//
			//		WebUI.click(randomFunctions.convertStringToXpath("//strong[contains(text(),'Unit fee')]//parent::p//preceding-sibling::span//input"))
			//
			//		WebUI.click(randomFunctions.convertStringToXpath("//strong[contains(text(),'Unit fee')]//parent::p//preceding-sibling::span//input"))

			for(int i=0;i<5;i++) {

				WebUI.click(randomFunctions.convertStringToXpath("//strong[contains(text(), 'Unit fee 2')]//parent::p//parent::td//following-sibling::td[2]//button[contains(@class, 'bootstrap-touchspin-up ')]"))

				WebUI.delay(0.5)
			}

			String feeTableTotal = WebUI.getText(randomFunctions.convertStringToXpath("//p[contains(@data-type, 'result')]/span"))

			WebUI.comment("Fee table total value after client update: "+feeTableTotal)

			feeTableTotal = feeTableTotal.replaceAll("[^a-zA-Z0-9]", "")

			Integer feeTableTotalInt = Integer.parseInt(feeTableTotal)

			System.out.println("Fee table total value after client update in the form of Integer is: "+feeTableTotalInt)

			String proposalUpdatedTotal = WebUI.getText(randomFunctions.convertStringToXpath("//p//strong[contains(@class, 'preview-proposal-value')]"))

			proposalUpdatedTotal = proposalUpdatedTotal.replaceAll("[^a-zA-Z0-9]", "")

			Integer proposalUpdatedTotalInt = Integer.parseInt(proposalUpdatedTotal)

			GlobalVariable.clientPreviewTotal = proposalUpdatedTotalInt/100

			System.out.println("One time proposal value after client udpate in form of Integer: "+proposalUpdatedTotalInt)

			if(feeTableTotalInt==(proposalUpdatedTotalInt/100)) {

				WebUI.delay(1)

				WebUI.comment("Ready for signing the proposal")

				WebUI.click(randomFunctions.convertStringToXpath("//a[contains(@id, 'pyPreviewToolbarDownloadPdf')]//following-sibling::div/a/span[2]"))

				WebUI.delay(3)

				WebUI.click(randomFunctions.convertStringToXpath("//input[contains(@name, 'email')]"))

				WebUI.setText(randomFunctions.convertStringToXpath("//input[contains(@name, 'email')]"), "john@example.com")

				WebUI.delay(1)

				WebUI.click(randomFunctions.convertStringToXpath("//button[contains(text(), 'Accept proposal')]"))

				WebUI.delay(7)

				WebUI.click(randomFunctions.convertStringToXpath("//button[contains(text(), 'OK')]"))

				WebUI.delay(3)

				WebUI.refresh()

				WebUI.waitForPageLoad(10)

				WebUI.delay(3)

				String proposalWonTotal = WebUI.getText(randomFunctions.convertStringToXpath("//p//strong[contains(@class, 'preview-proposal-value')]"))

				proposalWonTotal = proposalWonTotal.replaceAll("[^a-zA-Z0-9]", "")

				Integer proposalWonTotalInt = Integer.parseInt(proposalWonTotal)

				System.out.println("One time proposal value after client signing proposal: "+ proposalWonTotalInt)

				if(proposalWonTotalInt==proposalUpdatedTotalInt) {

					GlobalVariable.clientPreviewTotal = (proposalWonTotalInt/100)

					System.out.println(GlobalVariable.clientPreviewTotal)

					WebUI.comment("Totals are accurate in the client preview page - after proposal won")

					WebUI.delay(1)

					WebUI.click(randomFunctions.convertStringToXpath("//ul[contains(@class, 'section-list')]/li[3]"))

					WebUI.delay(2)

					String variableValueClientPreview = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))

					WebUI.comment("Variable value from the client preview page: "+variableValueClientPreview)

					variableValueClientPreview = variableValueClientPreview.replaceAll("[^a-zA-Z0-9]", "")

					Integer variableValueIntClientPreview = Integer.parseInt(variableValueClientPreview)

					System.out.println("Total variable value before client update and sign: "+GlobalVariable.variableTotal)

					GlobalVariable.variableTotal = variableValueIntClientPreview/100

					System.out.println("Total variable value after client update and sign: "+GlobalVariable.variableTotal)

					System.out.println("Variable value in form of Integer from the client preview page: "+variableValueIntClientPreview)

					if(GlobalVariable.variableTotal==(variableValueIntClientPreview/100)) {

						WebUI.comment("Variable value is accurate in the client preview page")

						WebUI.delay(1)

						String downloadPDFUrl = navigateToSpecificUrl.navigateToURLPage(WebUI.getUrl(), "preview", "export/pdf")

						WebUI.comment(downloadPDFUrl)

						WebUI.navigateToUrl(downloadPDFUrl)

						WebUI.delay(3)

						String pdfFileName = GlobalVariable.proposalName

						pdfFileName = pdfFileName.replace(" ", "%20")
						pdfFileName = pdfFileName.replace("/", "_")
						pdfFileName = pdfFileName.replace(":", "_")

						WebUI.comment(pdfFileName)

						WebUI.navigateToUrl("file:///Users/abishekramaprabha/Downloads/"+pdfFileName+".pdf")

						WebUI.delay(3)

						WebUI.comment("file:///Users/abishekramaprabha/Downloads/"+pdfFileName+".pdf")

						boolean checkPDFLoad = WebUI.verifyElementPresent(randomFunctions.convertStringToXpath("//embed"), 5)

						WebUI.comment("Checking PDF is downloaded and loaded in browser: "+checkPDFLoad)

						if(checkPDFLoad) {

							WebUI.comment("PDF downloaded successfully")

							WebUI.delay(5)

							return true
						}
						else {

							WebUI.comment("PDF not downloaded successfully")

							return false
						}

					}
					else {

						WebUI.comment("Variable value is not accurate in the client preview page")

						return false

					}


				}
				else {

					WebUI.comment("Totals are not accurate in the client preview page - after proposal won")

					return false
				}
			}
			else {

				WebUI.comment("Total is inaccurate in Function - Not successful")

				return false
			}

		}
		else {

			WebUI.comment("Editor value and client preview value doesnot match")

			return false

		}
	}






	@Keyword
	def checkTotalVariable() {

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//ul[contains(@class, 'section-list')]/li[3]"))

		WebUI.delay(2)

		String variableValueClientPreview = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))

		WebUI.comment("Variable value from the client preview page: "+variableValueClientPreview)

		variableValueClientPreview = variableValueClientPreview.replaceAll("[^a-zA-Z0-9]", "")

		Integer variableValueIntClientPreview = Integer.parseInt(variableValueClientPreview)

		System.out.println("Variable value in form of Integer from the client preview page: "+variableValueIntClientPreview)

		if(GlobalVariable.variableTotal==(variableValueIntClientPreview/100)) {

			WebUI.comment("Variable value is accurate in the client preview page")

			return true

		}
		else {

			WebUI.comment("Variable value is not accurate in the client preview page")

			return false

		}

	}



}
