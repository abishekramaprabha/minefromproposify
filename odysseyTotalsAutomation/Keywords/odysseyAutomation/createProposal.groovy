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

import odysseyAutomation.navigateToSpecificUrl as odysseyRandomFunctions

import odysseyAutomation.dateAndTimeFunction as dateTimeCal

import internal.GlobalVariable

public class createProposal {

	@Keyword
	def proposalCreation() {

		WebUI.waitForPageLoad(10)

		String currentUrl = WebUI.getUrl()

		System.out.println(currentUrl)

		if(currentUrl.contains("dashboard")) {

			String proposalSettingUrl = odysseyRandomFunctions.navigateToURLPage(currentUrl, "dashboard", "/proposal/settings")

			String dateAndTime = dateTimeCal.dateTime()

			String proposalName = "OdysseyAutomationTest "+dateAndTime

			WebUI.comment(proposalName)

			GlobalVariable.proposalName = proposalName
			
			WebUI.navigateToUrl(proposalSettingUrl)

			WebUI.waitForPageLoad(10)

			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/proposalSettingsPage/textbox_proposalName'))

			WebUI.setText(findTestObject('Object Repository/proposalSettingsPage/textbox_proposalName'), proposalName)

			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/proposalSettingsPage/dropdown_clientName'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/proposalSettingsPage/text_clientExampleCompany'))

			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/proposalSettingsPage/button_nextStep'))

			WebUI.waitForPageLoad(10)

			WebUI.delay(3)

			String funcRegisterReturn = WebUI.getUrl()

			if(funcRegisterReturn.contains("edit")) {

				WebUI.comment("Proposal creation function - successfull")

				return true
			}
			else {

				WebUI.comment("Proposal creation function - Not successfull")

				return false
			}
		}
		else {

			WebUI.comment("Proposal creation function - Focus not in dashboard page")

			return false
		}
	}
}