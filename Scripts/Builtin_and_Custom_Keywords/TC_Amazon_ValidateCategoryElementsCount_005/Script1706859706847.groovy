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

//@setup WebUI.openBrowser('')
/*@beforetestcase
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.maximizeWindow()
*/
//@test
WebUI.waitForElementPresent(findTestObject('AmazonPages/Amazon_ValidateCategoryElementsCount_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    0)

int manualCount = 28

int automatedTestCount = CustomKeywords.'com.qa.test.customFunctions.GetDropDownListElementCount'(findTestObject('AmazonPages/Amazon_ValidateCategoryElementsCount_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'))

if (manualCount == automatedTestCount) {
    System.out.println('Validation of Category dropdown list Elements Count Successful')
}

//@teardown WebUI.closeBrowser()
