package Android_Project_TestCase;

import Android_Project_BasePage.Android_NewsAll;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_NewsAllPage_TestCase extends BasePage
{
    Android_NewsAll an = new Android_NewsAll();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;

    @Test
    public void doNewsAllPageTest() throws Exception
    {
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStatus = true;
                an.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStatus = true;
                an.doSucceed();
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
                an.doSucceedByLogin();
            } else
            {
                if (doLoginByLoginTelephoneNumber())
                {
                    loginStatus = true;
                    an.doSucceed();
                } else
                {
                    System.out.println("失败");
                }
            }
        }
    }
}
