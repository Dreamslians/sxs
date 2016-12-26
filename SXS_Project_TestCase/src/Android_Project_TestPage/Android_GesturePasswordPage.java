package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_GesturePasswordPage extends BasePage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	public void doSetting() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageGesturePassword() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageGesturePassword")).click();
	}

	public void doGesturePW() throws Exception {
		Thread.sleep(500);
		doSetting();
		doSettingPageGesturePassword();
	}
}
