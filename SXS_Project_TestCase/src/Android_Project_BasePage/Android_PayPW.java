package Android_Project_BasePage;

import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_PayPasswordPage;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Android_PayPW extends BasePage
{
    Android_PayPasswordPage ap = new Android_PayPasswordPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {

        ap.SendPassWord();
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
        ap.doSettingPageSetPasswordSubmitButton();
        po.doLoginOutBySetPage();
        System.out.println("Android_PayPasswordPage_TestCase……运行成功……");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        Thread.sleep(100);
        pl.doUserButton();

        ap.SendPassWord();
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
        ap.doSettingPageSetPasswordSubmitButton();
        po.doLoginOutBySetPage();
        System.out.println("Android_PayPasswordPage_TestCase……运行成功……");
    }
}
