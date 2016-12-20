package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_AboutUsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_AboutUsPage_TestCase
{

    Android_AboutUsPage aa = new Android_AboutUsPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        aa.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void doAboutUsTest() throws Exception
    {
        System.out.println("Android_AboutUsPage_TestCase" + "开始运行");

        try
        {
            pl.doLoginByJump(Baseinfo.AboutUSPageTelephone, Baseinfo.AboutUSPagePassword);
            System.out.println("登录成功");
        } catch (Exception e1)
        {
            System.out.println(Baseinfo.AboutUSPageTelephone + "登录失败………………");
        }

        if (ag.GetInuseByAnoutUsPage().contains("1"))
        {
            try
            {
                aa.doAboutUS();
                po.doLoginOutBySetPage();
                System.out.println("Android_AboutUsPage_TestCase" + "……运行成功……");
            } catch (Exception e)
            {
                System.out.println("Android_AboutUsPage_TestCase" + "……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.AboutUSPageTelephone);
                System.out.println("**********************失败**********************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}

