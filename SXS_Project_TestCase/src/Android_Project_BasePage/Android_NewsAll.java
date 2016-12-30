package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_NewsAllPage;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Android_NewsAll extends BasePage
{
    Android_NewsAllPage an = new Android_NewsAllPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();

    public void doSucceed() throws Exception
    {
        an.doHomePageNewsTest();
        po.doLoginOutByUserPage();
        System.out.println("****************成功****************");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        Thread.sleep(100);
        pl.doUserButton();
        an.doHomePageNewsTest();
        po.doLoginOutByUserPage();
        System.out.println("****************成功****************");
    }
}
