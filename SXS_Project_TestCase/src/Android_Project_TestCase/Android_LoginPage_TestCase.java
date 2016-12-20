package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_LoginPage;
import org.testng.annotations.Test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Android_LoginPage_TestCase
{
	Android_LoginPage al = new Android_LoginPage();
	PublicLoginPage pl = new PublicLoginPage();
	PublicLoginOutPage po = new PublicLoginOutPage();
	Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

	@BeforeMethod
	public void doBefore() throws Exception {
		al.an.setUp();

	}

	@AfterMethod
	public void TearDown() {
		Android_LoadDevice_NotReset.driver.quit();
	}

	@Test(priority = 1)
	public void doLoginTestForSuccess() throws Exception {
		try
		{
			pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord);
			System.out.println("登录成功");
		}catch (Exception e){
			System.out.println("登录失败");
		}
		if(ag.GetInuseByLoginPage().contains("1"))
		{
			try
			{
				Assert.assertEquals("我的资产(元)",
						Android_LoadDevice_NotReset.driver.findElement(al.ao.getLocaator("TredtyTextTittle")).getText());
				po.doLoginOutByUserPage();
				Assert.assertEquals("首页",
						Android_LoadDevice_NotReset.driver.findElement(al.ao.getLocaator("HomePageButton")).getText());
				System.out.println("*****************成功*****************");
			} catch (Exception e)
			{
				Android_LoadDevice_NotReset.driver.closeApp();
				Android_LoadDevice_NotReset.driver.launchApp();
				po.doLoginOutByResetApp();
				System.out.println("*****************失败******************");
			}
		}else{
			System.out.println("失败");
		}
	}

	@Test(priority = 2)
	public void doLoginTestForFail() throws Exception {
		pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginLongWrongPassWord);
		Assert.assertEquals("请输入验证码", Android_LoadDevice_NotReset.driver
				.findElement(al.ao.getLocaator("LoginPageVerifyCodeInput")).getText());
	}

	@Test(priority = 3)
	public void doLoginTestForFailTwo() throws Exception {
		pl.doLoginByJump(Baseinfo.LoginWrongTelephoneNumber, Baseinfo.LoginPassWord);
		Assert.assertEquals("请输入验证码", Android_LoadDevice_NotReset.driver
				.findElement(al.ao.getLocaator("LoginPageVerifyCodeInput")).getText());
	}

	@Test(priority = 4)
	public void doLoginTestForFailThree() throws Exception {
		pl.doLoginByJump(Baseinfo.LoginNullTelephoneNumber, Baseinfo.LoginNullPassWord);
		Assert.assertEquals("请输入手机号码",
				Android_LoadDevice_NotReset.driver.findElement(al.ao.getLocaator("LoginPageUsernameText")).getText());
	}
}
