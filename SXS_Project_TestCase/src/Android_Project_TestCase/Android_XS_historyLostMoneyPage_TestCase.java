package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_XS_historyLostMoneyPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_XS_historyLostMoneyPage_TestCase extends BasePage
{

    Android_XS_historyLostMoneyPage ai = new Android_XS_historyLostMoneyPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test(priority = 1)
    public void doHistoryByLostMoney() throws Exception {
        try
        {
            pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword);
            System.out.println("登录成功");
        }catch (Exception e){
            System.out.println("登录失败");
        }
        if(ag.GetInuseInvestPage().contains("1"))
        {
            try
            {
                ai.doHistoryBySure(Baseinfo.LostByHistoryMoney);
                po.doLoginOutByUserPage();
                System.out.println("**********************成功************************");
            } catch (Exception e)
            {
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("************************失败*************************");
            }
        }else {
            System.out.println("失败");
        }
    }

    @Test(priority = 2)
    public void doHistoryByNolost() throws Exception {
        try
        {
            pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword);
            System.out.println("登录成功");
        }catch (Exception e){
            System.out.println("登录失败");
        }
        if(ag.GetInuseInvestPage().contains("1"))
        {
            try
            {
                ai.doHistoryByNOSure(Baseinfo.LostByHistoryMoney);
                po.doLoginOutByUserPage();
                System.out.println("**********************成功************************");
            } catch (Exception e)
            {
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("************************失败*************************");
            }
        }else {
            System.out.println("失败");
        }
    }
}
