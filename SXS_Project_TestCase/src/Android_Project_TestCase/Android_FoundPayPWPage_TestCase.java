package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_FoundPayPWPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_FoundPayPWPage_TestCase
{

    Android_FoundPayPWPage af = new Android_FoundPayPWPage();

    PublicLoginPage pl = new PublicLoginPage();

    PublicLoginOutPage po = new PublicLoginOutPage();

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        af.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void doFoundPayPWTest() throws Exception
    {
        System.out.println("Android_FoundPayPWPage_TestCase……开始运行……");
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
                af.FoundPayPWTestBySendTelephone(Baseinfo.PayPWTelephone);
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
            } catch (Exception e)
            {
                System.out.println("Android_FoundPayPWPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.PayPWTelephone);
                System.out.println("*********************失败*******************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
