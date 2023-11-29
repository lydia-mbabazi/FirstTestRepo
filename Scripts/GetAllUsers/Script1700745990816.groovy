import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

WS.sendRequest(findTestObject('APITEST/GetAllUsers'))

response = WS.sendRequestAndVerify(findTestObject('APITEST/GetAllUsers'))

//WS.verifyElementPropertyValue(response, 'name', 'Clementina DuBuque')

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementsCount(response, 'id', 10)
