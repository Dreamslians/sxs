package Android_Project_ByMyself;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Android_Project_Data.Android_LoadDevice_Reset;
import Android_Project_ExPage.Android_Element_ObjectMap;
import io.appium.java_client.android.AndroidDriver;

public class Android_FirstLogin_TestCase {

	Android_LoadDevice_Reset an = new Android_LoadDevice_Reset();

	@BeforeMethod
	public void doBefore() throws Exception {
		an.setUp();
	}

	@AfterMethod
	public void teardown() {
		an.driver.quit();
	}

	@Test
	public void dologin() throws Exception {

		Thread.sleep(5000);
		swipeToLeft(an.driver, 1000);
		Thread.sleep(2000);
		swipeToLeft(an.driver, 1000);
		Thread.sleep(2000);
		swipeToLeft(an.driver, 1000);
		Thread.sleep(2000);
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/button")).click();
		Thread.sleep(1000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageLoginSubmitButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutSureButton")).click();
	}

	public void swipeToLeft(AndroidDriver driver, int time) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, 300);
	}
}
