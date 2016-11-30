package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_PayPasswordPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSetPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPassword")).click();
    }

    public void doSettingPageSetPasswordInputOne() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputOne")).clear();
        // an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputOne")).sendKeys(One);
    }

    public void doSettingPageSetPasswordInputTwo(String Two) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputTwo")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputTwo")).sendKeys(Two);
    }

    public void doSettingPageSetPasswordInputThree(String Three) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputThree")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputThree"))
                .sendKeys(Three);
    }

    public void doSettingPageSetPasswordInputFour(String Four) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFour")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFour"))
                .sendKeys(Four);
    }

    public void doSettingPageSetPasswordInputFive(String Five) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFive")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFive"))
                .sendKeys(Five);
    }

    public void doSettingPageSetPasswordInputSis(String Sis) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputSis")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputSis")).sendKeys(Sis);
    }

    public void doSettingPageSetPasswordSubmitButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordSubmitButton")).click();
    }


    public void SendPassWord() throws Exception {
        doMyPageUserSettingButton();
        doSettingPageSetPassword();
        Thread.sleep(500);
    }
}
