package Android_Project_ExPage;

import Android_Project_Data.BasePage;

public class PublicLoginOutPage extends BasePage{

    public void doJumpButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
    }

    public void doUserButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSignOutButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutButton")).click();
    }

    public void doSettingPageSignOutSureButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSignOutSureButton")).click();
    }

    public void doLoginOutBySetPage() throws Exception {
        doSettingPageSignOutButton();
        doSettingPageSignOutSureButton();
    }

    public void doLoginOutByUserPage() throws Exception {
        Thread.sleep(300);
        doMyPageUserSettingButton();
        doSettingPageSignOutButton();
        doSettingPageSignOutSureButton();
    }

    public void doLoginOutByResetApp() throws Exception {
        doJumpButton();
        doUserButton();
        Thread.sleep(500);
        doMyPageUserSettingButton();
        doSettingPageSignOutButton();
        doSettingPageSignOutSureButton();
    }
}
