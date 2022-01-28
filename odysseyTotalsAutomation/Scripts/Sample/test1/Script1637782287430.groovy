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
import org.openqa.selenium.Keys as Keys

import odysseyAutomation.navigateToSpecificUrl as navigateToSpecificUrl

import odysseyAutomation.randomFuctions as randomFunctions

import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

import java.io.File

//WebUI.openBrowser("")
//
//WebUI.maximizeWindow()

File file = new File("/Users/abishekramaprabha/Downloads/OdysseyAutomationTest 01_04_22 12_16PM.pdf");

PDDocument document = PDDocument.load(file);

PDFTextStripper pdfStripper = new PDFTextStripper();

String text = pdfStripper.getText(document);

String []test = text.split(" ");

int index = text.indexOf("\$62,150")

System.out.println(index)


//WebUI.navigateToUrl("https://proposify-043487.proposify.net/preview/Tys3MEVVV1VqQ2FrVlhCOEd6RUVsZz09/p0cMrbbbbbc")
//
//WebUI.delay(2)
//
//WebUI.scrollToElement(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"), 5)
//
//WebUI.delay(1)
//
//String variableValueClientPreview = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(@data-placeholder, '{total}')]"))
//
//WebUI.comment("Variable value from the client preview page: "+variableValueClientPreview)
//
//variableValueClientPreview = variableValueClientPreview.replaceAll("[^a-zA-Z0-9]", "")
//
//Integer variableValueIntClientPreview = Integer.parseInt(variableValueClientPreview)
//
//System.out.println("Variable value in form of Integer from the client preview page: "+variableValueIntClientPreview)
//
//if(61150==(variableValueIntClientPreview/100)) {
//
//	WebUI.comment("Variable value is accurate in the client preview page")
//
//	
//
//}
//else {
//
//	WebUI.comment("Variable value is not accurate in the client preview page")
//
//	
//
//}