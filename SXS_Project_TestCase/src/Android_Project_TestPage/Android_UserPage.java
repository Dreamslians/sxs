package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_UserPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doUserpgaeYseterday() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserpgaeYseterday")).click();
    }

    public void doReturnbutton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.ImageView[contains(@index,'0')]").click();
//        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageNewsReturnbutton")).click();
    }

    public void doUserpageLj() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserpageLj")).click();
    }

    public void doUserpageCanUsed() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserpageCanUsed")).click();
    }

    public void doUserpageDj() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserpageDj")).click();
    }

    public void doQD() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserpageQD")).click();
    }

    public void doUserPageTest() throws Exception {
        /*
             ----------------
            +       +       +       /\/|+++(\
           + +     + +     +  +    /\/|++++(\
          +   +  +    +  +     +  /\/|+++++(\
         +     +       +        +/\/|++++++(\
         -------------------------
         */
        doUserpgaeYseterday();
        Thread.sleep(200);
        doReturnbutton();
        Thread.sleep(100);
        doUserpageLj();
        Thread.sleep(200);
        doReturnbutton();
        Thread.sleep(200);
        doUserpageCanUsed();
        doUserpageDj();
        Thread.sleep(300);
        doQD();
    }
}