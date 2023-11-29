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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/9766f6af-73b8-40a2-8694-ede49d30d84e/oauth2/authorize?client%5Fid=00000003%2D0000%2D0ff1%2Dce00%2D000000000000&response%5Fmode=form%5Fpost&response%5Ftype=code%20id%5Ftoken&resource=00000003%2D0000%2D0ff1%2Dce00%2D000000000000&scope=openid&nonce=24E6C2EA1D3CBE574C605D5BC014A442DA45B270CB10207F%2DE60210E0F9745212782098EBD7532084CBFC2AB0D495D9A9253258AA1F89AE45&redirect%5Furi=https%3A%2F%2Fbankofkigalirw%2Esharepoint%2Ecom%2F%5Fforms%2Fdefault%2Easpx&state=OD0w&claims=%7B%22id%5Ftoken%22%3A%7B%22xms%5Fcc%22%3A%7B%22values%22%3A%5B%22CP1%22%5D%7D%7D%7D&wsucxt=1&cobrandid=11bd8083%2D87e0%2D41b5%2Dbb78%2D0bc43c8a8e8a&client%2Drequest%2Did=77c0eba0%2Da0b3%2D7000%2D9689%2Dc49c0da57501')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_loginfmt'), 'l.mbabazi')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/inputidSIButton9'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_loginfmt'), 'l.mbabazi@bk.rw')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/inputidSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_passwd'), '6Rho/qMdj1dSEs+ShxP+cQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/inputidSIButton9'))

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/inputidSIButton9'))

