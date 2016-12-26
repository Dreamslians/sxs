package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/23.
 */

    public  class Android_ChangeBindingPage extends BasePage
    {
        public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
        
        public void doSetting() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
        }

        public void doSettingPageResetPhone() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhone")).click();
        }

        public void doSettingPageResetPhoneInputPassword(String password) throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputPassword")).clear();
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputPassword")).sendKeys(password);
        }

        public void doSettingPageResetPhoneNextStep() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneNextStep")).click();
        }

        public void doSettingPageResetPhoneGetVerifyCode() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneGetVerifyCode")).click();
        }

        public void doSettingPageResetPhoneInputVerifyCode(String VerifyCode) throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputVerifyCode")).clear();
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputVerifyCode")).sendKeys(VerifyCode);
        }

        public void doSettingPageResetPhoneNextStepForInputVerifyCode() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneNextStepForInputVerifyCode")).click();
        }

        public void doSettingPageResetPhoneInputNewTelephone(String NewTelephone) throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputNewTelephone")).clear();
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneInputNewTelephone")).sendKeys(NewTelephone);
        }

        public void doSettingPageResetPhoneNewTelephoneByGetVerifyCode() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneNewTelephoneByGetVerifyCode")).click();
        }

        public void doSettingPageResetPhoneNewVerifyCode(String NewVerifyCode) throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneNewVerifyCode")).clear();
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneNewVerifyCode")).sendKeys(NewVerifyCode);
        }

        public void doSettingPageResetPhoneFinshButton() throws Exception {
            Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneFinshButton")).click();
        }


        public void doChangeBindingTelephone(String password) throws Exception {
            doSetting();
            Thread.sleep(500);
            doSettingPageResetPhone();
            doSettingPageResetPhoneInputPassword(password);
            Thread.sleep(300);
            doSettingPageResetPhoneNextStep();
            Thread.sleep(500);
            doSettingPageResetPhoneGetVerifyCode();
            Thread.sleep(1000);
        }
        public void doChangeBildingByMixCase(String password) throws Exception{
            Thread.sleep(500);
            doSettingPageResetPhone();
            doSettingPageResetPhoneInputPassword(password);
            Thread.sleep(300);
            doSettingPageResetPhoneNextStep();
            Thread.sleep(500);
            doSettingPageResetPhoneGetVerifyCode();
            Thread.sleep(1000);
        }

        public void doChangeBildingTelephoneBySendverifyCode(String VerifyCode, String NewTelephone) throws Exception {
            doSettingPageResetPhoneInputVerifyCode(VerifyCode);
            Thread.sleep(300);
            doSettingPageResetPhoneNextStepForInputVerifyCode();
            Thread.sleep(300);
            doSettingPageResetPhoneInputNewTelephone(NewTelephone);
            doSettingPageResetPhoneNewTelephoneByGetVerifyCode();
            Thread.sleep(1000);
        }

        public void doChangeBildingTelephoneBySendNewVerifyCode(String NewVerifyCode) throws Exception {
            doSettingPageResetPhoneNewVerifyCode(NewVerifyCode);
            Thread.sleep(300);
            doSettingPageResetPhoneFinshButton();
            Thread.sleep(500);
        }


    }
