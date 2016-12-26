package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_XSInvestPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_XSInvestPage_TestCae extends BasePage
{
    Android_XSInvestPage ax = new Android_XSInvestPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();


    @Test(priority = 1)
    public void doXSInvestTest() throws Exception {
        try{
            pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword);
            System.out.println("登录成功");
        }catch (Exception e){
            System.out.println("登录失败");
        }
        if(ag.GetInuseInvestPage().contains("1"))
        {
            try
            {
                ax.doXSInvestTest(Baseinfo.InvestMoneyByXS);
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
    public void doMorePageInvestTest() throws Exception {
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
                ax.doMoreXSInvestPageTest(Baseinfo.InvestMoneyByXS);
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
