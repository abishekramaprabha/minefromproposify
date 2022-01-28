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

import internal.GlobalVariable

public class registerAccount {

	@Keyword
	def funcRegister(String fName, String lName, String cName, String email, String password) {

		WebUI.navigateToUrl("https://app.proposify.net/register")

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/registerPage/textbox_firstName'))

		WebUI.setText(findTestObject('Object Repository/registerPage/textbox_firstName'), fName)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/registerPage/textbox_lastName'))

		WebUI.setText(findTestObject('Object Repository/registerPage/textbox_lastName'), lName)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/registerPage/textbox_companyName'))

		WebUI.setText(findTestObject('Object Repository/registerPage/textbox_companyName'), cName)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/registerPage/textbox_email'))

		WebUI.setText(findTestObject('Object Repository/registerPage/textbox_email'), email)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/registerPage/textbox_password'))

		WebUI.setText(findTestObject('Object Repository/registerPage/textbox_password'), password)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/registerPage/button_createAccount'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/registerPage/optionalInformation/button_letsGetStarted'), 15, FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		String dashboardUrl = odysseyRandomFunctions.navigateToURLPage(WebUI.getUrl(), "onboarding/questionnaire", "dashboard")

		WebUI.navigateToUrl(dashboardUrl)

		String funcRegisterReturn = WebUI.getUrl()

		if(funcRegisterReturn.contains("dashboard")) {

			return true
		}
		else {

			return false
		}
	}

	//not necessary as of now, but will be coded later
	@Keyword
	def funcFillOptionalInformationPage(String role, String employeeCount, String country) {

	}
}
