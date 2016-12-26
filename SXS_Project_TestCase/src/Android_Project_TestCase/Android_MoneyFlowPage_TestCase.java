package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_MoneyFlowPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_MoneyFlowPage_TestCase extends BasePage
{
    Android_MoneyFlowPage am = new Android_MoneyFlowPage();

    PublicLoginPage pl = new PublicLoginPage();

    PublicLoginOutPage po = new PublicLoginOutPage();

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();


    @Test
    public void doMoneyFlow_Test() throws Exception
    {
        try
        {
            pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword);
            System.out.println("登录成功");
        } catch (Exception e)
        {
            System.out.println("登录失败");
        }
        if (ag.GetInuseInvestPage().contains("1"))
        {
            try
            {
                am.doMoneyFlowTest();
                po.doLoginOutByUserPage();
                System.out.println("****************成功****************");
            } catch (Exception e)
            {
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("******************失败******************");
            }
        } else
        {
            System.out.println("失败");
        }
    }
}
