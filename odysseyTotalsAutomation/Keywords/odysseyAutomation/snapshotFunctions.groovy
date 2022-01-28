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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import odysseyAutomation.randomFuctions as randomFunctions

import odysseyAutomation.navigateToSpecificUrl as navigateToUrl

import odysseyAutomation.login as loginFunction


public class snapshotFunctions {

	@Keyword
	def navigateToSnapshotFromEditor() {

		String navigateToSnapshotURL = navigateToUrl.navigateToURLPage(WebUI.getUrl(), "edit", "snapshot")

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
	def checkTotalInSnapshotFromClientPreview() {

		WebUI.delay(1)

		WebUI.navigateToUrl(GlobalVariable.snapshotUrl)

		WebUI.delay(3)

		String proposalValue = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@class, 'proposal-value')]/span"))

		WebUI.comment("Proposal value in snapshot page: "+proposalValue)

		proposalValue = proposalValue.replaceAll("[^a-zA-Z0-9]", "")

		Integer proposalValueInt = Integer.parseInt(proposalValue)

		System.out.println("Proposal value in form of Integer from snapshot page: "+proposalValueInt)

		if(GlobalVariable.clientPreviewTotal==(proposalValueInt/100)) {

			WebUI.comment("Total is accurate in the snapshot page after proposal sign")

			return true
		}
		else {

			WebUI.comment("Total is not accurate in the snapshot page after proposal sign")

			return false
		}
	}
}
