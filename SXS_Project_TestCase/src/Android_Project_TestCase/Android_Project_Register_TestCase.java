package Android_Project_TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.BeforeTest;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_Register_TestCase {

	Android_Project_NotReset an = new Android_Project_NotReset();

	@BeforeTest
	public void doBefore() throws Exception {
		an.setUp();
	}

	@Test
	public void doRegister() throws Exception {
		Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");
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
		Thread.sleep(500);
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
		Thread.sleep(1000);
		an.driver.findElement(ao.getLocaator("UserButton")).click();

		an.driver.findElement(ao.getLocaator("LoginPageRegisterButton")).click();

		an.driver.findElement(ao.getLocaator("RegisterPageTelephone")).sendKeys("15011111111");

		an.driver.findElement(ao.getLocaator("RegisterPageRegisterCode")).click();
		Thread.sleep(3000);

		an.driver.findElement(ao.getLocaator("RegisterPageRegisterCodeText")).sendKeys(verify);

		an.driver.findElement(ao.getLocaator("RegisterPageAgreeButton")).click();
		an.driver.findElement(ao.getLocaator("RegisterPageAgreeButton")).click();

		an.driver.findElement(ao.getLocaator("RegisterPageRegisterText")).click();
		AssertJUnit.assertEquals("沙小僧理财用户协议", "沙小僧理财用户协议");

		an.driver.findElement(ao.getLocaator("RegisterPageRegisterTextReturnButton")).click();

		an.driver.findElement(ao.getLocaator("RegisterPageRegisterButton")).click();
		Thread.sleep(3000);
		an.driver.findElement(ao.getLocaator("RegisterPageVerifyCode")).sendKeys(verify);
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterButton")).click();

	}

}
