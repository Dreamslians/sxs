package Android_Project_TestCase;

import Android_Project_BasePage.Android_ForgotPW;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import org.testng.annotations.Test;

public class Android_ForgotPasswordPage_TestCase extends BasePage
{

    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_ForgotPW af = new Android_ForgotPW();

    @Test
    public void doForgotPasswordTest() throws Exception
    {
        System.out.println("Android_Project_ForgotPasswordPage_TestCase开始运行……");
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                System.out.println("退出账户");
                po.doLoginOutByResetApp();
                af.restartApp();
                af.doSucceed();
            } else
            {
                af.doSucceed();
            }
        } catch (Exception e)
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                System.out.println("退出账户");
                po.doLoginOutByResetApp();
                af.restartApp();
                af.doSucceed();
            } else
            {
                af.doSucceed();
            }
        }
    }
}
