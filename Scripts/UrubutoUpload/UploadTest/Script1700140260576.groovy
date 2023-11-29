import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Specify the file path on your local machine
def filePath = RunConfiguration.getProjectDir() 

println(filePath)
 String path = filePath + '/Data Files/UrubutoTest.xlsx' 
 println(path)
 String finalPath = path.replace('/', '\\')
 println(finalPath)
CustomKeywords.'urubuto_upload.upload.login'()

WebUI.click(findTestObject('Object Repository/UrubutoUpload/StudentManagement'))


WebUI.click(findTestObject('Object Repository/UrubutoUpload/UploadStudents'))

//WebUI.click(findTestObject('Object Repository/UrubutoUpload/selectCampus'))

WebUI.sendKeys(findTestObject('Object Repository/UrubutoUpload/selectCampus'), 'Test Campus'+ '\n')

WebUI.click(findTestObject('Object Repository/UrubutoUpload/selectDepartment'))

WebUI.sendKeys(findTestObject('Object Repository/UrubutoUpload/selectDepartment'), 'Test Department'+ '\n')

// Click the "Upload" button to trigger the file input element
//WebUI.click(findTestObject('Object Repository/UrubutoUpload/UploadButton'))

CustomKeywords.'urubuto_upload.upload.uploadFile'(findTestObject('Object Repository/UrubutoUpload/UploadButton'), finalPath)

//File f= new File("C:/Users/l.mbabazi/Downloads/UrubutoTest.xlsx")

//WebUI.click(findTestObject(''))

// Wait for the file input element to be present (adjust the timeout accordingly)
//WebUI.waitForElementPresent(findTestObject('Your/Page/Object Repository/Your_File_Input'), 10)
//
// Identify the file input element using the Object Repository
//def fileInput = findTestObject('Object Repository/UrubutoUpload/File')
//

// Upload the file using the 'Upload File' keyword
//WebUI.uploadFile(findTestObject('Test Cases/UrubutoUpload/UploadTest'), 'C:/Users/l.mbabazi/Downloads/UrubutoTest.xlsx')

// Set the path to the .xlsx file you want to upload
//String filePath = "C:/Users/l.mbabazi/Downloads/UrubutoTest.xlsx"

// Set the test object for the file input element
//TestObject fileInput = findTestObject('YourTestObject') // Replace 'YourTestObject' with the actual Test Object details

// Upload the file
//WebUI.uploadFile(fileInput, filePath)

//'Uploading the File using Send Keys method by passing the File path'
//WebUI.sendKeys(findTestObject('Upload File'), 'C:\\\\Users\\\\Public\\\\Pictures\\\\Sample Pictures\\\\Desert.jpg')
 

