package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_GesturePasswordPage;
import io.appium.java_client.TouchAction;
import org.testng.annotations.Test;

public class Android_GesturePasswordPage_TestCase extends BasePage
{
	Android_GesturePasswordPage ag = new Android_GesturePasswordPage();
	PublicLoginPage pl = new PublicLoginPage();

	@Test
	public void doGesturePasswordTest() throws Exception {
		int width = Android_LoadDevice_NotReset.driver.manage().window().getSize().width;
		int height = Android_LoadDevice_NotReset.driver.manage().window().getSize().height;
		pl.doLoginByJump("17301216027", "qqqqqq");
		ag.doGesturePW();
//		TouchAction TA = new TouchAction(Android_LoadDevice_NotReset.driver).press(width / 5, height / 5 * 2)
//				.waitAction(500).moveTo(width / 5 * 2, height / 5 * 2).waitAction(500)
//				.moveTo(width / 5 * 3, height / 5 * 2).waitAction(500).moveTo(width / 5 * 3, height / 5 * 3)
//				.waitAction(500).release();
//		TA.perform();
//		TouchAction TA1 = new TouchAction(Android_LoadDevice_NotReset.driver).press(150, 495).waitAction(10)
//				.moveTo(350, 495).waitAction(10).moveTo(550, 495).waitAction(10).moveTo(550, 700).waitAction(10)
//				.release();
//		TA1.perform();
        TouchAction TA = new TouchAction(Android_LoadDevice_NotReset.driver).press(Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index, '6')]")).waitAction(500).moveTo(Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index, '7')]")).waitAction(500).moveTo(Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index, '8')]")).waitAction(500).moveTo(Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index, '5')]")).waitAction(500).moveTo(Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index, '4')]")).release();
        TA.perform();

	}
}
