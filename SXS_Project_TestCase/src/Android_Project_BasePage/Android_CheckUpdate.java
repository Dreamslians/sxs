package Android_Project_BasePage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.PublicLoginOutPage;
import Android_Project_ExPage.PublicLoginPage;
import Android_Project_TestPage.Android_CheckUpdatePage;

/**
 * Created by Dreamslians on 2016/12/28.
 */
public class Android_CheckUpdate extends BasePage
{
    Android_CheckUpdatePage ac = new Android_CheckUpdatePage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    PublicLoginPage pl = new PublicLoginPage();

    public void doSucceed() throws Exception
    {
        // 当前最新版本
        ac.doCheckUpdateByNoUpdate();
        // 有更新
        ac.doCheckUpdateByHaveUpdate();
        // 退出
        po.doLoginOutBySetPage();
        System.out.println("*************成功************");
    }

    public void doSucceedByLogin() throws Exception
    {
        Thread.sleep(500);
        pl.doJumpButton();
        pl.doUserButton();
        // 当前最新版本
        ac.doCheckUpdateByNoUpdate();
        // 有更新
        ac.doCheckUpdateByHaveUpdate();
        // 退出
        po.doLoginOutBySetPage();
        System.out.println("*************成功************");
    }
}
