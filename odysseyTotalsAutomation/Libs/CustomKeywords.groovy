
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.lang.Integer

import com.kms.katalon.core.testobject.TestObject



def static "odysseyAutomation.registerAccount.funcRegister"(
    	String fName	
     , 	String lName	
     , 	String cName	
     , 	String email	
     , 	String password	) {
    (new odysseyAutomation.registerAccount()).funcRegister(
        	fName
         , 	lName
         , 	cName
         , 	email
         , 	password)
}


def static "odysseyAutomation.registerAccount.funcFillOptionalInformationPage"(
    	String role	
     , 	String employeeCount	
     , 	String country	) {
    (new odysseyAutomation.registerAccount()).funcFillOptionalInformationPage(
        	role
         , 	employeeCount
         , 	country)
}


def static "odysseyAutomation.pdfFunctions.validatePDFValue"(
    	String pdfName	
     , 	Integer totalValue	) {
    (new odysseyAutomation.pdfFunctions()).validatePDFValue(
        	pdfName
         , 	totalValue)
}

 /**
	 * Refresh browser
	 */ 
def static "odysseyAutomation.sampleTest.refreshBrowser"() {
    (new odysseyAutomation.sampleTest()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "odysseyAutomation.sampleTest.clickElement"(
    	TestObject to	) {
    (new odysseyAutomation.sampleTest()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "odysseyAutomation.sampleTest.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new odysseyAutomation.sampleTest()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "odysseyAutomation.editorFunctions.insertFeeTable"() {
    (new odysseyAutomation.editorFunctions()).insertFeeTable()
}


def static "odysseyAutomation.editorFunctions.importValueToFeeTable"() {
    (new odysseyAutomation.editorFunctions()).importValueToFeeTable()
}


def static "odysseyAutomation.editorFunctions.updateCheckboxFeeRow"(
    	String feeName	) {
    (new odysseyAutomation.editorFunctions()).updateCheckboxFeeRow(
        	feeName)
}


def static "odysseyAutomation.editorFunctions.navigateToClientPreview"(
    	String clientName	) {
    (new odysseyAutomation.editorFunctions()).navigateToClientPreview(
        	clientName)
}


def static "odysseyAutomation.editorFunctions.addTotalVariableToProposal"(
    	String newSectionName	) {
    (new odysseyAutomation.editorFunctions()).addTotalVariableToProposal(
        	newSectionName)
}


def static "odysseyAutomation.editorFunctions.navigateToSnapshotFromEditor"() {
    (new odysseyAutomation.editorFunctions()).navigateToSnapshotFromEditor()
}


def static "odysseyAutomation.editorFunctions.addingDiscountToFee"(
    	String feeName	
     , 	String discountPercent	) {
    (new odysseyAutomation.editorFunctions()).addingDiscountToFee(
        	feeName
         , 	discountPercent)
}


def static "odysseyAutomation.login.loginUser"() {
    (new odysseyAutomation.login()).loginUser()
}


def static "odysseyAutomation.login.logoutUser"() {
    (new odysseyAutomation.login()).logoutUser()
}


def static "odysseyAutomation.randomFuctions.randomString"(
    	int count	) {
    (new odysseyAutomation.randomFuctions()).randomString(
        	count)
}


def static "odysseyAutomation.snapshotFunctions.navigateToSnapshotFromEditor"() {
    (new odysseyAutomation.snapshotFunctions()).navigateToSnapshotFromEditor()
}


def static "odysseyAutomation.snapshotFunctions.checkTotalInSnapshotFromClientPreview"() {
    (new odysseyAutomation.snapshotFunctions()).checkTotalInSnapshotFromClientPreview()
}


def static "odysseyAutomation.clientPreviewFunctions.navigateToClientPreviewFromSnapshot"() {
    (new odysseyAutomation.clientPreviewFunctions()).navigateToClientPreviewFromSnapshot()
}


def static "odysseyAutomation.clientPreviewFunctions.clientEditTableValues"() {
    (new odysseyAutomation.clientPreviewFunctions()).clientEditTableValues()
}


def static "odysseyAutomation.clientPreviewFunctions.checkTotalVariable"() {
    (new odysseyAutomation.clientPreviewFunctions()).checkTotalVariable()
}


def static "odysseyAutomation.createProposal.proposalCreation"() {
    (new odysseyAutomation.createProposal()).proposalCreation()
}


def static "odysseyAutomation.navigateToSpecificUrl.navigateToURLPage"(
    	String Url	
     , 	String originalWord	
     , 	String changeWord	) {
    (new odysseyAutomation.navigateToSpecificUrl()).navigateToURLPage(
        	Url
         , 	originalWord
         , 	changeWord)
}


def static "odysseyAutomation.navigateToSpecificUrl.navToUrl"(
    	String toUrl	) {
    (new odysseyAutomation.navigateToSpecificUrl()).navToUrl(
        	toUrl)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}


def static "com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).readLatestEMailBodyContent(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.getEmailsCount"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).getEmailsCount(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.sendEmail"(
    	String from_emailaddress	
     , 	String email_password	
     , 	String to_emailaddress	
     , 	String email_subject	
     , 	String email_body	) {
    (new com.testwithhari.katalon.plugins.Gmail()).sendEmail(
        	from_emailaddress
         , 	email_password
         , 	to_emailaddress
         , 	email_subject
         , 	email_body)
}


def static "com.testwithhari.katalon.plugins.Gmail.deleteAllEMails"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).deleteAllEMails(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "mfa.readMFA.GetMFAToken"(
    	String secret	) {
    (new mfa.readMFA()).GetMFAToken(
        	secret)
}
