package Android_Project_BasePage;

import Android_Project_ExPage.Baseinfo;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_AddBankCardPage;

/**
 * Created by Dreamslians on 2016/12/26.
 */
public class Android_AddBankCard
{
    Android_AddBankCardPage aa = new Android_AddBankCardPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        aa.doRechargeTest(Baseinfo.RechargeInputMoney);
        Thread.sleep(500);
        aa.InputPayPhone(Baseinfo.LoginTelephoneNumber);
    }
    public void doSucceedByLogin() throws Exception{
        Thread.sleep(500);
        pl.doJumpButton();
        aa.doUserButton();
        Thread.sleep(200);
        aa.doRechargeTest(Baseinfo.RechargeInputMoney);
        Thread.sleep(500);
        aa.InputPayPhone(Baseinfo.LoginTelephoneNumber);
    }

}
