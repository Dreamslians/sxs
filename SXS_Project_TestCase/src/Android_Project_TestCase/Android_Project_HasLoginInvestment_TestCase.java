package Android_Project_TestCase;

import org.testng.annotations.Test;

import java.util.List;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;
import io.appium.java_client.android.AndroidElement;

public class Android_Project_HasLoginInvestment_TestCase {
	Android_Project_NotReset an = new Android_Project_NotReset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

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
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
		Thread.sleep(5000);
//		System.out.println(an.driver.findElement(ao.getLocaator("HomePageProductOne")).getText()+"打印元素输出结果");
		an.driver.findElementByName("DQ16110111").click();
//		an.driver.findElement(ao.getLocaator("HomePageProductOne")).click();

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
		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentSubmitButton")).click();
		Thread.sleep(2000);
		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentMoneySureText")).click();

		AssertJUnit.assertEquals("1000元起投,金额需为1000的整数倍",
				an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentMoneySureText")).getText());

		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentStartMoney")).clear();
		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentStartMoney")).sendKeys(InvestMentMoney);

		an.driver.findElement(ao.getLocaator("ProductMorePageCanUsedRedBag")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageNotUseRedBag")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageUseRedBag")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageCanUseRedBagReturnButton")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePageNeedPayMoney")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageAgreeTextButton")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageAgreeTextButton")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentSureSubmitButton")).click();
		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestmentTittle")).click();
		AssertJUnit.assertEquals("确认购买", "确认购买");

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestSureMoney")).click();
		AssertJUnit.assertEquals(InvestMentMoney, InvestMentMoney);

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestBankChoosed")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestBankTittle")).click();
		AssertJUnit.assertEquals("银行卡列表", "银行卡列表");
		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestBankName")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestBankListReturnButton")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestBankNumber")).clear();
		an.driver.findElement(ao.getLocaator("BankNumber")).sendKeys(BankNumber);

		an.driver.findElement(ao.getLocaator("ProductMorePageSureInvestSubmit")).click();
	}

	private void assertThat(String text, Object equalTo) {
		// TODO Auto-generated method stub

	}

	private Object equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
