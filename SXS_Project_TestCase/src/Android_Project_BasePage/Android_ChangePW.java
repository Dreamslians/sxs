package Android_Project_BasePage;

import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_ChangePayPWPage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_ChangePW extends BasePage
{
    Android_ChangePayPWPage ac = new Android_ChangePayPWPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception{

        ac.doChangePayPW();

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSure();
        Thread.sleep(100);

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSureSubmit();

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSureSubitFinsh();

        po.doLoginOutBySetPage();
        System.out.println("Android_ChangePWPage_TestCase……运行成功……");
    }
    public void doSucceedByLogin() throws Exception{
        Thread.sleep(500);
        pl.doJumpButton();
        pl.doUserButton();
        Thread.sleep(200);
        ac.doChangePayPW();

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSure();
        Thread.sleep(100);

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSureSubmit();

        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(100);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Thread.sleep(500);
        ac.doSettingPageSetPasswordNewSureSubitFinsh();

        po.doLoginOutBySetPage();
        System.out.println("Android_ChangePWPage_TestCase……运行成功……");
    }


}
