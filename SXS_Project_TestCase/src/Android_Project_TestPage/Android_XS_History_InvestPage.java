package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_XS_History_InvestPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doXSHYHistory() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'小沙化缘记录')]").click();
    }

    public void doHistoryByXSpageJoin() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSpageJoin")).click();
    }

    public void doJoinIn() throws Exception {

        doXSHYHistory();
        Thread.sleep(500);
        doHistoryByXSpageJoin();
    }
}
