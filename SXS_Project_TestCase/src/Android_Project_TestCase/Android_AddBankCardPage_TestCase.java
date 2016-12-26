package Android_Project_TestCase;

import Android_Project_Data.BaseInterface;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_AddBankCardPage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_AddBankCardPage_TestCase extends BaseInterface
{
    Android_AddBankCardPage aa = new Android_AddBankCardPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @Test
    public void doRechargeTest() throws Exception
    {
        System.out.println("Android_Project_AddBankCardPage_TestCase开始运行");

        try
        {
            pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord);
        }catch (Exception e){
            System.out.println("登录失败退出");
        }
//        if(ag.GetInuseByLoginPage().contains("1"))
//        {
            try
            {
                aa.doRechargeTest(Baseinfo.RechargeInputMoney);
                Thread.sleep(500);
                aa.InputPayPhone(Baseinfo.LoginTelephoneNumber);
            } catch (Exception e)
            {
                System.out.println("Android_AddBankCardPage_TestCase" + "……运行失败……");
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("退出当前登录账号" + Baseinfo.LoginTelephoneNumber);
                System.out.println("**********************失败**********************");
            }
//        }else{
//            System.out.println("失败");
//        }
    }


}
