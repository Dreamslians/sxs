package Android_Project_MixCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/29.
 */
public class Android_MixCaseOne
{
    Android_RegisterPage ar = new Android_RegisterPage();

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();

    Android_IdentityAuthenticationPage ai = new Android_IdentityAuthenticationPage();

    Android_PayPasswordPage ap = new Android_PayPasswordPage();

    Android_ChangeLoginPWPage ac = new Android_ChangeLoginPWPage();

    Android_ChangePayPWPage acp = new Android_ChangePayPWPage();

    Android_FoundPayPWPage af = new Android_FoundPayPWPage();

    Android_ChangeBindingPage ab = new Android_ChangeBindingPage();

    Android_AboutUsPage aa = new Android_AboutUsPage();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        ar.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void MixCaseOneTest() throws Exception
    {
        System.out.println("开始注册");
        Thread.sleep(300);
        ar.doSendTelephone(Baseinfo.RegisterTelephoneNumber);
        ar.SendVerfy(ag.GetVerifyByRegisterPage(), Baseinfo.RegisterPassword, Baseinfo.RegisterAgainPassword);
        System.out.println("注册完成");
        System.out.println("开始实名认证");
        ai.doSettingPageIdentityAuthenticationTest(Baseinfo.IdentityAuthenticationUsername,
                Baseinfo.IdentityAuthenticationNumber);
        System.out.println("完成实名认证");
        System.out.println("开始设置支付密码");
        ap.doSettingPageSetPassword();
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        ap.doSettingPageSetPasswordSubmitButton();
        System.out.println("完成设置支付密码");
        System.out.println("开始修改登录密码");
        ac.doChangePW(Baseinfo.RegisterPassword, Baseinfo.ChangeLoginPWNewPW, Baseinfo.ChangeLoginPWNewPWAgain);
        System.out.println("完成修改登录密码");
        pl.doLoginByNoJump(Baseinfo.RegisterTelephoneNumber, Baseinfo.ChangeLoginPWNewPW);
        System.out.println("完成使用新密码登录");
        System.out.println("开始修改支付密码");
        acp.doSettingPageSetPassword();
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        acp.doSettingPageSetPasswordNewSure();
        Thread.sleep(100);

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        acp.doSettingPageSetPasswordNewSureSubmit();

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        acp.doSettingPageSetPasswordNewSureSubitFinsh();
        System.out.println("完成修改支付密码");
        System.out.println("开始找回支付密码");
        af.FoundPayPWByMixCase(Baseinfo.RegisterTelephoneNumber);
        af.FoundPayPWTestBySendCode(ag.GetVerifyByFoundPayPWPage());

        Thread.sleep(300);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);

        af.doSettingPageSetPasswordNewSureSubmit();

        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);

        af.doSettingPageSetPasswordNewSureSubitFinsh();
        System.out.println("完成找回支付密码");
        System.out.println("开始更改绑定手机号码");
        ab.doChangeBildingByMixCase(Baseinfo.ChangeLoginPWNewPW);
        ab.doChangeBildingTelephoneBySendverifyCode(ag.GetVerifyByChangeBildingPageOne(), Baseinfo.ChangeBildingNewTelephone);
        ab.doChangeBildingTelephoneBySendNewVerifyCode(ag.GetVerifyByChangeBildingPageTwo());
        pl.doLoginByNoJump(Baseinfo.ChangeBildingNewTelephone, Baseinfo.ChangeLoginPWNewPW);
        System.out.println("完成更改绑定手机号码");
        System.out.println("开始关于页面检查");
        aa.doAboutUS();
        System.out.println("完成关于页面检查");
        po.doLoginOutBySetPage();
        System.out.println("退出当前登录账户");
    }
}
