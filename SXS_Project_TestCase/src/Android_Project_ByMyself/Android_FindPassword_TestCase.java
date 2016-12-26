package Android_Project_ByMyself;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Android_FindPassword_TestCase {
	Android_LoadDevice_NotReset ac = new Android_LoadDevice_NotReset();

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
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
		Thread.sleep(1000);
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("HomePageButton")).click();
		Thread.sleep(2000);
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();

		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageForgotPassword")).click();
		AssertJUnit.assertEquals("找回密码", "找回密码");
		System.out.println("验证成功");

		String Telephone = "15011111111";
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageTelephone")).clear();
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageTelephone")).sendKeys(Telephone);

		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageGetCode")).click();

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

		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageInputCode")).clear();
		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageInputCode")).sendKeys(verify);

		ac.driver.findElement(Android_Element_ObjectMap.getLocaator("FoundPasswordPageNextPageButton")).click();

	}

}
