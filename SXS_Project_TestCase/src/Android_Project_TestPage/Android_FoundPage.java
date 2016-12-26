package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_FoundPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doFoundPageJump() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundButton")).click();
    }

    public void ClickNewNews() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'最新消息')]").click();
    }

    public void ClickSafe() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'安全保障')]").click();
    }

    public void ClickProduct() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'媒体报道')]").click();
    }

    public void ClickCompany() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'公司介绍')]").click();
    }

    public void doUserPage() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doFoundPageTest() throws Exception {
        doFoundPageJump();
        Thread.sleep(300);
        ClickNewNews();
        Thread.sleep(300);
        ClickSafe();
        Thread.sleep(300);
        ClickProduct();
        Thread.sleep(300);
        ClickCompany();
        Thread.sleep(300);
        doUserPage();
    }
}
