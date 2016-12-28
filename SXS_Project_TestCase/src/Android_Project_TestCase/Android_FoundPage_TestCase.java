package Android_Project_TestCase;

import Android_Project_BasePage.Android_FoundPage;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_FoundPage_TestCase extends BasePage
{
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_FoundPage af = new Android_FoundPage();
    private boolean loginStatus = false;

    @Test
    public void doFoundPageTest() throws Exception
    {
        System.out.println("Android_FoundPage_TestCase……开始运行……");
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStatus = true;
                af.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                af.doSucceed();
            } else
            {
                loginStatus = false;
                System.out.println("失败");
            }
        } catch (Exception e)
        {
            af.restartApp();
            if (loginStatus)
            {
                af.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                af.doSucceed();
            } else
            {
                System.out.println("失败");
            }

        }
    }

}
