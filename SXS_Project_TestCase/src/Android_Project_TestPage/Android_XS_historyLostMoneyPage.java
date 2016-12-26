package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_XS_historyLostMoneyPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doXSHYHistory() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'小沙化缘记录')]").click();
    }

    public void doHistoryByXSpageOut() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSpageOut")).click();
    }

    public void doHistoryByXSOutMoney(String money) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSOutMoney")).click();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSOutMoney")).sendKeys(money);
    }

    public void doHistoryByXSOutSure() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSOutSure")).click();
    }

    public void doHistoryByXSNOOut() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSNOOut")).click();
    }

    public void doHistoryByXSOk() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HistoryByXSOk")).click();
    }

    public void doProductMorePageFinshReturnButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageFinshReturnButton")).click();
    }

    public void doHistoryBySure(String money) throws Exception {
        doXSHYHistory();
        doHistoryByXSpageOut();
        doHistoryByXSOutMoney(money);
        doHistoryByXSOutSure();
        doHistoryByXSOk();
        doProductMorePageFinshReturnButton();
    }

    public void doHistoryByNOSure(String money) throws Exception {
        doXSHYHistory();
        doHistoryByXSpageOut();
        doHistoryByXSOutMoney(money);
        doHistoryByXSNOOut();
        doProductMorePageFinshReturnButton();
    }
}
