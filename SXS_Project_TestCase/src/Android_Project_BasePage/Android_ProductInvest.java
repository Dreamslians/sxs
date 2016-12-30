package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Baseinfo;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_ProductPageInvestPage;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Android_ProductInvest extends BasePage
{
    Android_ProductPageInvestPage ai = new Android_ProductPageInvestPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();

    public void doSucceed() throws Exception
    {
        ai.doInvest(Baseinfo.InvestMoney);
        System.out.println("恭喜您本次投资" + Baseinfo.InvestMoney + "成功，谢谢~");
        po.doLoginOutByUserPage();
        System.out.println("********************成功********************");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        Thread.sleep(100);
        ai.doInvest(Baseinfo.InvestMoney);
        System.out.println("恭喜您本次投资" + Baseinfo.InvestMoney + "成功，谢谢~");
        po.doLoginOutByUserPage();
        System.out.println("********************成功********************");
    }
}
