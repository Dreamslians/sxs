package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_ProductPageInvestPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_ProductPageInvestPage_TestCase
{
	Android_ProductPageInvestPage ai = new Android_ProductPageInvestPage();
	PublicLoginPage pl = new PublicLoginPage();
	PublicLoginOutPage po = new PublicLoginOutPage();
	Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

	@BeforeMethod
	public void doSetUp() throws Exception {
		ai.an.setUp();
	}

	@AfterMethod
	public void TearDown() {
		Android_LoadDevice_NotReset.driver.quit();
	}

	@Test
	public void doInvest() throws Exception {
		try
		{
			pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword);
			System.out.println("登录成功");
		}catch (Exception e){
			System.out.println("登录失败");
		}
		if(ag.GetInuseInvestPage().contains("1"))
		{
			try
			{
				ai.doInvest(Baseinfo.InvestMoney);
				System.out.println("恭喜您本次投资" + Baseinfo.InvestMoney + "成功，谢谢~");
				po.doLoginOutByUserPage();
				System.out.println("********************成功********************");
			} catch (Exception e)
			{
				Android_LoadDevice_NotReset.driver.closeApp();
				Android_LoadDevice_NotReset.driver.launchApp();
				po.doLoginOutByResetApp();
				System.out.println("**********************失败*********************");
			}
		}else{
			System.out.println("失败");
		}
	}
}
