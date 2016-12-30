package Case;

import Data.BasePage;
import Data.Baseinfo;
import Page.SXS_Invite_Page;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Test_Invite_Page extends BasePage
{
    WebDriver driver = new FirefoxDriver();

    @Test
    public void doRegisterTest()
    {
        driver.manage().window().maximize();
        driver.get(Baseinfo.URL);

        SXS_Invite_Page ai = new SXS_Invite_Page(driver);

        ai.RegisterTestByGetCode("1730000000","111111qqq",Baseinfo.ImageVerify);

        ai.RegisterInputCode(Baseinfo.GetVerifyByRegister);
    }
}
