package Android_Project_ByMyself;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;

public class Android_InvestLogin_TestCase {
	Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
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
	public void doInvestLogin() throws Exception {
		Thread.sleep(1000);
		an.driver.findElement(ao.getLocaator("JumpButton")).click();

		an.driver.findElement(ao.getLocaator("HomePageProductOne")).click();
		Thread.sleep(1000);

		an.driver.findElement(ao.getLocaator("ProductMorePageTreatyText")).click();
		an.driver.findElement(ao.getLocaator("TredtyTextTittle")).click();
		AssertJUnit.assertEquals("沙小僧理财用户协议", "沙小僧理财用户协议");
		System.out.println("协议范本验证成功");
		an.driver.findElement(ao.getLocaator("TredtyTextReturnButton")).click();

		an.driver.findElement(ao.getLocaator("ProductMorePagePlanDetailText")).click();
		an.driver.findElement(ao.getLocaator("PlanDetailtittle")).click();
		an.driver.findElement(ao.getLocaator("PlanDetailReturnButton")).click();
		System.out.println("计划详情验证成功");

		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentRecord")).click();
		an.driver.findElement(ao.getLocaator("InvestmentRecordTittle")).click();
		an.driver.findElement(ao.getLocaator("InvestmentRecordReturnButton")).click();
		System.out.println("投资记录验证成功");

		an.driver.findElement(ao.getLocaator("ProductMorePageInvestmentSubmitButton")).click();

		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).clear();
		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).sendKeys("17301216004");
		an.driver.findElement(ao.getLocaator("LoginPagePasswordText")).sendKeys("qqqqqq");

		an.driver.findElement(ao.getLocaator("LoginPageLoginSubmitButton")).click();
		AssertJUnit.assertEquals("我的资产", "我的资产");
	}
}