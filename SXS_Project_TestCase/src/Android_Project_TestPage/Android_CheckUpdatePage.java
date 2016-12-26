package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import org.junit.Assert;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_CheckUpdatePage extends BasePage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	public void doSetting() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageVersionUpdate() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageVersionUpdate")).click();
	}

	public void doSettingPageVersionUpdateSure() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageVersionUpdateSure")).click();
	}

	public void doSettingPageVersionUpdateSureUpdate() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageVersionUpdateSureUpdate")).click();
	}


	public void doCheckUpdateByNoUpdate() throws Exception {
		doSetting();
		doSettingPageVersionUpdate();
		Thread.sleep(300);
		doSettingPageVersionUpdateSure();
	}

	public void doCheckUpdateByHaveUpdate() throws Exception {
		doSetting();
		doSettingPageVersionUpdate();
		Thread.sleep(300);
		Assert.assertEquals("立即更新",
				Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageVersionUpdateSureUpdate")).getText());
		doSettingPageVersionUpdateSureUpdate();
	}
}