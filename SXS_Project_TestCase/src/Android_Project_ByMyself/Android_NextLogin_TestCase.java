package Android_Project_ByMyself;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;

public class Android_NextLogin_TestCase {

	Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	@BeforeMethod
	public void doBefore() throws Exception {
		an.setUp();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		an.driver.quit();
		System.out.println("driver.close");
	}

	@Test(priority = 1)
	public void doTestLoginOne() throws Exception {
		System.out.println(an.driver.getDeviceTime());
		Thread.sleep(3000);
		System.out.println("Start LoginTest……");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).clear();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageLoginSubmitButton")).click();
		AssertJUnit.assertEquals("我的资产", "我的资产");
		System.out.println("登录成功……");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutSureButton")).click();
		System.out.println("退出登录");
	}

	@Test(priority = 2)
	public void doTestLoginTwo() throws Exception {
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageRegisterButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageLoginButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageLoginSubmitButton")).click();
		AssertJUnit.assertEquals("我的资产", "我的资产");
		System.out.println("登录成功");
		System.out.println(an.driver.getDeviceTime());

	}

	@Test(priority = 3)
	public void doLoginOutTest() throws Exception {
		Thread.sleep(3000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutSureButton")).click();
		System.out.println("退出成功……");
		AssertJUnit.assertEquals("首页", "首页");
		an.driver.quit();
	}
}
