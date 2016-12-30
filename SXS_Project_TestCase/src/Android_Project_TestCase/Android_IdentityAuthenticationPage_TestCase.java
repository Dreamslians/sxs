package Android_Project_TestCase;

import Android_Project_BasePage.Android_IdentityAuthentication;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_IdentityAuthenticationPage_TestCase extends BasePage
{

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_IdentityAuthentication ai = new Android_IdentityAuthentication();
    private boolean loginStatus = false;

    @Test(priority = 1)
    public void doIdentityAuthentication() throws Exception
    {
        System.out.println("Android_IdentityAuthenticationPage_TestCase开始运行……");
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStatus = true;
                ai.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                ai.doSucceed();
            } else
            {
                loginStatus = false;
                System.out.println("失败");
            }
        } catch (Exception e)
        {
            restartApp();
            if (loginStatus)
            {
                ai.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                ai.doSucceed();
            } else
            {
                System.out.println("失败");
            }
        }
    }
}
