package Android_Project_TestCase;

import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.Baseinfo;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_AddBankCardPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_AddBankCardPage_TestCase
{
    Android_AddBankCardPage aa = new Android_AddBankCardPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();

    @BeforeMethod
    public void doSetUp() throws Exception {
        aa.an.setUp();
    }

    @AfterMethod
    public void TearDown() {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test
    public void doRechargeTest() throws Exception {
        System.out.println("Android_Project_AddBankCardPage_TestCase开始运行");
        pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord);
        try {
            aa.doRechargeTest("10", "6214830101629193");
        }catch (Exception e){
            System.out.println("Android_AddBankCardPage_TestCase"+"……运行失败……");
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
            System.out.println("退出当前登录账号"+Baseinfo.LoginTelephoneNumber);
            System.out.println("**********************失败**********************");
        }
    }
}
