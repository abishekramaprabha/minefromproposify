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

import odysseyAutomation.randomFuctions as randomFunctions

import odysseyAutomation.navigateToSpecificUrl as navigateToUrl

import odysseyAutomation.login as loginFunction


import org.openqa.selenium.Keys as Keys

public class editorFunctions {

	@Keyword
	def insertFeeTable() {

		String currentUrl = WebUI.getUrl()

		if(currentUrl.contains("proposal/edit")) {

			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/editorPage/text_contentSectionTitleName'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/editorPage/placeholder_masterTextBox_contentSection'))

			WebUI.click(findTestObject('editorPage/button_feeTableSign'))

			WebUI.click(findTestObject('Object Repository/editorPage/button_addPricingTable'))

			//			Keys.chord(Keys.CONTROL, 't')
			//			Keys.chord(Keys.CONTROL, 'e')
			//			Keys.chord(Keys.CONTROL, 's')
			//			Keys.chord(Keys.CONTROL, 't')
			//			Keys.chord(Keys.TAB)
			//			Keys.chord(Keys.CONTROL, '1')
			//			Keys.chord(Keys.CONTROL, '0')
			//			Keys.chord(Keys.CONTROL, '0')
			//			Keys.chord(Keys.TAB)
			//			Keys.chord(Keys.CONTROL, '1')
			//			Keys.chord(Keys.CONTROL, '0')
			//			Keys.chord(Keys.ADD)

			WebUI.delay(1)

			WebUI.click(findTestObject('editorPage/btn_saveButton'))

			WebUI.delay(2)

