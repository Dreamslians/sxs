package Android_Project_TestCase;

import Android_Project_BasePage.Android_ChangeBilding;
import Android_Project_ExPage.*;
import org.testng.annotations.Test;

public class Android_ChangeBildingPage_TestCase extends BasePage
{
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_ChangeBilding ac = new Android_ChangeBilding();

    @Test
    public void doChangeBildingPageTest() throws Exception
    {
        System.out.println("Android_Project_ChangeBildingPage_TestCase开始运行");
        try
        {
            doChangeBilding_login();
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInuseByChangeBildingPage().contains("1"))
        {
            try
            {
                ac.doSucceed();
            } catch (Exception e)
            {
                System.out.println("Android_FoundPayPWPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.ChangeBildingTelephone);
                System.out.println("*********************失败*******************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
