package Android_Project_BasePage;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_FoundPayPWPage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_FoundPayPW extends BasePage
{
    Android_FoundPayPWPage af = new Android_FoundPayPWPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        af.FoundPayPWTestBySendTelephone(Baseinfo.LoginTelephoneNumber);
        Thread.sleep(300);
        af.FoundPayPWTestBySendCode(ag.GetVerifyByFoundPayPWPage());

        Thread.sleep(300);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);

        af.doSettingPageSetPasswordNewSureSubmit();

        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);

        af.doSettingPageSetPasswordNewSureSubitFinsh();

        po.doLoginOutBySetPage();
        System.out.println("Android_FoundPayPWPage_TestCase……运行成功……");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        pl.doUserButton();
        af.FoundPayPWTestBySendTelephone(Baseinfo.LoginTelephoneNumber);
        Thread.sleep(300);
        af.FoundPayPWTestBySendCode(ag.GetVerifyByFoundPayPWPage());

        Thread.sleep(300);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);

        af.doSettingPageSetPasswordNewSureSubmit();

        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);

        af.doSettingPageSetPasswordNewSureSubitFinsh();

        po.doLoginOutBySetPage();
        System.out.println("Android_FoundPayPWPage_TestCase……运行成功……");
    }

}
