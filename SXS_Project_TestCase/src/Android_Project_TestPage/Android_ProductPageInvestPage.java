package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.junit.Assert;



public class Android_ProductPageInvestPage extends BasePage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	public void doProductButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductButton")).click();
	}

	public void doProductPageBigInvestButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductPageBigInvestButton")).click();
	}

	public void doProductMorePageInvestmentMoneySureText() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentMoneySureText"))
				.click();
	}

	public void doProductMorePageInvestmentStartMoney(String StartMoney) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney"))
				.sendKeys(StartMoney);
	}

	public void doProductMorePageCanUsedRedBag() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageCanUsedRedBag")).click();
	}

	public void doProductMorePageCanUseRedBagReturnButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageCanUseRedBagReturnButton"))
				.click();
	}

	public void doProductMorePageAgreeTextButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageAgreeTextButton")).click();
	}

	public void doProductMorePageInvestmentSureSubmitButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSureSubmitButton"))
				.click();
	}

	public void doProductMorePageInvestmentFinshButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentFinshButton")).click();
	}

	public void doProductMorePageFinshReturnButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageFinshReturnButton")).click();
	}

	public void doInvest(String StartMoney) throws Exception {
		doProductButton();
		doProductPageBigInvestButton();
		Thread.sleep(600);
		doProductMorePageInvestmentMoneySureText();
		Assert.assertEquals("1000元起投,金额需为1000的整数倍", Android_LoadDevice_NotReset.driver
				.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentMoneySureText")).getText());
		Assert.assertEquals("10000", Android_LoadDevice_NotReset.driver
				.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentStartMoney")).getText());
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
