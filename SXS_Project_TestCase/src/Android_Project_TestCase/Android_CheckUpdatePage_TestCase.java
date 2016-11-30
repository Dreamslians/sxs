package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_CheckUpdatePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_CheckUpdatePage_TestCase
{

    Android_CheckUpdatePage ac = new Android_CheckUpdatePage();
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
    public void doCheckUpdate() throws Exception
    {
        System.out.println("Android_CheckUpdatePage_TestCase……开始运行……");
        try
        {
            pl.doLoginByJump(Baseinfo.CheckUpdateTelephone, Baseinfo.CheckUpdatePassword);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }

        if (ag.GetInuseByCheckUpdatePage().contains("1"))
        {
            try
            {
                // 当前最新版本
                ac.doCheckUpdateByNoUpdate();
                // 有更新
                ac.doCheckUpdateByHaveUpdate();
                // 退出
                po.doLoginOutBySetPage();
                System.out.println("*************成功************");
            } catch (Exception e)
            {
                System.out.println("Android_CheckUpdatePage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账户" + Baseinfo.CheckUpdateTelephone);
                System.out.println("********************失败*******************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
