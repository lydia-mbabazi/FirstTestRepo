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

WebUI.navigateToUrl('https://bankofkigalirw.sharepoint.com/sites/BKCULTUREHUB')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

//bUI.click(findTestObject('Object Repository/Page_Google/center'))

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_q'), 'test')

WebUI.click(findTestObject('Object Repository/Page_test - Google Search/h3_Test Definition  Meaning'))

WebUI.setText(findTestObject('Object Repository/Page_Test Definition  Meaning - Merriam-Webster/inputsearch-term'), 'test case')

WebUI.click(findTestObject('Object Repository/Page_Test Definition  Meaning - Merriam-Webster/svg_svg replaced-svg align-middle'))

