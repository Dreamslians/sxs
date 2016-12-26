package Android_Project_ByMyself;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Android_Register_TestCase {

	Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	@BeforeTest
	public void doBefore() throws Exception {
		an.setUp();
	}

	@Test
	public void doRegister() throws Exception {
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
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(1000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageRegisterButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageTelephone")).sendKeys("15011111111");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterCode")).click();
		Thread.sleep(3000);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterCodeText")).sendKeys(verify);

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageAgreeButton")).click();
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageAgreeButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterText")).click();
		AssertJUnit.assertEquals("沙小僧理财用户协议", "沙小僧理财用户协议");

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterTextReturnButton")).click();

		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterButton")).click();
		Thread.sleep(3000);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageVerifyCode")).sendKeys(verify);
		an.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterButton")).click();

	}

}
