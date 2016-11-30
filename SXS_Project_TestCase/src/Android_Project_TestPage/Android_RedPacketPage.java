package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_RedPacketPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doRedpacketButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'我的红包(元)')]").click();
    }
}
