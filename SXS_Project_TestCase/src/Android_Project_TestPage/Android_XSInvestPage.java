package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.testng.Assert;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_XSInvestPage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doProductPage() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductButton")).click();
    }

    public void doProductPageSFInvest() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageSFInvest")).click();
    }

    public void doProductPageXSInvest() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvest")).click();
    }

    public void doProductPageXSInvestInvestButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestInvestButton")).click();
    }

    public void doProductPageXSInvestTools() throws Exception {
        Assert.assertEquals("100元起投,金额需为100的整数倍", Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestTools")).getText());
    }

    public void doProductPageXSInvestMoneyAdd() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyAdd")).click();
    }

    public void doProductPageXSInvestMoneyLost() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyLost")).click();
    }

    public void doProductPageXSInvestMoneyInput(String money) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyInput")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyInput")).sendKeys(money);
    }

    public void doProductPageXSInvestMoneyAgree() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyAgree")).click();
    }

    public void doProductPageXSInvestMoneySubmit() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneySubmit")).click();
    }

    public void doProductPageXSInvestMoneyOk() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageXSInvestMoneyOk")).click();
    }

    public void doProductMorePageFinshReturnButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageFinshReturnButton")).click();
    }

    public void doUserPage() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doXSInvestTest(String money) throws Exception {
        doProductPage();
        doProductPageXSInvest();
        doProductPageXSInvestInvestButton();
        doProductPageXSInvestTools();
        doProductPageXSInvestMoneyAdd();
        doProductPageXSInvestMoneyLost();
        doProductPageXSInvestMoneyInput(money);
        Thread.sleep(100);
        doProductPageXSInvestMoneySubmit();
        Thread.sleep(500);
        doProductPageXSInvestMoneyOk();
        Thread.sleep(200);
        doProductMorePageFinshReturnButton();
        Thread.sleep(200);
        doUserPage();
    }

    public void doXS_History_Invest(String money) throws Exception {
        doProductPageXSInvestInvestButton();
        doProductPageXSInvestTools();
        doProductPageXSInvestMoneyAdd();
        doProductPageXSInvestMoneyLost();
        doProductPageXSInvestMoneyInput(money);
        Thread.sleep(100);
        doProductPageXSInvestMoneySubmit();
        Thread.sleep(500);
        doProductPageXSInvestMoneyOk();
        Thread.sleep(400);
        doProductMorePageFinshReturnButton();
        doUserPage();
    }

    public void doXS_History_InvestByMorePage(String money) throws Exception {
        doProductpageXSMorePage();
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
        doProductPageXSInvestTools();
        doProductPageXSInvestMoneyAdd();
        doProductPageXSInvestMoneyLost();
        doProductPageXSInvestMoneyInput(money);
        Thread.sleep(100);
        doProductPageXSInvestMoneySubmit();
        Thread.sleep(500);
        doProductPageXSInvestMoneyOk();
        Thread.sleep(500);
        doProductMorePageFinshReturnButton();
        Thread.sleep(500);
        doProductMorePageFinshReturnButtonByInvestFinsh();
        Thread.sleep(500);
        doUserPage();
    }

    public void doProductpageXSMorePage() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductpageXSMorePage")).click();
    }

    public void doProductMorePageTreatyText() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageTreatyText")).click();
    }

    public void doTredtyTextTittle() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextTittle")).click();
    }

    public void doTredtyTextReturnButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextReturnButton")).click();
    }

    public void doProductMorePagePlanDetailText() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePagePlanDetailText")).click();
    }

    public void doPlanDetailtittle() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailtittle")).click();
    }

    public void doPlanDetailReturnButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailReturnButton")).click();
    }

    public void doProductMorePageInvestmentRecord() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentRecord")).click();
    }

    public void doInvestmentRecordTittle() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordTittle")).click();
    }

    public void doInvestmentRecordReturnButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordReturnButton")).click();
    }

    public void doProductMorePageInvestmentSubmitButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSubmitButton")).click();
    }

    public void doProductMorePageFinshReturnButtonByInvestFinsh() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageFinshReturnButton")).click();
    }

    public void doMoreXSInvestPageTest(String money) throws Exception {
        doProductPage();
        doProductPageXSInvest();
        doProductpageXSMorePage();
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
        doProductPageXSInvestTools();
        doProductPageXSInvestMoneyAdd();
        doProductPageXSInvestMoneyLost();
        doProductPageXSInvestMoneyInput(money);
        Thread.sleep(300);
        doProductPageXSInvestMoneySubmit();
        Thread.sleep(500);
        doProductPageXSInvestMoneyOk();
        Thread.sleep(400);
        doProductMorePageFinshReturnButton();
        Thread.sleep(500);
        doProductMorePageFinshReturnButtonByInvestFinsh();
        doUserPage();
    }
}
