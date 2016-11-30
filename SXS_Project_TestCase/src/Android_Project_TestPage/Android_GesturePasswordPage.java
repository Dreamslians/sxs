package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_GesturePasswordPage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
	public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	public void doSetting() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageGesturePassword() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageGesturePassword")).click();
	}

	public void doGesturePW() throws Exception {
		Thread.sleep(500);
		doSetting();
		doSettingPageGesturePassword();
	}
}
