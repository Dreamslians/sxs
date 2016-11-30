package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_FoundPayPWPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSetPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPassword")).click();
    }

    public void doSettingPageSetPasswordForgotpw() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordForgotpw")).click();
    }

    public void doFoundPasswordPageTelephone(String Telephone) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageTelephone")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageTelephone")).sendKeys(Telephone);
    }

    public void doFoundPasswordPageGetCode() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageGetCode")).click();
    }

    public void doFoundPasswordPageInputCode(String Code) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).sendKeys(Code);
    }

    public void doFoundPasswordPageNextPageButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageNextPageButton")).click();
    }

    public void doSettingPageSetPasswordNewSureSubmit() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordNewSureSubmit")).click();
    }

    public void doSettingPageSetPasswordNewSureSubitFinsh() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordNewSureSubitFinsh")).click();
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
