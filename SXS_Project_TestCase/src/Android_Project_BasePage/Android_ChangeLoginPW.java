package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Baseinfo;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_ChangeLoginPWPage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_ChangeLoginPW extends BasePage
{
    Android_ChangeLoginPWPage ac = new Android_ChangeLoginPWPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();


    public void doSucceed() throws Exception
    {
        ac.doChangePassWord(Baseinfo.ChangeLoginPWPassWord, Baseinfo.ChangeLoginPWNewPW, Baseinfo.ChangeLoginPWNewPWAgain);
        NoJumpByChangeLoginPw();
        System.out.println("密码修改为" + Baseinfo.ChangeLoginPWNewPW + "之后登录成功");
        po.doLoginOutByUserPage();
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(500);
        pl.doJumpButton();
        pl.doUserButton();
        ac.doChangePassWord(Baseinfo.ChangeLoginPWPassWord, Baseinfo.ChangeLoginPWNewPW, Baseinfo.ChangeLoginPWNewPWAgain);
        NoJumpByChangeLoginPw();
        System.out.println("密码修改为" + Baseinfo.ChangeLoginPWNewPW + "之后登录成功");
        po.doLoginOutByUserPage();
    }
}
