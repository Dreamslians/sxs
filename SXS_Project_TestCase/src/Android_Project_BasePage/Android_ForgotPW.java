package Android_Project_BasePage;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ForgotPasswordPage;
import org.junit.Assert;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_ForgotPW extends BasePage
{
    Android_ForgotPasswordPage ap = new Android_ForgotPasswordPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        ap.SendTelephone(Baseinfo.ForgotPasswordTelephone);
        ap.SendVerifyCode(ag.GetVerifyByForgotPasswordPage(), Baseinfo.ForgotPasswordNewPassword, Baseinfo.ForgotPasswordAgainPassword);
        System.out.println(Baseinfo.ForgotPasswordTelephone + "号码修改密码成功，密码修改为" + Baseinfo.ForgotPasswordNewPassword);
        NoJumpLoginByForgetPW();
        System.out.println(Baseinfo.ForgotPasswordTelephone + "的密码修改之后成功登陆");
        Assert.assertEquals("我的资产(元)", Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageTittle")).getText());
        po.doLoginOutByUserPage();
        System.out.println(Baseinfo.ForgotPasswordTelephone + "退出登陆");
        System.out.println("******************成功******************");
    }

}
