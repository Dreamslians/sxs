package Android_Project_ByMyself;

import org.testng.annotations.Test;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class Android_HasLoginInvestment_TestCase {
	Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
	
	@BeforeMethod
	public void doBefore() throws Exception {
		an.setUp();
	}

	@AfterMethod
	public void tearDown() {
		an.driver.quit();
	}

	@Test
	public void doInvestment() throws Exception {

		String InvestMentMoney = "3000";
		String BankNumber = "6225758312340987";

		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(5000);
//		System.out.println(an.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageProductOne")).getText()+"打印元素输出结果");
		an.driver.findElementByName("DQ16110111").click();
//		an.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageProductOne")).click();

		// AndroidElement e = null;
		// an.driver.findElementsByXPath("//android.widget.TextView[contains@text,'DQ16102811']");
		// assertThat(e.getText(), equalTo("DQ16102811"));
		// e.click();

		// List<AndroidElement> elelist = an.driver.findElements(
		// By.xpath("//android.widget.LinearLayout[5]/android.widget.LinearLayout[0]/android.widget.LinearLayout[0]/android.widget.TextView[1]"));
		// System.out.println(elelist);
		// 元素动态更新，无法准确定位
		// an.driver
		// .findElementByXPath(
		// "//android.widget.ListView[7]/android.widget.LinearLayout[0]/android.widget.TextView[0]")
		// .click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSubmitButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentMoneySureText")).click();

		AssertJUnit.assertEquals("1000元起投,金额需为1000的整数倍",
				an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentMoneySureText")).getText());

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).clear();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).sendKeys(InvestMentMoney);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageCanUsedRedBag")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageNotUseRedBag")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageUseRedBag")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageCanUseRedBagReturnButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageNeedPayMoney")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageAgreeTextButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageAgreeTextButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSureSubmitButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestmentTittle")).click();
		AssertJUnit.assertEquals("确认购买", "确认购买");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestSureMoney")).click();
		AssertJUnit.assertEquals(InvestMentMoney, InvestMentMoney);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestBankChoosed")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestBankTittle")).click();
		AssertJUnit.assertEquals("银行卡列表", "银行卡列表");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestBankName")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestBankListReturnButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestBankNumber")).clear();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("BankNumber")).sendKeys(BankNumber);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageSureInvestSubmit")).click();
	}

}
