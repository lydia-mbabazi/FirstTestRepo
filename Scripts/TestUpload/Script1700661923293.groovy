import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.dia-pen.hr/orbicon/3rdParty/rad-plus/test.html')
WebUI.maximizeWindow()

def filePath = RunConfiguration.getProjectDir()

println(filePath)
 String path = filePath + '/Data Files/FILE1.txt'
 println(path)
 String finalPath = path.replace('/', '\\')
 println(finalPath)

//defining path 2
  String path2 = filePath + '/Data Files/FILE2.txt'
  println(path2)
  String finalPath2 = path2.replace('/', '\\')
  println(finalPath2)
  
  //definig path 3
  String path3 = filePath + '/Data Files/FILE3.txt'
  println(path3)
  String finalPath3 = path2.replace('/', '\\')
  println(finalPath3)
  
  WebUI.verifyElementClickable(findTestObject('UploadThreeFiles/File1'), FailureHandling.STOP_ON_FAILURE)
  
  WebUI.click(findTestObject('UploadThreeFiles/File1'))
  //CustomKeywords.'urubuto_upload.upload.uploadFile'(findTestObject('Object Repository/UploadThreeFiles/File1'), finalPath)
  
  
  //CustomKeywords.'urubuto_upload.upload.uploadFile'(findTestObject('Object Repository/UrubutoUpload/UploadButton'), finalPath2)
  
  
  //CustomKeywords.'urubuto_upload.upload.uploadFile'(findTestObject('Object Repository/UrubutoUpload/UploadButton'), finalPath3)