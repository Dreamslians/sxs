package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_IdentityAuthenticationPage extends BasePage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	public void doSetting() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageIdentityAuthentication() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthentication")).click();
	}

	public void doSettingPageIdentityAuthenticationUserName(String Username) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationUserName"))
				.clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationUserName"))
				.sendKeys(Username);
	}

	public void doSettingPageIdentityAuthenticationNumber(String Number) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationNumber"))
				.clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationNumber"))
				.sendKeys(Number);
	}

	public void doSettingPageIdentityAuthenticationSubmit() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationSubmit"))
				.click();
	}

	public void doSettingPageIdentityAuthenticationSureSubmit() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageIdentityAuthenticationSureSubmit"))
				.click();
	}

	public void doSettingPageIdentityAuthenticationTest(String Username, String Number) throws Exception {
		doSetting();
		Thread.sleep(1000);
		doSettingPageIdentityAuthentication();
		doSettingPageIdentityAuthenticationUserName(Username);
		doSettingPageIdentityAuthenticationNumber(Number);
		doSettingPageIdentityAuthenticationSubmit();
		Thread.sleep(500);
		doSettingPageIdentityAuthenticationSureSubmit();
		Thread.sleep(300);
	}
}
