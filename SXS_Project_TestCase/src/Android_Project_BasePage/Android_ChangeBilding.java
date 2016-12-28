package Android_Project_BasePage;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ChangeBindingPage;
import org.junit.Assert;

/**
 * Created by Dreamslians on 2016/12/26.
 */
public class Android_ChangeBilding extends BasePage
{
    Android_ChangeBindingPage ac = new Android_ChangeBindingPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    public void doSucceed() throws Exception
    {
        ac.doChangeBindingTelephone(Baseinfo.ChangeBildingPassword);
        Assert.assertEquals("您当前绑定的手机号为:" + Baseinfo.ChangeBildingTelephone, Android_LoadDevice_NotReset.driver
                .findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneOldTelephone")).getText());

        ac.doChangeBildingTelephoneBySendverifyCode(ag.GetVerifyByChangeBildingPageOne(), Baseinfo.ChangeBildingNewTelephone);
        ac.doChangeBildingTelephoneBySendNewVerifyCode(ag.GetVerifyByChangeBildingPageTwo());

        doNoJmupLogin();
        Assert.assertEquals("我的资产",
                Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextTittle")).getText());
        po.doLoginOutByUserPage();
        System.out.println("*************成功***************");
    }
    public void doSucceedByLogin() throws Exception{
        Thread.sleep(500);
        ac.doJumpButton();
        ac.doUserButton();
        ac.doChangeBindingTelephone(Baseinfo.ChangeBildingPassword);
        Assert.assertEquals("您当前绑定的手机号为:" + Baseinfo.ChangeBildingTelephone, Android_LoadDevice_NotReset.driver
                .findElement(Android_Element_ObjectMap.getLocaator("SettingPageResetPhoneOldTelephone")).getText());

        ac.doChangeBildingTelephoneBySendverifyCode(ag.GetVerifyByChangeBildingPageOne(), Baseinfo.ChangeBildingNewTelephone);
        ac.doChangeBildingTelephoneBySendNewVerifyCode(ag.GetVerifyByChangeBildingPageTwo());

        doNoJmupLogin();
        Assert.assertEquals("我的资产",
                Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextTittle")).getText());
        po.doLoginOutByUserPage();
        System.out.println("*************成功***************");
    }


}