			return true
		}
		else {

			return false
		}
	}




	@Keyword
	def importValueToFeeTable() {

		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/feeTable'))

		WebUI.click(findTestObject('editorPage/Feetable/Hardcoded/unit_feeTitle'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/btn_addRowBelow'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/dropdwn_feeTypeSelect_addRow'))

		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/dropdwn_importFee_listOption'))

		WebUI.delay(2)

		//creating fee variables to add them to match it to the proposal total later

		String unitFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee')]//following-sibling::span"))
		unitFee = unitFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(unitFee)

		String unitFee2 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 2')]//following-sibling::span"))
		unitFee2 = unitFee2.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(unitFee2)

		String unitFee3 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 3')]//following-sibling::span"))
		unitFee3 = unitFee3.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(unitFee3)

		String unitFee4 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 4')]//following-sibling::span"))
		unitFee4 = unitFee4.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(unitFee4)

		String testFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'test fee')]//following-sibling::span"))
		testFee = testFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(testFee)

		String flatFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee')]//following-sibling::span"))
		flatFee = flatFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(flatFee)

		String flatFee2 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 2')]//following-sibling::span"))
		flatFee2 = flatFee2.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(flatFee2)

		String flatFee3 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 3')]//following-sibling::span"))
		flatFee3 = flatFee3.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(flatFee3)

		String annualFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee')]//following-sibling::span"))
		annualFee = annualFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(annualFee)

		String annualFee2 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee 2')]//following-sibling::span"))
		annualFee2 = annualFee2.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(annualFee2)

		String monthlyFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee')]//following-sibling::span"))
		monthlyFee = monthlyFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(monthlyFee)

		String monthlyFee2 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee 2')]//following-sibling::span"))
		monthlyFee2 = monthlyFee2.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(monthlyFee2)

		String hourlyFee = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee')]//following-sibling::span"))
		hourlyFee = hourlyFee.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(hourlyFee)

		String hourlyFee2 = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee 2')]//following-sibling::span"))
		hourlyFee2 = hourlyFee2.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(hourlyFee2)

		//select the fees from the import fee selection

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee 2')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Annual fee 2')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 2')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 2')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 3')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Flat fee 3')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 2')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 2')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 3')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 3')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 4')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Unit fee 4')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'test fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'test fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee 2')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Hourly fee 2')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee')]//preceding-sibling::input"))
		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee 2')]//preceding-sibling::input"), 5)
		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), 'Monthly fee 2')]//preceding-sibling::input"))
		WebUI.delay(1)



		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/btn_addToTable_importFee'))

		//		WebUI.setText(findTestObject('editorPage/Feetable/Hardcoded/unit_feeTitle_input'), "Unit/Quantity row")
		//
		//		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/unit_feePrice'))
		//
		//		WebUI.setText(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/unit_feePrice'), price)
		//
		//		WebUI.delay(1)
		//
		//		WebUI.click(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/unit_feeQty'))
		//
		//		WebUI.setText(findTestObject('Object Repository/editorPage/Feetable/Hardcoded/unit_feeQty'), qty)
		//
		//		WebUI.delay(2)

		//		WebUI.click(findTestObject('Object Repository/editorPage/canvasArea_masterTextBox'))

		WebUI.delay(3)

		String proposalTotal = WebUI.getText(findTestObject('Object Repository/editorPage/totalPane'))

		WebUI.comment(proposalTotal)

		proposalTotal = proposalTotal.replaceAll("[^a-zA-Z0-9]", "")

		Integer proposalTotalInt = Integer.parseInt(proposalTotal)

		Integer flatFeeInt = Integer.parseInt(flatFee)
		Integer flatFee2Int = Integer.parseInt(flatFee2)
		Integer flatFee3Int = Integer.parseInt(flatFee3)
		Integer testFeeInt = Integer.parseInt(testFee)
		Integer unitFee2Int = Integer.parseInt(unitFee2)
		Integer unitFee3Int = Integer.parseInt(unitFee3)
		Integer unitFee4Int = Integer.parseInt(unitFee4)

		System.out.println(GlobalVariable.editorTotalWidget)

		System.out.println(proposalTotalInt)

		Integer feeTotal = flatFeeInt+flatFee2Int+flatFee3Int+testFeeInt+unitFee2Int+unitFee3Int+unitFee4Int

		System.out.println(feeTotal)

		if((feeTotal)==(proposalTotalInt/100)) {

			WebUI.comment("Import values table function - successful")

			WebUI.comment("Verified Total")

			GlobalVariable.editorTotalWidget = proposalTotalInt/100

			System.out.println(GlobalVariable.editorTotalWidget)

			WebUI.delay(5)

			return true

			//			boolean importPane = WebUI.verifyElementPresent(randomFunctions.convertStringToXpath("//h4[contains(text(), 'Fee Library')]"), 5)
			//
			//			if(importPane==true) {
			//
			//				WebUI.comment("Closing the import fee panel")
			//
			//				WebUI.click(randomFunctions.convertStringToXpath("//a[contains(@data-callback, 'closeFeeLibrary')]"))
			//
			//				WebUI.delay(1)
			//
			//				return true
			//
			//
			//			}
			//			else {
			//
			//				WebUI.comment("Import Panel window is closed. Hence moving forward")
			//
			//				return true
			//
			//			}

		}

		else {

			WebUI.comment("Import values table function - Not successful")

			return false
		}
	}


	@Keyword
	def updateCheckboxFeeRow(String feeName) {

		WebUI.delay(1)

		WebUI.comment(feeName)

		WebUI.refresh()
		WebUI.waitForPageLoad(10)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/editorPage/text_contentSectionTitleName'))

		WebUI.delay(1)

		String feeTotal = WebUI.getText(randomFunctions.convertStringToXpath("//tr[contains(@data-type, 'total')]//p[contains(@data-type, 'result')]/span"))

		WebUI.comment("Fee table total value: "+feeTotal)

		feeTotal = feeTotal.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeTotalIntBeforeUpdate = Integer.parseInt(feeTotal)

		System.out.println("Fee table total value in form of Integer: "+feeTotalIntBeforeUpdate)

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//strong[(text()='"+feeName+"')]//parent::p//parent::td//parent::tr//preceding-sibling::tr[1]"))

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//strong[(text()='"+feeName+"')]//parent::p//parent::td//input"))

		//WebUI.delay(0.5)

		//WebUI.click(randomFunctions.convertStringToXpath("//strong[(text()='"+feeName+"')]//parent::p//parent::td//input"))

		WebUI.delay(0.5)

		String feeValue = WebUI.getText(randomFunctions.convertStringToXpath("//strong[(text()='"+feeName+"')]//parent::p//parent::td//parent::tr//td[4]//span"))

		WebUI.comment("Fee row "+feeName+" value extracted and is: "+feeValue)

		feeValue = feeValue.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeRowValueInt = Integer.parseInt(feeValue)

		System.out.println("Fee row "+feeName+" value extracted and in form of integer is: "+feeRowValueInt)

		//verify fee total again after table value update

		feeTotal = WebUI.getText(randomFunctions.convertStringToXpath("//p[contains(@data-type, 'result')]/span"))

		WebUI.comment("Fee table total after the update in table: "+feeTotal)

		feeTotal = feeTotal.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeTotalIntAfterUpdate = Integer.parseInt(feeTotal)

		System.out.println("Fee table total after the update in table in form of Integer: "+feeTotalIntAfterUpdate)

		WebUI.delay(0.5)

		if(feeTotalIntAfterUpdate==(feeTotalIntBeforeUpdate+feeRowValueInt)) {

			WebUI.comment("Table total updated successfully - inside function")

			String proposalTotal = WebUI.getText(findTestObject('Object Repository/editorPage/totalPane'))

			WebUI.comment("Total from the editor widget: "+proposalTotal)

			proposalTotal = proposalTotal.replaceAll("[^a-zA-Z0-9]", "")

			Integer proposalTotalInt = Integer.parseInt(proposalTotal)

			System.out.println("Total from the editor widget in form of Integer: "+proposalTotalInt)

			if((feeTotalIntAfterUpdate)==(proposalTotalInt/100)) {

				WebUI.comment("Fee row update function - successful")

				WebUI.comment("Verified Total")

				GlobalVariable.editorTotalWidget = proposalTotalInt/100

				System.out.println("Editor Total widget value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

				WebUI.delay(1)

				WebUI.click(randomFunctions.convertStringToXpath("//*[@id='pyPageList']//span[contains(text(),'Variables')]"))

				WebUI.delay(1)

				String variableTotal = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))

				WebUI.comment("Total variable value from the editor page: "+variableTotal)

				variableTotal = variableTotal.replaceAll("[^a-zA-Z0-9]", "")

				Integer variableTotalInt = Integer.parseInt(variableTotal)

				System.out.println("Total variable value in form of Integer: "+variableTotalInt)

				WebUI.delay(2)

				if((proposalTotalInt/100)==(variableTotalInt/100)) {

					WebUI.comment("Proposal total and Variable Total are accurate - Variable update successful after row update")

					GlobalVariable.editorTotalWidget = proposalTotalInt/100
					System.out.println("Editor Total widget value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					GlobalVariable.feeTableTotal = feeTotalIntAfterUpdate
					System.out.println("Fee Total value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					GlobalVariable.variableTotal = variableTotalInt/100
					System.out.println("Total variable value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					return true


				}
				else {

					WebUI.comment("Proposal total and Variable total are inaccurate - Variable not updated after fee row update")

					return false

				}

			}
			else {

				WebUI.comment("Table total and proposal total are incorrect - inside function")

				return false

			}
		}
		else {

			WebUI.comment("Table total is not updated after fee row update - Total inaccuracy")

			return false

		}

	}



	@Keyword
	def navigateToClientPreview(String clientName) {

		WebUI.delay(2)

		String sendPageUrl = navigateToUrl.navigateToURLPage(WebUI.getUrl(), "snapshot", "send")

		WebUI.comment("Proposal send page URL: "+sendPageUrl)

		WebUI.navigateToUrl(sendPageUrl)

		WebUI.delay(3)

		String clientPreviewUrl = WebUI.getAttribute(randomFunctions.convertStringToXpath("//a[contains(@data-name, '"+clientName+"')]"), "data-url")

		WebUI.comment("Client preview link: "+clientPreviewUrl)

		WebUI.delay(2)

		WebUI.openBrowser(clientPreviewUrl)

		WebUI.maximizeWindow()

		//WebUI.navigateToUrl(clientPreviewUrl)

		WebUI.delay(5)

		String currentUrl = WebUI.getUrl()

		WebUI.comment("Checking URL matching client preview link or not: "+currentUrl)

		if(currentUrl.contains("preview")) {

			WebUI.comment("Client preview page load function - Successful")

			System.out.println(GlobalVariable.editorTotalWidget)

			return true

		}
		else {

			WebUI.comment("Client preview page load function - Not successful")

			return false

		}

		//		WebUI.delay(1)
		//
		//		WebUI.click(findTestObject('Object Repository/editorPage/dropdwn_signees_signature'))
		//
		//		WebUI.delay(1)
		//
		//		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(text(), '"+clientName+"')]"))
		//
		//		//		WebUI.rightClick(randomFunctions.convertStringToXpath("//span[contains(@class, 'svg-signature_pen')]//parent::a[contains(@data-display-name, '"+clientName+"')]"))
		//		//
		//		//		WebUI.click(findTestObject('Object Repository/editorPage/canvasArea_masterTextBox'))
		//		//
		//		//		WebUI.delay(1)
		//		//
		//		//		WebUI.mouseOver(randomFunctions.convertStringToXpath("//span[contains(@class, 'svg-signature_pen')]//parent::a[contains(@data-display-name, '"+clientName+"')]"))
		//		//
		//		//		WebUI.delay(3)
		//		//
		//		//		WebUI.click(findTestObject('Object Repository/editorPage/canvasArea_masterTextBox'))
		//
		//		//WebUI.dragAndDropByOffset(randomFunctions.convertStringToXpath("//span[contains(@class, 'svg-signature_pen')]//parent::a[contains(@data-display-name, '"+clientName+"')]"), 198, 201)
		//
		//		WebUI.dragAndDropToObject(randomFunctions.convertStringToXpath("//span[contains(@class, 'svg-signature_pen')]//parent::a[contains(@data-display-name, '"+clientName+"')]"), findTestObject('Object Repository/editorPage/canvasArea_masterTextBox'))
		//
		//		WebUI.delay(5)
		//
		//		return true

	}



	@Keyword
	def addTotalVariableToProposal(String newSectionName) {

		WebUI.delay(1)

		//		WebUI.click(findTestObject('Object Repository/editorPage/a_textBox_sidePane'))
		//
		//		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/btn_sectionAdd_plusSign'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/btn_addNewPageFlowSection_addButton'))

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//input[contains(@value, 'Untitled')]"))

		WebUI.setText(randomFunctions.convertStringToXpath("//input[contains(@value, 'Untitled')]"), newSectionName)

		WebUI.click(randomFunctions.convertStringToXpath("//input[contains(@value, 'Untitled')]//parent::div//span[contains(@class, 'svg-checkmark')]"))

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//div[contains(@id, 'pyCanvasList')]/div[3]//div[contains(@class, 'elements')]"))

		WebUI.delay(2)
		
		WebUI.setText(randomFunctions.convertStringToXpath("//div[contains(@id, 'pyCanvasList')]/div[3]//div[contains(@class, 'elements')]"), ("VARIABLES "))
		
		WebUI.delay(2)

		////		WebUI.click(randomFunctions.convertStringToXpath("//*[@id='pyCanvasList']/div[2]/div[2]/div[5]/div[2]"))
		////
		////		WebUI.delay(1)
		//
		//		WebUI.click(randomFunctions.convertStringToXpath("//*[@id='pyCanvasList']/div[2]/div[2]/div[5]/div[2]//p]"))
		//
		//		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//a[contains(@data-success, 'bindVariableLibraryEventListeners')]"))

		WebUI.delay(1)

		WebUI.scrollToElement(randomFunctions.convertStringToXpath("//a[contains(@data-name, '{total}')]//p[contains(text(), 'Total')]"), 5)

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//a[contains(@data-name, '{total}')]/span"))

		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/editorPage/btn_saveButton'))

		WebUI.delay(2)

		WebUI.refresh()

		WebUI.delay(3)

		WebUI.click(randomFunctions.convertStringToXpath("//*[@id='pyPageList']//span[contains(text(),'"+newSectionName+"')]"))

		WebUI.delay(1)

		String variableTotal = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))

		WebUI.comment(variableTotal)

		WebUI.delay(2)

		return true

	}



	@Keyword
	def navigateToSnapshotFromEditor() {

		WebUI.delay(1)

		String snapshotUrl = navigateToUrl.navigateToURLPage(WebUI.getUrl(), "edit", "snapshot")

		WebUI.comment("Snapshot Url that will be used for navigation: "+snapshotUrl)

		GlobalVariable.snapshotUrl = snapshotUrl

		WebUI.navigateToUrl(snapshotUrl)

		WebUI.delay(3)

		String proposalValue = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@class, 'proposal-value')]/span"))

		WebUI.comment("Proposal value in snapshot page: "+proposalValue)

		proposalValue = proposalValue.replaceAll("[^a-zA-Z0-9]", "")

		Integer proposalValueInt = Integer.parseInt(proposalValue)

		System.out.println("Proposal value in form of Integer from snapshot page: "+proposalValueInt)

		if(GlobalVariable.editorTotalWidget==(proposalValueInt/100)) {

			WebUI.comment("Total is accurate in the snapshot page")

			return true

		}
		else {

			WebUI.comment("Total is not accurate in the snapshot page")

			return false

		}

	}




	@Keyword
	def addingDiscountToFee(String feeName, String discountPercent) {

		WebUI.delay(1)

		WebUI.comment(feeName)

		WebUI.refresh()
		WebUI.waitForPageLoad(10)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/editorPage/text_contentSectionTitleName'))

		WebUI.delay(1)

		String feeTotal = WebUI.getText(randomFunctions.convertStringToXpath("//tr[contains(@data-type, 'total')]//p[contains(@data-type, 'result')]/span"))

		WebUI.comment("Fee table total value before adding discount: "+feeTotal)

		feeTotal = feeTotal.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeTotalIntBeforeDiscount = Integer.parseInt(feeTotal)

		System.out.println("Fee table total value before discount in form of Integer: "+feeTotalIntBeforeDiscount)

		WebUI.delay(0.5)

		String feeValue = WebUI.getText(randomFunctions.convertStringToXpath("//p[(text()='"+feeName+"')]//parent::td/following-sibling::td/p"))

		WebUI.comment("Fee row "+feeName+" value extracted and is: "+feeValue)

		feeValue = feeValue.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeRowValueInt = Integer.parseInt(feeValue)

		Integer discountPercentInt = Integer.parseInt(discountPercent)

		Integer discountValueInt = (feeRowValueInt*(discountPercentInt/100))

		System.out.println("Fee row "+feeName+" value extracted and in form of integer is: "+feeRowValueInt)

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//p[(text()='"+feeName+"')]//parent::p//parent::td//parent::tr"))

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//p[(text()='"+feeName+"')]"))

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//button[contains(@data-cmd, 'tableMenuRowOpen')]/span[contains(@class, 'svg-more')]"))

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//a[contains(@data-callback, 'bindPricingRowDiscountEventListeners')]"))

		WebUI.delay(0.5)

		WebUI.click(randomFunctions.convertStringToXpath("//div[contains(@class, 'discount-toggle')]//span[contains(@class, 'labels fr-input-selector')]"))

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//input[contains(@name, 'amount')]"))

		WebUI.delay(1)

		//		Keys.chord(Keys.BACK_SPACE)
		//		WebUI.delay(0.5)
		//		Keys.chord(Keys.NUMPAD1)
		//		WebUI.delay(0.5)
		//		Keys.chord(Keys.NUMPAD0)
		//
		//		WebUI.delay(1)

		WebUI.sendKeys(randomFunctions.convertStringToXpath("//input[contains(@name, 'amount')]"), discountPercent)

		WebUI.delay(1)

		WebUI.click(randomFunctions.convertStringToXpath("//span[contains(@class, 'svg-chevronleft')]"))

		WebUI.delay(1)

		WebUI.refresh()
		WebUI.waitForPageLoad(10)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/editorPage/text_contentSectionTitleName'))

		WebUI.delay(1)

		String feeTotalAfterDiscount = WebUI.getText(randomFunctions.convertStringToXpath("//tr[contains(@data-type, 'total')]//p[contains(@data-type, 'result')]/span"))

		WebUI.comment("Fee table total value after adding discount: "+feeTotalAfterDiscount)

		feeTotalAfterDiscount = feeTotalAfterDiscount.replaceAll("[^a-zA-Z0-9]", "")

		Integer feeTotalIntAfterDiscount = Integer.parseInt(feeTotalAfterDiscount)

		System.out.println("Fee table total value before discount in form of Integer: "+feeTotalIntAfterDiscount)

		WebUI.delay(0.5)

		if(feeTotalIntAfterDiscount==(feeTotalIntBeforeDiscount-discountValueInt)) {

			WebUI.comment("Total value matches after discount applied")

			String proposalTotal = WebUI.getText(findTestObject('Object Repository/editorPage/totalPane'))

			WebUI.comment("Total from the editor widget: "+proposalTotal)

			proposalTotal = proposalTotal.replaceAll("[^a-zA-Z0-9]", "")

			Integer proposalTotalInt = Integer.parseInt(proposalTotal)

			System.out.println("Total from the editor widget in form of Integer: "+proposalTotalInt)

			if((feeTotalIntAfterDiscount)==(proposalTotalInt/100)) {

				WebUI.comment("Discount addition function - successful - inside called function")

				WebUI.comment("Verified Total")

				GlobalVariable.editorTotalWidget = proposalTotalInt/100

				System.out.println("Editor Total widget value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

				WebUI.delay(1)

				WebUI.click(randomFunctions.convertStringToXpath("//*[@id='pyPageList']//span[contains(text(),'Variables')]"))

				WebUI.delay(1)

				String variableTotal = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))

				WebUI.comment("Total variable value from the editor page: "+variableTotal)

				variableTotal = variableTotal.replaceAll("[^a-zA-Z0-9]", "")

				Integer variableTotalInt = Integer.parseInt(variableTotal)

				System.out.println("Total variable value in form of Integer: "+variableTotalInt)

				WebUI.delay(2)

				if((proposalTotalInt/100)==(variableTotalInt/100)) {

					WebUI.comment("Proposal total and Variable Total are accurate - Variable update successful after row update")

					GlobalVariable.editorTotalWidget = proposalTotalInt/100
					System.out.println("Editor Total widget value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					GlobalVariable.feeTableTotal = feeTotalIntAfterDiscount
					System.out.println("Fee Total value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					GlobalVariable.variableTotal = variableTotalInt/100
					System.out.println("Total variable value stored in global variable and is: "+GlobalVariable.editorTotalWidget)

					return true


				}
				else {

					WebUI.comment("Proposal total and Variable total are inaccurate - Variable not updated after fee row update")

					return false

				}

			}
			else {

				WebUI.comment("Table total and proposal total are incorrect - inside function")

				return false

			}




		}

		else {

			WebUI.comment("Total value doesn't match after discount applied")

			return false

		}





	}







}
