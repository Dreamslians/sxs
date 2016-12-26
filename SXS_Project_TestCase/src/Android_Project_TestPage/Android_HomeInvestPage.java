package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.testng.Assert;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_HomeInvestPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    public void doHomePageButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageButton")).click();
    }
    public void doHomePageInvestButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'DQ16121913')]").click();
    }
    public void doProductMorePageTreatyText() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageTreatyText")).click();
    }
    public void doTredtyTextTittle() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextTittle")).click();
    }
    public void doTredtyTextReturnButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextReturnButton")).click();
    }
    public void doProductMorePagePlanDetailText() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePagePlanDetailText")).click();
    }
    public void doPlanDetailtittle() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailtittle")).click();
    }
    public void doPlanDetailReturnButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailReturnButton")).click();
    }
    public void doProductMorePageInvestmentRecord() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentRecord")).click();
    }
    public void doInvestmentRecordTittle() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordTittle")).click();
    }
    public void doInvestmentRecordReturnButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordReturnButton")).click();
    }
    public void doProductMorePageInvestmentSubmitButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSubmitButton")).click();
    }
    public void doProductMorePageInvestmentMoneySureText() throws Exception{
        Assert.assertEquals("1000元起投,金额需为1000的整数倍",Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentMoneySureText")).getText());
    }
    public void doProductMorePageInvestmentStartMoney(String Money)throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).sendKeys(Money);
    }
    public void doProductMorePageInvestmentSureSubmitButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSureSubmitButton")).click();
    }
    //相对元素定位，不准确，费时间
    public void doProductMorePageInvestmentSureSubmitButtonByOk() throws Exception{
//        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.Button[contains(@text,'完成')]").click();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSureSubmitButtonByOk")).click();
    }
    public void doProductMorePageInvestMentSureSubmitButtonByReturn() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestMentSureSubmitButtonByReturn")).click();
    }
    public void doHomePageInvestTest(String Money) throws Exception{
        doHomePageButton();
        doHomePageInvestButton();
        doProductMorePageTreatyText();
        doTredtyTextTittle();
        doTredtyTextReturnButton();
        doProductMorePagePlanDetailText();
        doPlanDetailtittle();
        doPlanDetailReturnButton();
        doProductMorePageInvestmentRecord();
        doInvestmentRecordTittle();
        doInvestmentRecordReturnButton();
        doProductMorePageInvestmentSubmitButton();
        doProductMorePageInvestmentMoneySureText();
        doProductMorePageInvestmentStartMoney(Money);
        doProductMorePageInvestmentSureSubmitButton();
        Thread.sleep(1000);
        doProductMorePageInvestmentSureSubmitButtonByOk();
        Thread.sleep(500);
        doProductMorePageInvestMentSureSubmitButtonByReturn();
    }
}
