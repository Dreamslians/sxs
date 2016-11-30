package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ChangePayPWPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_ChangePWPage_TestCase
{

    Android_ChangePayPWPage ac = new Android_ChangePayPWPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        ac.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void doChangePayPWTest() throws Exception
    {
        System.out.println("Android_Project_ChangePWPage_TestCase开始运行");
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
                ac.doChangePayPW();

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
                ac.doSettingPageSetPasswordNewSure();
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
                Thread.sleep(500);
                ac.doSettingPageSetPasswordNewSureSubmit();

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
                ac.doSettingPageSetPasswordNewSureSubitFinsh();

                po.doLoginOutBySetPage();
                System.out.println("Android_ChangePWPage_TestCase……运行成功……");
            } catch (Exception e)
            {
                System.out.println("Android_ChangePWPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.print("退出当前登录账号" + Baseinfo.PayPWTelephone);
                System.out.println("*********************失败*********************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
