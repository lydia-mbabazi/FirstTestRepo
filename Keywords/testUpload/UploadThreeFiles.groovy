package testUpload

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI





public class UploadThreeFiles {
	@Keyword
	def uploadFile (TestObject to, String filePath) {
		try {
			WebUI.click(to)
			StringSelection ss = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
 //		   robot.keyPress(KeyEvent.VK_ENTER);
 //		   robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (Exception e) {
			e.printStackTrace()
		}
	}
	@Keyword
	def uploadFile2 (TestObject to, String filePath) {
		try {
			WebUI.click(to)
			StringSelection ss = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
 //		   robot.keyPress(KeyEvent.VK_ENTER);
 //		   robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (Exception e) {
			e.printStackTrace()
		}
	}
	@Keyword
	def uploadFile3 (TestObject to, String filePath) {
		try {
			WebUI.click(to)
			StringSelection ss = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
 //		   robot.keyPress(KeyEvent.VK_ENTER);
 //		   robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000); //Millisecond 1 second delay only if needed
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (Exception e) {
			e.printStackTrace()
		}
	}
	
}
