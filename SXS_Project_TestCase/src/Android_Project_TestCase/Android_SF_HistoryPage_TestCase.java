package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_SF_HistoryPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_SF_HistoryPage_TestCase
{
    Android_SF_HistoryPage ah = new Android_SF_HistoryPage();

    PublicLoginPage pl = new PublicLoginPage();

    PublicLoginOutPage po = new PublicLoginOutPage();

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        ah.an.setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }
    @Test
    public void doSF_History_Test() throws Exception
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
                ah.doFS_HistoryTest();
                po.doLoginOutByUserPage();
                System.out.println("*********************运行成功*********************");
            }catch (Exception e){
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("*********************失败************************");
            }
        }else {
            System.out.println("失败");
        }
    }
}
