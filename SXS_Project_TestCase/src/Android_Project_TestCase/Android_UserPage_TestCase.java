package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_UserPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_UserPage_TestCase extends BasePage
{

    Android_UserPage au = new Android_UserPage();

    PublicLoginPage pl = new PublicLoginPage();

    PublicLoginOutPage po = new PublicLoginOutPage();

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test
    public void doUserPageTest() throws Exception
    {
        try
        {
            pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInuseByLoginPage().contains("1"))
        {
            try
            {
                au.doUserPageTest();
                po.doLoginOutByUserPage();
                System.out.println("*******************成功*******************");
            } catch (Exception e)
            {
                restartApp();
                po.doLoginOutByResetApp();
                System.out.println("*********************失败************************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
