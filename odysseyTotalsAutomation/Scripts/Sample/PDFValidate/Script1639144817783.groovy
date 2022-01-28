import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import odysseyAutomation.randomFuctions
import odysseyAutomation.randomFuctions as randomFunctions

WebUI.openBrowser("")

WebUI.maximizeWindow()

boolean pdfValidateResult = CustomKeywords.'odysseyAutomation.pdfFunctions.validatePDFValue'("OdysseyAutomationTest 12/15/21 02:59PM", 15000)

if(pdfValidateResult == true)
{
	WebUI.comment("PDF validation successful")
	assert true
		
}
else {
	WebUI.comment("PDF Validation not successful")
	assert false
}

WebUI.closeBrowser()


//String pass = "Sample test check"
//
//GlobalVariable.loginPassword = pass
//
//System.out.println("Global Variable Value: "+GlobalVariable.loginPassword)
//
//System.out.println("Original: "+pass)


//WebUI.waitForPageLoad(5)
//
//WebUI.delay(2)
//
//String total = "1,010.10\$"
//
//String xpathToConvert = "//span[contains(text(),'1,010.10\$')]"
//
//String result = WebUI.verifyElementPresent(randomFuctions.convertStringToXpath(xpathToConvert), 10)
//
//if(result) {
//	String fromPDF = WebUI.getText(randomFuctions.convertStringToXpath(xpathToConvert))
//	
//	System.out.println(fromPDF)
//	
//	if(total.equalsIgnoreCase(fromPDF)) {
//		System.out.println("Pass")
//	}
//}
//else {
//	assert false
//}