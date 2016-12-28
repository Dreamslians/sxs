package Android_Project_TestCase;

import Android_Project_BasePage.Android_ChangeLoginPW;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_ChangeLoginPWPage_TestCase extends BasePage
{

    Android_ChangeLoginPW ac = new Android_ChangeLoginPW();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;

    @Test
    public void doChangePassword() throws Exception
    {
        System.out.println("Android_Project_ChangeLoginPWPage_TestCase开始运行");
        try
        {
            if (ag.GetInuseByChangeLoginPWPage().contains("1"))
            {
                loginStatus = true;
                ac.doSucceedByLogin();
            } else if (doLoginByChangeLoginPW())
            {
                loginStatus = true;
                ac.doSucceed();
            } else
            {
                loginStatus = false;
                System.out.println("失败");
            }
        } catch (Exception e)
        {
            ac.restartApp();
            if (loginStatus)
            {
                ac.doSucceedByLogin();
            } else
            {
                if (doLoginByChangeLoginPW())
                {
                    loginStatus = true;
                    ac.doSucceed();
                } else
                {
                    System.out.println("失败");
                }
            }
        }
    }
}