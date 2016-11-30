package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_NewsAllPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doHomePageButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HomePageButton")).click();
    }

    public void doHomePageNewsAll() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HomePageNewsAll")).click();
    }

    public void doNewsByFirst() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.LinearLayout[contains(@index,'0')]").click();
    }

    public void doHomePageNewsReturnbutton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HomePageNewsReturnbutton")).click();
    }

    public void doUserButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("UserButton")).click();
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

