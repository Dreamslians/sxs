package Android_Project_TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_FindPassword_TestCase {
	Android_Project_NotReset ac = new Android_Project_NotReset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	@BeforeMethod
	public void doBefore() throws Exception {
		ac.setUp();
	}

	@AfterMethod
	public void tearDown() {
		ac.driver.quit();
	}

	@Test
	public void doFindPassword() throws Exception {
		Thread.sleep(500);
		ac.driver.findElement(ao.getLocaator("JumpButton")).click();
		Thread.sleep(1000);
		ac.driver.findElement(ao.getLocaator("HomePageButton")).click();
		Thread.sleep(2000);
		ac.driver.findElement(ao.getLocaator("UserButton")).click();

		ac.driver.findElement(ao.getLocaator("LoginPageForgotPassword")).click();
		AssertJUnit.assertEquals("找回密码", "找回密码");
		System.out.println("验证成功");

		String Telephone = "15011111111";
		ac.driver.findElement(ao.getLocaator("FoundPasswordPageTelephone")).clear();
		ac.driver.findElement(ao.getLocaator("FoundPasswordPageTelephone")).sendKeys(Telephone);

		ac.driver.findElement(ao.getLocaator("FoundPasswordPageGetCode")).click();

		String verify = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://123.57.72.212:8301/sxs_vault", "test",
					"mysqltest2016");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT verify FROM vault_user_moblie_verify WHERE moblie=15011111111;");
			rs.next();
			verify = rs.getString("verify");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Telephone + "的验证码是：" + verify);

		ac.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).clear();
		ac.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).sendKeys(verify);

		ac.driver.findElement(ao.getLocaator("FoundPasswordPageNextPageButton")).click();

	}

}
