package Android_Project_TestCase;

import Android_Project_BasePage.Android_AboutUS;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_AboutUsPage_TestCase extends BasePage
{

    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_AboutUS au = new Android_AboutUS();
    private boolean loginStatus = false;

    @Test
    public void doAboutUsTest() throws Exception
    {
        System.out.println("Android_AboutUsPage_TestCase" + "开始运行");

        int count = 0;
        while (count <= 3)
        {
            count++;
            try
            {
                if (ag.GetInuseByAnoutUsPage().contains("1"))
                {
                    loginStatus = true;
                    au.doSucceedByLogin();
                } else if (doLoginByLoginTelephoneNumber())
                {
                    loginStatus = true;
                    au.doSucceed();
                } else
                {
                    loginStatus = false;
                    System.out.println("登录失败");
                }
            } catch (Exception e1)
            {
                au.restartApp();
                if (loginStatus)
                {
                    au.doSucceedByLogin();
                } else
                {
                    if (doLoginByLoginTelephoneNumber())
                    {
                        loginStatus = true;
                        au.doSucceed();
                    }
                }
            } finally
            {
                break;
            }
        }
    }
}

