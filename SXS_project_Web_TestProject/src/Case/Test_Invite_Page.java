package Case;

import Data.BasePage;
import Data.Baseinfo;
import Page.SXS_Invite_Mobile;
import Page.SXS_Invite_Page;
import Page.SXS_Invite_Quanmama;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Test_Invite_Page extends BasePage
{
    WebDriver driver = new FirefoxDriver();

    @Test(priority = 1)
    public void doRegisterTest()
    {

        driver.manage().window().maximize();
        driver.get(Baseinfo.URL_invite);

        SXS_Invite_Page ai = new SXS_Invite_Page(driver);

        ai.RegisterTestByGetCode(Baseinfo.Telephone, Baseinfo.Password, Baseinfo.ImageVerify);

        ai.RegisterInputCode(GetVerifyByRegisterPage());

        driver.close();

    }

    @Test(priority = 2)
    public void doRegister_Invite_mobile() throws Exception
    {
        Dimension d = new Dimension(450, 800);
        driver.manage().window().setSize(d);
        driver.get(Baseinfo.URL_invite_mobile);

        SXS_Invite_Mobile am = new SXS_Invite_Mobile(driver);

        am.doRegister_SendTel_PW(Baseinfo.Telephone, Baseinfo.PassWord, Baseinfo.ImageVerify);

        am.doRegister_SendVerify(GetVerifyByRegisterPage_mobile());

        driver.close();
    }

    @Test(priority = 3)
    public void doRegister_Invite_Quanmama() throws Exception
    {
        Dimension d = new Dimension(450, 800);
        driver.manage().window().setSize(d);
        Thread.sleep(500);
        driver.get(Baseinfo.URL_invite_quanmama);
        SXS_Invite_Quanmama sq = new SXS_Invite_Quanmama(driver);

        sq.SendTel_ImageVerify(Baseinfo.Telephone, Baseinfo.PassWord, Baseinfo.ImageVerify);

        sq.SendCode(GetVerifyByRegisterPage());

        driver.close();
        //driver.quit();
    }

    @Test(priority = 4)
    public void doRegister_Invite_Mobile1() throws Exception
    {
        Dimension d = new Dimension(450, 800);
        driver.manage().window().setSize(d);
        Thread.sleep(500);
        driver.get(Baseinfo.URL_invite_mobile1);
        SXS_Invite_Quanmama sq = new SXS_Invite_Quanmama(driver);

        sq.SendTel_ImageVerify(Baseinfo.Telephone, Baseinfo.PassWord, Baseinfo.ImageVerify);

        sq.SendCode(GetVerifyByRegisterPage());

        driver.close();
    }

    @Test(priority = 5)
    public void doRegister_Invite_fanli_11() throws Exception
    {
        Dimension d = new Dimension(450, 800);
        driver.manage().window().setSize(d);
        Thread.sleep(500);
        driver.get(Baseinfo.URL_invite_fanli_11);
        SXS_Invite_Quanmama sq = new SXS_Invite_Quanmama(driver);

        sq.SendTel_ImageVerify(Baseinfo.Telephone, Baseinfo.PassWord, Baseinfo.ImageVerify);

        sq.SendCode(GetVerifyByRegisterPage());

        driver.close();
    }
}
