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

boolean loginUserResult = CustomKeywords.'odysseyAutomation.login.loginUser'()

if(loginUserResult == true)
{
	WebUI.comment("User login successful")
	assert true

}
else {
	WebUI.comment("User login not successful")
	assert false
}

WebUI.delay(3)

WebUI.waitForPageLoad(10)

//proposal creation
boolean proposalCreationResult = CustomKeywords.'odysseyAutomation.createProposal.proposalCreation'()

if(proposalCreationResult == true)
{
	WebUI.comment("Proposal creation successful")
	assert true

}
else {
	WebUI.comment("Proposal creation not successful")
	assert false
}

WebUI.delay(3)

//inserting table
boolean feeTableInsertionResult = CustomKeywords.'odysseyAutomation.editorFunctions.insertFeeTable'()

if(feeTableInsertionResult == true)
{
	WebUI.comment("Fee table insertion successful")
	assert true
		
}
else {
	WebUI.comment("Fee table insertion not successful")
	assert false
}

//importing value to fee table
boolean feeValueImportResult = CustomKeywords.'odysseyAutomation.editorFunctions.importValueToFeeTable'()

if(feeValueImportResult == true)
{
	WebUI.comment("Fee value import successful")
	assert true
		
}
else {
	WebUI.comment("Fee value import not successful")
	assert false
}



//adding total variable to the proposal
boolean addTotalVariableResult = CustomKeywords.'odysseyAutomation.editorFunctions.addTotalVariableToProposal'("Variables")

if(addTotalVariableResult == true)
{
	WebUI.comment("Total variable added successful")
	assert true
		
}
else {
	WebUI.comment("Total variable not added successful")
	assert false
}


//update fee row and check total accuracy
boolean feeRowUpdateResult = CustomKeywords.'odysseyAutomation.editorFunctions.updateCheckboxFeeRow'("Unit fee")

if(feeRowUpdateResult == true)
{
	WebUI.comment("Fee row update successful")
	assert true
		
}
else {
	WebUI.comment("Fee row update not successful")
	assert false
}


//add discount to fee row and check total accuracy
boolean addDiscountResult = CustomKeywords.'odysseyAutomation.editorFunctions.addingDiscountToFee'("Flat fee", "10")

if(addDiscountResult == true)
{
	WebUI.comment("Discount addition is successful")
	assert true
		
}
else {
	WebUI.comment("Discount addition is not successful")
	assert false
}



//navigate to snapshot page and check total accuracy
boolean navigateToSnapshotAndTotalAccuracyResult = CustomKeywords.'odysseyAutomation.editorFunctions.navigateToSnapshotFromEditor'()

if(navigateToSnapshotAndTotalAccuracyResult == true)
{
	WebUI.comment("Total in snapshot page is accurate and successful")
	assert true
		
}
else {
	WebUI.comment("Total in snapshot page is not accurate and not successful")
	assert false
}




//navigate to client preview page
boolean navigateToClientPreviewResult = CustomKeywords.'odysseyAutomation.editorFunctions.navigateToClientPreview'("John Doe")

if(navigateToClientPreviewResult == true)
{
	WebUI.comment("Client Preview page navigation successful")
	assert true
		
}
else {
	WebUI.comment("Client Preview page navigation not successful")
	assert false
}


//validate total variable in client preview page before any client update
boolean totalVariableClientPreviewResult = CustomKeywords.'odysseyAutomation.clientPreviewFunctions.checkTotalVariable'()

if(totalVariableClientPreviewResult == true)
{
	WebUI.comment("Total variable is accurate in client preview page")
	assert true
		
}
else {
	WebUI.comment("Total variable is inaccurate in client preview page")
	assert false
}



//total verification in client preview
boolean clientPreviewTotalResult = CustomKeywords.'odysseyAutomation.clientPreviewFunctions.clientEditTableValues'()

if(clientPreviewTotalResult == true)
{
	WebUI.comment("Client preview has accurate total value")
	assert true
		
}
else {
	WebUI.comment("Client preview doesn't have accurate total value")
	assert false
}

//again login to verify total in snapshot page
boolean loginUserAgainResult = CustomKeywords.'odysseyAutomation.login.loginUser'()

if(loginUserAgainResult == true)
{
	WebUI.comment("User login successful")
	assert true

}
else {
	WebUI.comment("User login not successful")
	assert false
}


//total verification in snapshot page after signing proposal
boolean snapshotTotalResult = CustomKeywords.'odysseyAutomation.snapshotFunctions.checkTotalInSnapshotFromClientPreview'()

if(snapshotTotalResult == true)
{
	WebUI.comment("Total is accurate in the snapshot page after proposal sign")
	assert true
		
}
else {
	WebUI.comment("Total is not accurate in the snapshot page after proposal sign")
	assert false
}

//logout the user
boolean logoutResult = CustomKeywords.'odysseyAutomation.login.logoutUser'()

if(logoutResult == true)
{
	WebUI.comment("User is logged out successfully")
	assert true
		
}
else {
	WebUI.comment("User is not logged out successfully")
	assert false
}


WebUI.closeBrowser()