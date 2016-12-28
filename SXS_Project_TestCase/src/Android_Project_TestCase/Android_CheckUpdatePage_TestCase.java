package Android_Project_TestCase;

import Android_Project_BasePage.Android_CheckUpdate;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_CheckUpdatePage_TestCase extends BasePage
{

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;
    Android_CheckUpdate ac = new Android_CheckUpdate();

    @Test
    public void doCheckUpdate() throws Exception
    {
        System.out.println("Android_CheckUpdatePage_TestCase……开始运行……");
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStatus = true;
                ac.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                ac.doSucceed();
            } else
            {
                System.out.println("失败");
            }
        } catch (Exception e)
        {
            ac.restartApp();
            if (loginStatus)
            {
                ac.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                ac.doSucceed();
            } else
            {
                System.out.println("失败");
            }
        }
    }
}
