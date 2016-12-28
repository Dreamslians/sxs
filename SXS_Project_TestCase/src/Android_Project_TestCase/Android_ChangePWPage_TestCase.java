package Android_Project_TestCase;

import Android_Project_BasePage.Android_ChangePW;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_ChangePWPage_TestCase extends BasePage
{

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_ChangePW ac = new Android_ChangePW();
    private boolean loginStutas = false;

    @Test
    public void doChangePayPWTest() throws Exception
    {
        System.out.println("Android_Project_ChangePWPage_TestCase开始运行");
        try
        {
            if (ag.GetInuseByLoginPage().contains("1"))
            {
                loginStutas = true;
                ac.doSucceedByLogin();
            } else if (doLoginByLoginTelephoneNumber())
            {
                loginStutas = true;
                ac.doSucceed();
            } else
            {
                loginStutas = false;
                System.out.println("登录失败");
            }
        } catch (Exception e)
        {
            ac.restartApp();
            if (loginStutas)
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
