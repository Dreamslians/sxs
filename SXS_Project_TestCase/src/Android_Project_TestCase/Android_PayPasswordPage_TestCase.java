package Android_Project_TestCase;

import Android_Project_BasePage.Android_PayPW;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_PayPasswordPage_TestCase extends BasePage
{

    Android_PayPW ap = new Android_PayPW();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;

    @Test
    public void SettingPayPassword() throws Exception
    {
        System.out.println("Android_PayPasswordPage_TestCase……开始运行……");

        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStatus = true;
                ap.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                ap.doSucceed();
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
                ap.doSucceedByLogin();
            } else
            {
                if (doLoginByLoginTelephoneNumber())
                {
                    loginStatus = true;
                    ap.doSucceed();
                } else
                {
                    System.out.println("失败");
                }
            }
        }
    }
}
