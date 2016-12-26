package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_RedPacketPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doRedpacketButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'我的红包(元)')]").click();
    }
}
