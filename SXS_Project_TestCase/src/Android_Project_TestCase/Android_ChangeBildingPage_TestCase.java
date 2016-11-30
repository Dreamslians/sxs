package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ChangeBindingPage;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_ChangeBildingPage_TestCase
{
    Android_ChangeBindingPage ac = new Android_ChangeBindingPage();
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
    public void doChangeBildingPageTest() throws Exception
    {
        System.out.println("Android_Project_ChangeBildingPage_TestCase开始运行");
        try
        {
            pl.doLoginByJump(Baseinfo.ChangeBildingTelephone, Baseinfo.ChangeBildingPassword);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInuseByChangeBildingPage().contains("1"))
        {
            try
            {
                ac.doChangeBindingTelephone(Baseinfo.ChangeBildingPassword);
                Assert.assertEquals("您当前绑定的手机号为:" + Baseinfo.ChangeBildingTelephone, Android_LoadDevice_NotReset.driver
                        .findElement(ac.ao.getLocaator("SettingPageResetPhoneOldTelephone")).getText());

                ac.doChangeBildingTelephoneBySendverifyCode(ag.GetVerifyByChangeBildingPageOne(), Baseinfo.ChangeBildingNewTelephone);
                ac.doChangeBildingTelephoneBySendNewVerifyCode(ag.GetVerifyByChangeBildingPageTwo());
                pl.doLoginByNoJump(Baseinfo.ChangeBildingNewTelephone, Baseinfo.ChangeBildingPassword);

                Assert.assertEquals("我的资产",
                        Android_LoadDevice_NotReset.driver.findElement(ac.ao.getLocaator("TredtyTextTittle")).getText());
                po.doLoginOutByUserPage();
                System.out.println("*************成功***************");
            } catch (Exception e)
            {
                System.out.println("Android_FoundPayPWPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.ChangeBildingTelephone);
                System.out.println("*********************失败*******************");
            }
        }else{
            System.out.println("失败");
        }
    }
}
