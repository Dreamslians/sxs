package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_ChangeLoginPWPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doSetting() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageRevampPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageRevampPassword")).click();
    }

    public void doChangeLoginPWOldPW(String OldPassword) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWOldPW")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWOldPW")).sendKeys(OldPassword);
    }

    public void doChangeLoginPWNewPW(String NewPW) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWNewPW")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWNewPW")).sendKeys(NewPW);
    }

    public void doChangeLoginPWNewPWAgain(String NewPWAgain) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWNewPWAgain")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWNewPWAgain")).sendKeys(NewPWAgain);
    }

    public void doChangeLoginPWSubmitButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ChangeLoginPWSubmitButton")).click();
    }

    public void doChangePassWord(String OldPassword, String NewPW, String NewPWAgain) throws Exception {
        doSetting();
        doSettingPageRevampPassword();
        doChangeLoginPWOldPW(OldPassword);
        doChangeLoginPWNewPW(NewPW);
        doChangeLoginPWNewPWAgain(NewPWAgain);
        doChangeLoginPWSubmitButton();
        Thread.sleep(1000);
    }
    public void doChangePW(String OldPassword, String NewPW, String NewPWAgain) throws Exception{
        doSettingPageRevampPassword();
        doChangeLoginPWOldPW(OldPassword);
        doChangeLoginPWNewPW(NewPW);
        doChangeLoginPWNewPWAgain(NewPWAgain);
        doChangeLoginPWSubmitButton();
        Thread.sleep(1000);
    }
}
