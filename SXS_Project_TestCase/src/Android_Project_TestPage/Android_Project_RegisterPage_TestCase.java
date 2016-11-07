package Android_Project_TestPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Android_Project_Data.Android_Project_RandomTelephoneNumber;

public class Android_Project_RegisterPage_TestCase {

	Android_Project_RegisterPage ar = new Android_Project_RegisterPage();
	Android_Project_RandomTelephoneNumber at = new Android_Project_RandomTelephoneNumber();
	String Telephone = "17301216018";
	String RanTelephone = at.randomtelephonenumber();
	String PassWord = "qqqqqq";
	String NewPassWord = "qqqqqq";

	@BeforeMethod
	public void doBefore() throws Exception {
		ar.an.setUp();
	}

	@AfterMethod
	public void TearDown() throws Exception {
		ar.an.driver.quit();
	}

	// 注册成功案例-----手机号码&验证码正确
	@Test(priority = 1)
	public void doRegister() throws Exception {
		ar.doSendTelephone(Telephone);
		String verify = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://123.57.72.212:8301/sxs_vault", "test",
					"mysqltest2016");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216018' ORDER BY id DESC LIMIT 1;");
			rs.next();
			verify = rs.getString("verify");
		} catch (Exception e) {
			System.out.println(e);
		}
		ar.SendVerfy(verify, PassWord, NewPassWord);
		Assert.assertEquals("我的资产", ar.an.driver.findElement(ar.ao.getLocaator("SettingPageTittle")).getText());
		System.out.println(Telephone + "注册成功");
		ar.doLoginOut();
	}

	// 注册失败案例-----手机号码正确&验证码错误
	@Test(priority = 2)
	public void doRegisterFailByVerifyCode() throws Exception {
		ar.doSendTelephone(RanTelephone);
		ar.doRegisterPageRegisterCodeText("123456");
		ar.doRegisterPageRegisterButton();
		Assert.assertEquals("请输入验证码", ar.an.driver.findElement(ar.ao.getLocaator("RegisterPageVerify")).getText());
	}

	// 注册失败案例-----手机号码&验证码 错误
	@Test(priority = 3)
	public void doRegisterFailByTelephoneAndVerifyCode() throws Exception {
		ar.doSendTelephone("1730121600");
		ar.doRegisterPageRegisterCodeText("123456");
		ar.doRegisterPageRegisterButton();
		Assert.assertEquals("请输入手机号码", ar.an.driver.findElement(ar.ao.getLocaator("RegisterPageTelephone")).getText());
	}

	@Test(priority = 4)
	public void doRegisterFailByAll() throws Exception {
		ar.doSendTelephone("");
		ar.doRegisterPageRegisterCodeText("");
		ar.doRegisterPageRegisterButton();
		Assert.assertEquals("请输入手机号码", ar.an.driver.findElement(ar.ao.getLocaator("RegisterPageTelephone")).getText());
		Assert.assertEquals("请输入验证码", ar.an.driver.findElement(ar.ao.getLocaator("RegisterPageVerify")).getText());
	}
}
