package Android_Project_BasePage;

import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_TestPage.Android_AboutUsPage;

/**
 * Created by Dreamslians on 2016/12/26.
 */
public class Android_AboutUS extends BasePage

{
    Android_AboutUsPage aa = new Android_AboutUsPage();
    PublicLoginOutPage po = new PublicLoginOutPage();

    public void doSucceed() throws Exception{
        aa.doAboutUS();
        po.doLoginOutBySetPage();
        System.out.println("Android_AboutUsPage_TestCase" + "……运行成功……");
    }
    public void doSucceedByLogin() throws Exception{
        aa.doAboutUSByLogin();
        po.doLoginOutBySetPage();
        System.out.println("Android_AboutUsPage_TestCase" + "……运行成功……");
    }
    public void doFiled() throws Exception{
        System.out.println("Android_AboutUsPage_TestCase" + "……运行失败……");
        Android_LoadDevice_NotReset.driver.closeApp();
        Android_LoadDevice_NotReset.driver.launchApp();
        Thread.sleep(1000);
        po.doLoginOutByResetApp();
        System.out.println("**********************失败**********************");
    }
}
