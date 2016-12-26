package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_PayPasswordPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSetPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPassword")).click();
    }

    public void doSettingPageSetPasswordInputOne() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputOne")).clear();
        // an.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputOne")).sendKeys(One);
    }

    public void doSettingPageSetPasswordInputTwo(String Two) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputTwo")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputTwo")).sendKeys(Two);
    }

    public void doSettingPageSetPasswordInputThree(String Three) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputThree")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputThree"))
                .sendKeys(Three);
    }

    public void doSettingPageSetPasswordInputFour(String Four) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputFour")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputFour"))
                .sendKeys(Four);
    }

    public void doSettingPageSetPasswordInputFive(String Five) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputFive")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputFive"))
                .sendKeys(Five);
    }

    public void doSettingPageSetPasswordInputSis(String Sis) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputSis")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordInputSis")).sendKeys(Sis);
    }

    public void doSettingPageSetPasswordSubmitButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordSubmitButton")).click();
    }


    public void SendPassWord() throws Exception {
        doMyPageUserSettingButton();
        doSettingPageSetPassword();
        Thread.sleep(500);
    }
}
