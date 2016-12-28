package Android_Project_TestCase;

import Android_Project_BasePage.Android_HomeInvest;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_HomeInvestPage_TestCase extends BasePage
{

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_HomeInvest ah = new Android_HomeInvest();
    private boolean loginStatus = false;

    @Test
    public void doHomePageInvest() throws Exception
    {
        System.out.println("Android_HomeInvestPage_TestCase开始运行");
        while (true)
        {
            try
            {
                if (ag.GetInuseInvestPage().contains("1"))
                {
                    loginStatus = true;
                    ah.doSucceedByLogin();
                } else if (LoginJumpByInvest())
                {
                    loginStatus = true;
                    ah.doSucceed();
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
                    ah.doSucceedByLogin();
                } else if (LoginJumpByInvest())
                {
                    ah.doSucceed();
                } else
                {
                    System.out.println("失败");
                }

            } finally
            {
                break;
            }
        }
    }
}
