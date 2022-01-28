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

public class navigateToSpecificUrl {

	@Keyword
	public static navigateToURLPage(String Url, String originalWord, String changeWord){
		String fullstr=""
		String str= Url
		fullstr = str.replaceAll(originalWord, changeWord)
		return(fullstr)
	}

	@Keyword
	public static navToUrl(String toUrl) {

		String urlForSplit = WebUI.getUrl()
		String[] result = urlForSplit.split("\\/")
		String userDomain = result[0]+"//"+result[1]+result[2]
		String navigateUrl=userDomain+"/"+toUrl
		WebUI.comment(navigateUrl)
		WebUI.navigateToUrl(navigateUrl)
	}
}
