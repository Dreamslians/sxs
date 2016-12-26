package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ChangeLoginPWPage;
import org.testng.annotations.Test;

public class Android_ChangeLoginPWPage_TestCase extends BasePage
{

    Android_ChangeLoginPWPage ac = new Android_ChangeLoginPWPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test
    public void doChangePassword() throws Exception
    {
        System.out.println("Android_Project_ChangeLoginPWPage_TestCase开始运行");
        try
        {
            pl.doLoginByJump(Baseinfo.ChangeLoginPWTelephoneNumber, Baseinfo.ChangeLoginPWPassWord);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }

        if (ag.GetInuseByChangeLoginPWPage().contains("1"))
        {
            try
            {
                ac.doChangePassWord(Baseinfo.ChangeLoginPWPassWord, Baseinfo.ChangeLoginPWNewPW, Baseinfo.ChangeLoginPWNewPWAgain);
                try
                {
                    pl.doLoginByNoJump(Baseinfo.ChangeLoginPWTelephoneNumber, Baseinfo.ChangeLoginPWNewPW);
                    System.out.println("密码修改为" + Baseinfo.ChangeLoginPWNewPW + "之后登录成功");
                } catch (Exception e)
                {
                    System.out.println("密码修改为" + Baseinfo.ChangeLoginPWNewPW + "之后登录失败");
                }
                po.doLoginOutByUserPage();
                System.out.println("Android_Project_ChangeLoginPWPage_TestCase运行成功");
            } catch (Exception e)
            {
                System.out.println("Android_ChangeLoginPWPage_TestCase……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.ChangeLoginPWTelephoneNumber);
                System.out.println("**********************失败**********************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}