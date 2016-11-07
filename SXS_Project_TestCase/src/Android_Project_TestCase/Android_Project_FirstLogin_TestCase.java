package Android_Project_TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Android_Project_Data.Android_Project_Reset;
import Android_Project_ExPage.Android_Element_ObjectMap;
import io.appium.java_client.android.AndroidDriver;

public class Android_Project_FirstLogin_TestCase {

	Android_Project_Reset an = new Android_Project_Reset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

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
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
		an.driver.findElement(ao.getLocaator("HomePageButton")).click();
		an.driver.findElement(ao.getLocaator("ProductButton")).click();
		an.driver.findElement(ao.getLocaator("FoundButton")).click();
		an.driver.findElement(ao.getLocaator("UserButton")).click();

		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(ao.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(ao.getLocaator("LoginPageLoginSubmitButton")).click();

		an.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
		an.driver.findElement(ao.getLocaator("SettingPageSignOutButton")).click();
		an.driver.findElement(ao.getLocaator("SettingPageSignOutSureButton")).click();
	}

	public void swipeToLeft(AndroidDriver driver, int time) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, 300);
	}

}
