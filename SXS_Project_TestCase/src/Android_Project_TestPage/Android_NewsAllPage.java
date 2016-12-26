package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_NewsAllPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doHomePageButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageButton")).click();
    }

    public void doHomePageNewsAll() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageNewsAll")).click();
    }

    public void doNewsByFirst() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.LinearLayout[contains(@index,'0')]").click();
    }

    public void doHomePageNewsReturnbutton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageNewsReturnbutton")).click();
    }

    public void doUserButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doHomePageNewsTest() throws Exception {
        doHomePageButton();
        doHomePageNewsAll();
        doNewsByFirst();
        doHomePageNewsReturnbutton();
        Thread.sleep(300);
        doHomePageNewsReturnbutton();
        Thread.sleep(300);
        doUserButton();
    }
}

