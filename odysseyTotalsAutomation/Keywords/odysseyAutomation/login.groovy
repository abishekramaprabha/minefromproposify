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

public class login {

	@Keyword
	def loginUser() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.urlToTest)

		WebUI.refresh()

		WebUI.delay(2)

		WebUI.waitForElementPresent(findTestObject('Object Repository/loginPage/txt_login_Input_Your Email Address'), 10)

		WebUI.delay(3)

		WebUI.setText(findTestObject('Object Repository/loginPage/txt_login_Input_Your Email Address'), GlobalVariable.loginUName)

		WebUI.setText(findTestObject('Object Repository/loginPage/txt_login_Input_Password'), GlobalVariable.loginPassword)

		WebUI.waitForElementPresent(findTestObject('Object Repository/loginPage/btn_login'), 10)

		WebUI.click(findTestObject('Object Repository/loginPage/btn_login'))

		WebUI.delay(5)

		String currentUrl = WebUI.getUrl()

		WebUI.comment("Dashboard URL is: "+currentUrl)

		if(currentUrl.contains("dashboard")) {

			WebUI.comment("User login function - successfull")

			GlobalVariable.dashboardUrl = currentUrl

			return true
		}
		else {

			WebUI.comment("User login function - Not successfull")

			return false
		}
	}


	@Keyword
	def logoutUser() {

		String urlForSplit = WebUI.getUrl()
		String[] result = urlForSplit.split("\\/")
		String userDomain = result[0]+"//"+result[1]+result[2]
		String logoutUrl=userDomain+"/logout"
		WebUI.comment(logoutUrl)
		WebUI.navigateToUrl(logoutUrl)
		WebUI.delay(3)
		
		if(WebUI.getUrl().contains("login")) {
			
			WebUI.comment("Logout is successful")
			
			return true
			
		}
		
		else {
			
			WebUI.comment("Log out is not successful")\
			
			return false
		}
	}
}
