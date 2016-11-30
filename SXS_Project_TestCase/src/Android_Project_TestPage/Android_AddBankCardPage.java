package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_AddBankCardPage
{
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doMyPageRechargeButton() throws Exception {

        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageRechargeButton")).click();
    }

    public void doMypageRechargeInputMoney(String money) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MypageRechargeInputMoney")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MypageRechargeInputMoney")).sendKeys(money);
    }

    public void doMyPageRechargeAddBank() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageRechargeAddBank")).click();
    }

    public void doChooseBank() throws Exception {
        Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'中国工商银行')]").click();
    }

    public void inputMyPageRechargeBankNum(String Number) throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageRechargeBankNum")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageRechargeBankNum")).sendKeys(Number);
    }

    public void doMyPageRechargeRechargeButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageRechargeRechargeButton")).click();
    }

    public void doRechargeTest(String money, String Number) throws Exception {
        doMyPageRechargeButton();
        doMypageRechargeInputMoney(money);
        doMyPageRechargeAddBank();
        doChooseBank();
        inputMyPageRechargeBankNum(Number);
        doMyPageRechargeRechargeButton();
    }
}
