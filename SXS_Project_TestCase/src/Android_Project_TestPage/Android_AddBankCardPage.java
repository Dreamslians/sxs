package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import Android_Project_ExPage.BasePage;
import org.testng.Assert;

/**
 * Created by Dreamslians on 2016/11/18.
 */
public class Android_AddBankCardPage extends BasePage
{

    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    private String valMoney;


    public void doMyPageRechargeButton() throws Exception
    {

        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageRechargeButton")).click();
    }

    public void doMypageRechargeInputMoney(String money) throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MypageRechargeInputMoney")).sendKeys(money);
    }

    public void doMyPageRechargeAddBank() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageRechargeAddBank")).click();
    }

    public void inputMyPageRechargeBankNum() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageRechargeBankNum")).clear();
    }

    public void doMyPageRechargeRechargeButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageRechargeRechargeButton")).click();
    }

    public void doPayMoneyPhone(String Payphone) throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PayMoneyPhone")).clear();
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PayMoneyPhone")).sendKeys(Payphone);
    }

    public void GetCode() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("paymonkeygetCode")).click();
    }

    public void Return() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ReturnButton")).click();
    }

    public void Cancel() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("CancelButton")).click();
    }

    public void doUserButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doRechargeTest(String money) throws Exception
    {
        doMyPageRechargeButton();
        doMypageRechargeInputMoney(money);
        Thread.sleep(500);
        doMyPageRechargeAddBank();
        Thread.sleep(500);
        int width = Android_LoadDevice_NotReset.driver.manage().window().getSize().width;
        int height = Android_LoadDevice_NotReset.driver.manage().window().getSize().height;
        while (true)
        {
            Android_LoadDevice_NotReset.driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 500);
            try
            {
                Android_LoadDevice_NotReset.driver.findElementByXPath("//android.widget.TextView[contains(@text,'招商银行')]").click();
                break;
            } catch (Exception e)
            {
                continue;
            }
        }
        System.out.println("银行卡选择成功");
        inputMyPageRechargeBankNum();
        Android_LoadDevice_NotReset.driver.pressKeyCode(13);
        Android_LoadDevice_NotReset.driver.pressKeyCode(9);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Android_LoadDevice_NotReset.driver.pressKeyCode(11);
        Android_LoadDevice_NotReset.driver.pressKeyCode(15);
        Android_LoadDevice_NotReset.driver.pressKeyCode(10);
        Android_LoadDevice_NotReset.driver.pressKeyCode(7);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Android_LoadDevice_NotReset.driver.pressKeyCode(7);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Android_LoadDevice_NotReset.driver.pressKeyCode(13);
        Android_LoadDevice_NotReset.driver.pressKeyCode(9);
        Android_LoadDevice_NotReset.driver.pressKeyCode(16);
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
        Android_LoadDevice_NotReset.driver.pressKeyCode(16);
        Android_LoadDevice_NotReset.driver.pressKeyCode(10);
        System.out.println("银行卡号码：" + Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageRechargeBankNum")).getText());
        doMyPageRechargeRechargeButton();
        valMoney = money;
        Assert.assertEquals(money, Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("AssInputmonkey")).getText());
        System.out.println("金额校验成功");
    }

    public void InputPayPhone(String Payphone) throws Exception
    {
        Assert.assertEquals(Payphone, Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("PayMoneyPhone")).getText());
        doPayMoneyPhone(Payphone);
        GetCode();
        if (Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("paymonkeygetCode")).getText().contains("S"))
        {
            System.out.println("绑卡成功");
            Thread.sleep(2000);
            Return();
            Cancel();
            Assert.assertEquals(valMoney, Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MypageRechargeInputMoney")).getText());
            System.out.println("金额校验成功");
        } else
        {
            System.out.println("绑卡失败");
        }

    }
}
