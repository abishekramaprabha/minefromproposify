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

public class pdfFunctions {

	@Keyword
	def validatePDFValue(String pdfName, Integer totalValue) {

		String pdfFileName = pdfName

		pdfFileName = pdfFileName.replace(" ", "%20")
		pdfFileName = pdfFileName.replace("/", "_")
		pdfFileName = pdfFileName.replace(":", "_")

		WebUI.comment(pdfFileName)

		WebUI.navigateToUrl("file:///Users/abishekramaprabha/Downloads/"+pdfFileName+".pdf")

		WebUI.delay(3)

		String totalFromPdf = WebUI.getText(randomFunctions.convertStringToXpath("//span[contains(text(), 'TOTAL')]//following-sibling::span[2]"))

		WebUI.comment(totalFromPdf)

		totalFromPdf = totalFromPdf.replaceAll("[^a-zA-Z0-9]", "")

		Integer totalFromPdfInt = Integer.parseInt(totalFromPdf)

		System.out.println(totalFromPdfInt)

		if(totalValue==totalFromPdfInt) {

			WebUI.comment("PDF has accurate Total value")

			return true
		}
		else {

			WebUI.comment("PDF has inaccurate Total value")

			return false
		}
	}
}
