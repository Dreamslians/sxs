package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Baseinfo;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_HomeInvestPage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_HomeInvest extends BasePage
{
    Android_HomeInvestPage ah = new Android_HomeInvestPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        ah.doHomePageInvestTest(Baseinfo.InvestMoney);
        po.doLoginOutByUserPage();
        System.out.println("*************运行成功***************");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        ah.doHomePageInvestTest(Baseinfo.InvestMoney);
        po.doLoginOutByUserPage();
        System.out.println("*************运行成功***************");
    }
}
