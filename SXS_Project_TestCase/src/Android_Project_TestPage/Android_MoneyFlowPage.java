package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/28.
 */
public class Android_MoneyFlowPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doMoneyFlowButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'资金流水记录')]").click();
    }

    public void doMoneyFlowtittle() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowtittle")).click();
    }

    public void doMoneyFlowAll() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowAll")).click();
    }

    public void doMoneyFlowRecharge() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowRecharge")).click();
    }

    public void doMoneyFlowTQMoney() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowTQMoney")).click();
    }

    public void doMoneyFlowInvest() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowInvest")).click();
    }

    public void doMoneyFLowHSMoney() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFLowHSMoney")).click();
    }

    public void doMoneyFlowReturn() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MoneyFlowReturn")).click();
    }

    public void doMoneyFlowTest() throws Exception
    {
        Thread.sleep(200);
        doMoneyFlowButton();
        Thread.sleep(200);
        doMoneyFlowtittle();
        doMoneyFlowAll();
        doMoneyFlowtittle();
        doMoneyFlowRecharge();
        doMoneyFlowtittle();
        doMoneyFlowTQMoney();
        doMoneyFlowtittle();
        doMoneyFlowInvest();
        doMoneyFlowtittle();
        doMoneyFLowHSMoney();
        doMoneyFlowReturn();
    }
}
