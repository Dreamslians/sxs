package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ForgotPasswordPage;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_ForgotPasswordPage_TestCase
{

    Android_ForgotPasswordPage ap = new Android_ForgotPasswordPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetup() throws Exception
    {
        ap.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void doForgotPasswordTest() throws Exception
    {
        System.out.println("Android_Project_ForgotPasswordPage_TestCase开始运行……");
        ap.SendTelephone(Baseinfo.ForgotPasswordTelephone);
        try
        {
            ap.SendVerifyCode(ag.GetVerifyByForgotPasswordPage(), Baseinfo.ForgotPasswordNewPassword, Baseinfo.ForgotPasswordAgainPassword);
            System.out.println(Baseinfo.ForgotPasswordTelephone + "号码修改密码成功，密码修改为" + Baseinfo.ForgotPasswordNewPassword);
            Assert.assertEquals(Baseinfo.ForgotPasswordTelephone, Baseinfo.ForgotPasswordTelephone);
            try
            {
                pl.doLoginByNoJump(Baseinfo.ForgotPasswordTelephone, Baseinfo.ForgotPasswordNewPassword);
                System.out.println(Baseinfo.ForgotPasswordTelephone + "的密码修改之后成功登陆");
            } catch (Exception e)
            {
                System.out.println("登录失败");
            }
            Assert.assertEquals("我的资产(元)", Android_LoadDevice_NotReset.driver.findElement(ap.ao.getLocaator("MyPageTittle")).getText());
            po.doLoginOutByUserPage();
            System.out.println(Baseinfo.ForgotPasswordTelephone + "退出登陆");
            System.out.println("******************成功******************");
        } catch (Exception e)
        {
            System.out.println("Android_ForgotPasswordPage_TestCase……运行失败……");
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
            System.out.println("*********************失败*******************");
        }

    }
}
