package Android_Project_ByMyself;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;

public class Android_InvestLogin_TestCase {
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
	public void doInvestLogin() throws Exception {
		Thread.sleep(1000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageProductOne")).click();
		Thread.sleep(1000);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageTreatyText")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextTittle")).click();
		AssertJUnit.assertEquals("沙小僧理财用户协议", "沙小僧理财用户协议");
		System.out.println("协议范本验证成功");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("TredtyTextReturnButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePagePlanDetailText")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailtittle")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("PlanDetailReturnButton")).click();
		System.out.println("计划详情验证成功");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentRecord")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordTittle")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("InvestmentRecordReturnButton")).click();
		System.out.println("投资记录验证成功");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("ProductMorePageInvestmentSubmitButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).clear();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageLoginSubmitButton")).click();
		AssertJUnit.assertEquals("我的资产", "我的资产");
	}
}
