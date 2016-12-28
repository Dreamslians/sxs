package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_FoundPage extends BasePage
{
    Android_Project_TestPage.Android_FoundPage af = new Android_Project_TestPage.Android_FoundPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        af.doFoundPageTest();
        po.doLoginOutByUserPage();
        System.out.println("Android_FoundPage_TestCase……运行成功……");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        af.doFoundPageTest();
        po.doLoginOutByUserPage();
        System.out.println("Android_FoundPage_TestCase……运行成功……");
    }

}
