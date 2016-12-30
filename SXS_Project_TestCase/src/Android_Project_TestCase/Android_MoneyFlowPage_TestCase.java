package Android_Project_TestCase;

import Android_Project_BasePage.Android_MoneyFlow;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_MoneyFlowPage_TestCase extends BasePage
{

    Android_MoneyFlow am = new Android_MoneyFlow();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    private boolean loginStatus = false;


    @Test
    public void doMoneyFlow_Test() throws Exception
    {
        try
        {
            if (ag.GetInuseInvestPage().contains("1"))
            {
                loginStatus = true;
                am.doSucceedByLogin();
            } else if (LoginJumpByInvest())
            {
                loginStatus = true;
                am.doSucceed();
            } else
            {
                loginStatus = false;
                System.out.println("失败");
            }
        } catch (Exception e)
        {
            restartApp();
            if(loginStatus){
                am.doSucceedByLogin();
            }else{
                if(LoginJumpByInvest()){
                    am.doSucceed();
                }else{
                    System.out.println("失败");
                }
            }
        }
    }
}
