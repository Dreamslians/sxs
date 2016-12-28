package Android_Project_TestCase;

import Android_Project_BasePage.Android_ChangeBilding;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_ChangeBildingPage_TestCase extends BasePage
{
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_ChangeBilding ac = new Android_ChangeBilding();
    private boolean loginStatus = false;

    @Test
    public void doChangeBildingPageTest() throws Exception
    {
        while (true)
        {
            try
            {
                if (ag.GetInuseByChangeBildingPage().contains("1"))
                {
                    loginStatus = true;
                    ac.doSucceedByLogin();
                } else if (doChangeBilding_login())
                {
                    loginStatus = true;
                    ac.doSucceed();
                } else
                {
                    loginStatus = false;
                    System.out.println("登录失败");
                }
            } catch (Exception e)
            {
                ac.restartApp();
                if (loginStatus)
                {
                    ac.doSucceedByLogin();
                } else
                {
                    if (doChangeBilding_login())
                    {
                        loginStatus = true;
                        ac.doSucceed();
                    } else
                    {
                        System.out.println("失败");
                    }
                }
            } finally
            {
                break;
            }
        }
    }
}
