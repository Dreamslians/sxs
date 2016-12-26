package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_HomeInvestPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_HomeInvestPage_TestCase extends BasePage
{

    Android_HomeInvestPage ah = new Android_HomeInvestPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test
    public void doHomePageInvest() throws Exception {
        System.out.println("Android_HomeInvestPage_TestCase开始运行");
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
                ah.doHomePageInvestTest(Baseinfo.InvestMoney);
                po.doLoginOutByUserPage();
                System.out.println("*************运行成功***************");
            } catch (Exception e)
            {
                System.out.println("Android_HomeInvestPage_TestCase运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账户" + Baseinfo.InvestTelephone);
                System.out.println("*******************失败*******************");
            }
        }else {
            System.out.println("失败");
        }
    }
}
