package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_MoneyFlowPage;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class Android_MoneyFlow extends BasePage
{
    Android_MoneyFlowPage am = new Android_MoneyFlowPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        am.doMoneyFlowTest();
        po.doLoginOutByUserPage();
        System.out.println("****************成功****************");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(300);
        pl.doJumpButton();
        Thread.sleep(100);
        pl.doUserButton();
        am.doMoneyFlowTest();
        po.doLoginOutByUserPage();
        System.out.println("****************成功****************");
    }

}
