package Android_Project_ExPage;

public class PublicLoginOutPage {
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doJumpButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("JumpButton")).click();
    }

    public void doUserButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("UserButton")).click();
    }

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSignOutButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSignOutButton")).click();
    }

    public void doSettingPageSignOutSureButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSignOutSureButton")).click();
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
        Thread.sleep(300);
        doMyPageUserSettingButton();
        doSettingPageSignOutButton();
        doSettingPageSignOutSureButton();
    }
}
