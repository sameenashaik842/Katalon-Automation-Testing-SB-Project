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

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon Sign-In/input_email'), 
    '8688410244')

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon Sign-In/input_password'), 
    'trwX9ClwwJzqcxxckJfIhw==')

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon Sign-In/inputsignInSubmit'))
*/

//@test
WebUI.setText(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    item)

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com  samsung galaxy a54 5g phone/span_SAMSUNG Galaxy A54 5G A Series Cell Ph_6b2531'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com SAMSUNG Galaxy A54 5G A Ser_1bc85d/input_submit.add-to-cart'))

WebUI.verifyElementText(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com Shopping Cart/span_Added to Cart'), 
    'Added to Cart')

/*@aftertestcase
WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com Shopping Cart/a_All'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_ValidateAddtoCart(Record)_OR/Page_Amazon.com Shopping Cart/a_Sign Out'))
*/

//@teardown WebUI.closeBrowser()

