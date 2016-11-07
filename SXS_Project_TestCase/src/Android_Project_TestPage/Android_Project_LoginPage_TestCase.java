package Android_Project_TestPage;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Android_Project_LoginPage_TestCase {
	Android_Project_LoginPage al = new Android_Project_LoginPage();

	String TelephoneNumber = "17301216004";
	String PassWord = "qqqqqq";

	@BeforeMethod
	public void doBefore() throws Exception {
		al.an.setUp();

	}

	@AfterMethod
	public void TearDown() {
		al.an.driver.quit();
	}

	@Test(priority = 1)
	public void doLoginTestForSuccess() throws Exception {
		al.doLogin(TelephoneNumber, PassWord);
		Assert.assertEquals("我的资产", al.an.driver.findElement(al.ao.getLocaator("TredtyTextTittle")).getText());
		al.doLoginOut();
		Assert.assertEquals("首页", al.an.driver.findElement(al.ao.getLocaator("HomePageButton")).getText());
		al.doLoginOut();
	}

	@Test(priority = 2)
	public void doLoginTestForFail() throws Exception {
		al.doLogin(TelephoneNumber, "qqqqqqq");
		Assert.assertEquals("请输入验证码",
				al.an.driver.findElement(al.ao.getLocaator("LoginPageVerifyCodeInput")).getText());
	}

	@Test(priority = 3)
	public void doLoginTestForFailTwo() throws Exception {
		al.doLogin("17301216000", PassWord);
		Assert.assertEquals("请输入验证码",
				al.an.driver.findElement(al.ao.getLocaator("LoginPageVerifyCodeInput")).getText());
	}

	@Test(priority = 4)
	public void doLoginTestForFailThree() throws Exception {
		al.doLogin("17301216000", "qqqq");
		Assert.assertEquals("请输入密码", al.an.driver.findElement(al.ao.getLocaator("LoginPagePasswordText")).getText());
	}

	@Test(priority = 5)
	public void doLoginTestForFailFour() throws Exception {
		al.doLogin("", "");
		Assert.assertEquals("请输入手机号码", al.an.driver.findElement(al.ao.getLocaator("LoginPageUsernameText")).getText());
	}
}
