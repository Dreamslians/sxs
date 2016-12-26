package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_PayPasswordPage;
import org.testng.annotations.Test;

public class Android_PayPasswordPage_TestCase extends BasePage
{

    Android_PayPasswordPage ap = new Android_PayPasswordPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test
    public void SettingPayPassword() throws Exception
    {
        System.out.println("Android_PayPasswordPage_TestCase……开始运行……");
        try
        {
            pl.doLoginByJump(Baseinfo.PayPWTelephone, Baseinfo.PayPWPassword);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInusePayPWPage().contains("1"))
        {
            try
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
            } catch (Exception e)
            {
                System.out.println("Android_PayPasswordPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.PayPWTelephone);
                System.out.println("**********************失败********************");
            }
        } else
        {
            System.out.println("失败");
        }

    }
}
