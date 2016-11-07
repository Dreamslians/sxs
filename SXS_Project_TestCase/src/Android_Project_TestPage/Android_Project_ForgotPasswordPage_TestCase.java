package Android_Project_TestPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_Project_ForgotPasswordPage_TestCase {

	Android_Project_ForgotPasswordPage ap = new Android_Project_ForgotPasswordPage();
	String Telephone = "17301216018";
	String Password = "qqqqqq";
	String NewPassword = "qqqqqq";

	@BeforeMethod
	public void doSetup() throws Exception {
		ap.an.setUp();
	}

	@AfterMethod
	public void TearDown() {
		ap.an.driver.quit();
	}

	@Test
	public void doForgotPasswordTest() throws Exception {
		ap.SendTelephone(Telephone);
		String verify = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://123.57.72.212:8301/sxs_vault", "test",
					"mysqltest2016");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216018' ORDER BY id DESC LIMIT 1;");
			rs.next();
			verify = rs.getString("verify");
		} catch (Exception e) {
			System.out.println(e);
		}
		ap.SendVerifyCode(verify, Password, NewPassword);
		System.out.println(Telephone + "号码修改密码成功，密码修改为" + Password);
		Assert.assertEquals(Telephone, Telephone);
		ap.FinshForgotPassword(Telephone, Password);
		System.out.println(Telephone + "的密码修改之后成功登陆");
		Assert.assertEquals("我的资产", ap.an.driver.findElement(ap.ao.getLocaator("MyPageTittle")).getText());
		ap.doLoginOut();
		System.out.println(Telephone + "退出登陆");
	}
}
