package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_FoundPayPWPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSetPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPassword")).click();
    }

    public void doSettingPageSetPasswordForgotpw() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordForgotpw")).click();
    }

    public void doFoundPasswordPageTelephone(String Telephone) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageTelephone")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageTelephone")).sendKeys(Telephone);
    }

    public void doFoundPasswordPageGetCode() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageGetCode")).click();
    }

    public void doFoundPasswordPageInputCode(String Code) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageInputCode")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageInputCode")).sendKeys(Code);
    }

    public void doFoundPasswordPageNextPageButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageNextPageButton")).click();
    }

    public void doSettingPageSetPasswordNewSureSubmit() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordNewSureSubmit")).click();
    }

    public void doSettingPageSetPasswordNewSureSubitFinsh() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageSetPasswordNewSureSubitFinsh")).click();
    }

    public void FoundPayPWTestBySendTelephone(String Telephone) throws Exception {
        doMyPageUserSettingButton();
        doSettingPageSetPassword();
        doSettingPageSetPasswordForgotpw();
        doFoundPasswordPageTelephone(Telephone);
        doFoundPasswordPageGetCode();
    }
    public void FoundPayPWByMixCase(String Telephone) throws Exception{
        doSettingPageSetPassword();
        doSettingPageSetPasswordForgotpw();
        doFoundPasswordPageTelephone(Telephone);
        doFoundPasswordPageGetCode();
    }

    public void FoundPayPWTestBySendCode(String Code) throws Exception {
        doFoundPasswordPageInputCode(Code);
        doFoundPasswordPageNextPageButton();
    }
}
