package Android_Project_TestCase;

import Android_Project_BasePage.Android_ProductInvest;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

public class Android_ProductPageInvestPage_TestCase extends BasePage
{
    Android_ProductInvest ai = new Android_ProductInvest();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;

    @Test
    public void doInvest() throws Exception
    {
        try
        {
            if (ag.GetInuseInvestPage().contains("1"))
            {
                loginStatus = true;
                ai.doSucceedByLogin();
            } else if (LoginJumpByInvest())
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
            } else
            {
                if (LoginJumpByInvest())
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
}
