package Android_Project_TestCase;

import Android_Project_BasePage.Android_AddBankCard;
import Android_Project_ExPage.Android_GetCodeFromDatabase;
import Android_Project_ExPage.BasePage;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_AddBankCardPage_TestCase extends BasePage
{

    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    Android_AddBankCard ab = new Android_AddBankCard();

    @Test
    public void doRechargeTest() throws Exception
    {
        System.out.println("Android_Project_AddBankCardPage_TestCase开始运行");


        int count = 0;
        while (count <= 5)
        {
            count++;
            System.out.println("第" + count + "次");
            try
            {
                if (ag.GetInuseByLoginPage().contains("1"))
                {
                    ab.doSucceedByLogin();
                } else if (doLoginByLoginTelephoneNumber())
                {
                    ab.doSucceed();
                } else
                {
                    System.out.println("登录失败");
                }
            } catch (Exception e)
            {
                restartApp();
                ab.doSucceedByLogin();
            }
        }
    }
}
