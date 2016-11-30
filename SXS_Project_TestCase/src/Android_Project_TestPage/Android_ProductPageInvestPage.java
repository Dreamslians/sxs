package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.junit.Assert;



public class Android_ProductPageInvestPage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
	public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	public void doProductButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductButton")).click();
	}

	public void doProductPageBigInvestButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductPageBigInvestButton")).click();
	}

	public void doProductMorePageInvestmentMoneySureText() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageInvestmentMoneySureText"))
				.click();
	}

	public void doProductMorePageInvestmentStartMoney(String StartMoney) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageInvestmentStartMoney")).clear();
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageInvestmentStartMoney"))
				.sendKeys(StartMoney);
	}

	public void doProductMorePageCanUsedRedBag() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageCanUsedRedBag")).click();
	}

	public void doProductMorePageCanUseRedBagReturnButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageCanUseRedBagReturnButton"))
				.click();
	}

	public void doProductMorePageAgreeTextButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageAgreeTextButton")).click();
	}

	public void doProductMorePageInvestmentSureSubmitButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageInvestmentSureSubmitButton"))
				.click();
	}

	public void doProductMorePageInvestmentFinshButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageInvestmentFinshButton")).click();
	}

	public void doProductMorePageFinshReturnButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("ProductMorePageFinshReturnButton")).click();
	}

	public void doInvest(String StartMoney) throws Exception {
		doProductButton();
		doProductPageBigInvestButton();
		Thread.sleep(600);
		doProductMorePageInvestmentMoneySureText();
		Assert.assertEquals("1000元起投,金额需为1000的整数倍", Android_LoadDevice_NotReset.driver
				.findElement(ao.getLocaator("ProductMorePageInvestmentMoneySureText")).getText());
		Assert.assertEquals("10000", Android_LoadDevice_NotReset.driver
				.findElement(ao.getLocaator("ProductMorePageInvestmentStartMoney")).getText());
		doProductMorePageInvestmentStartMoney(StartMoney);
//		doProductMorePageCanUsedRedBag();
//		doProductMorePageCanUseRedBagReturnButton();
		doProductMorePageAgreeTextButton();
		doProductMorePageAgreeTextButton();
		doProductMorePageInvestmentSureSubmitButton();
		Thread.sleep(600);
		doProductMorePageInvestmentFinshButton();
		Thread.sleep(500);
		doProductMorePageFinshReturnButton();
	}
}
