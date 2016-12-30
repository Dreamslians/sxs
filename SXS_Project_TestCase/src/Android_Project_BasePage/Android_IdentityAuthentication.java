package Android_Project_BasePage;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_IdentityAuthenticationPage;
import org.junit.Assert;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Android_IdentityAuthentication extends BasePage
{
    Android_IdentityAuthenticationPage ai = new Android_IdentityAuthenticationPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        ai.doSettingPageIdentityAuthenticationTest(Baseinfo.IdentityAuthenticationUsername,
                Baseinfo.IdentityAuthenticationNumber);

        Assert.assertEquals(Baseinfo.IdentityAuthenticationUsername,
                Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageUsername")).getText());
        po.doLoginOutBySetPage();
        System.out.println("Android_IdentityAuthenticationPage_TestCase运行成功……");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        Thread.sleep(100);
        pl.doUserButton();
        ai.doSettingPageIdentityAuthenticationTest(Baseinfo.IdentityAuthenticationUsername,
                Baseinfo.IdentityAuthenticationNumber);

        Assert.assertEquals(Baseinfo.IdentityAuthenticationUsername,
                Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageUsername")).getText());
        po.doLoginOutBySetPage();
        System.out.println("Android_IdentityAuthenticationPage_TestCase运行成功……");
    }


}
