package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_SF_HistoryPage
{
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doSF_History() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'师傅化缘记录')]").click();
    }

    public void doTittle() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'师傅化缘投资记录')]").click();
    }

    public void doFirst_SF() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.LinearLayout[contains(@index,'1')]").click();
    }

    public void doHistoryBySF_PPZQ() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HistoryBySF_PPZQ")).click();
    }

    public void doReturn() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ReturnButton")).click();
    }

    public void doHistoryBySF_AgreeLook() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HistoryBySF_AgreeLook")).click();
    }

    public void doReturnByAgreeLook() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ReturnButton")).click();
    }

    public void doHistoryBySF_LookExit() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HistoryBySF_LookExit")).click();
    }
    public void doHistoryBySF_LookExitRetuen() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("HistoryBySF_LookExitRetuen")).click();
    }

    public void doFS_HistoryTest() throws Exception
    {
        Thread.sleep(300);
        doSF_History();
        Thread.sleep(300);
        doTittle();
        Thread.sleep(300);
        doFirst_SF();
        Thread.sleep(300);
        doHistoryBySF_PPZQ();
        Thread.sleep(300);
        doReturn();
        Thread.sleep(300);
        doHistoryBySF_AgreeLook();
        Thread.sleep(300);
        doReturnByAgreeLook();
        Thread.sleep(300);
        doReturn();
        Thread.sleep(300);
        doHistoryBySF_LookExit();
        Thread.sleep(300);
       doHistoryBySF_LookExitRetuen();
        Thread.sleep(300);
        doReturn();
        Thread.sleep(300);
    }
}
