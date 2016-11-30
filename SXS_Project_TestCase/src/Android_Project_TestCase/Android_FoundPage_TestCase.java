package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_FoundPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_FoundPage_TestCase
{
    Android_FoundPage af = new Android_FoundPage();
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
    public void doFoundPageTest() throws Exception
    {
        System.out.println("Android_FoundPage_TestCase……开始运行……");
        try
        {
            pl.doLoginByJump(Baseinfo.FoundPageLoginTelePhone, Baseinfo.FoundPagePassword);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInuseByFoundPage().contains("1"))
        {
            try
            {
                af.doFoundPageTest();
                po.doLoginOutByUserPage();
                System.out.println("Android_FoundPage_TestCase……运行成功……");
            } catch (Exception e)
            {
                System.out.println("……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("**********************失败*********************");
            }
        } else
        {
            System.out.println("失败");
        }
    }

}
