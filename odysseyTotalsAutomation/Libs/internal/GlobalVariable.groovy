package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : RC Candidate URL</p>
     */
    public static Object urlToTest
     
    /**
     * <p>Profile default : Account for Odyssey Automation</p>
     */
    public static Object loginUName
     
    /**
     * <p>Profile default : PWD for Odyssey Automation</p>
     */
    public static Object loginPassword
     
    /**
     * <p></p>
     */
    public static Object editorTotalWidget
     
    /**
     * <p></p>
     */
    public static Object clientPreviewTotal
     
    /**
     * <p></p>
     */
    public static Object proposalName
     
    /**
     * <p></p>
     */
    public static Object feeTableTotal
     
    /**
     * <p></p>
     */
    public static Object variableTotal
     
    /**
     * <p></p>
     */
    public static Object dashboardUrl
     
    /**
     * <p></p>
     */
    public static Object snapshotUrl
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            urlToTest = selectedVariables['urlToTest']
            loginUName = selectedVariables['loginUName']
            loginPassword = selectedVariables['loginPassword']
            editorTotalWidget = selectedVariables['editorTotalWidget']
            clientPreviewTotal = selectedVariables['clientPreviewTotal']
            proposalName = selectedVariables['proposalName']
            feeTableTotal = selectedVariables['feeTableTotal']
            variableTotal = selectedVariables['variableTotal']
            dashboardUrl = selectedVariables['dashboardUrl']
            snapshotUrl = selectedVariables['snapshotUrl']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
