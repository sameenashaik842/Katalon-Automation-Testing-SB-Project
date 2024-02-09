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
WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()
*/

//@test
WebUI.click(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.verifyElementClickable(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/input_email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/input_email'), '8688410244')

WebUI.click(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/inputcontinue'))

WebUI.verifyElementClickable(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/input_password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/input_password'), 'trwX9ClwwJzqcxxckJfIhw==')

WebUI.click(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.waitForElementPresent(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, Sameena'), 
    0)

WebUI.verifyElementText(findTestObject('AmazonPages/Amazon_Login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, Sameena'), 
    'Hello, Sameena')

//@teardown WebUI.closeBrowser()

