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

CustomKeywords.'shop.loginUser1.login'()

String country = findTestData("Data Files/shop/ShopData").getValue(2, 1)
WebUI.click(findTestObject('Object Repository/ShopOnline/MenCheckBox'))

//def productList = WebUI.findWebElements('//div[@class="product"]')

//for (WebElement product : productList) {
	// Click on the "Add to Cart" button for each product
	//WebUI.click(product.find(By.xpath('.//button[text()="Add to Cart"]')), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ShopOnline/AddToCart'))
	
WebUI.click(findTestObject('Object Repository/ShopOnline/CartOption'))

WebUI.click(findTestObject('Object Repository/ShopOnline/CheckOut'))

WebUI.setText(findTestObject('Object Repository/ShopOnline/Country'), country)

WebUI.click(findTestObject('Object Repository/ShopOnline/Rwanda'))

WebUI.click(findTestObject('Object Repository/ShopOnline/PlaceOrderButton'))

WebUI.delay(5)

//WebUI.closeBrowser()

