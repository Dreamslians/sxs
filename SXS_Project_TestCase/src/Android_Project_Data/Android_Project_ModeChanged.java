package Android_Project_Data;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_Project_ModeChanged {
	Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	@BeforeTest
	public void doBefore() throws Exception {
		an.setUp();
	}

	@Test
	public void doChangeMode() throws InterruptedException {
		Thread.sleep(2000);
		
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/start_ad_rl_next")).click();
		Thread.sleep(3000);
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_guarantee")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_guarantee")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_guarantee")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_guarantee")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_bank")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_bank")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/frg_home_ll_ll_img_bank")).click();

		an.driver.findElement(By.id("com.sxsfinance.SXS:id/dia_input_pay_pasd_PwdEditText")).sendKeys("888888");

		an.driver.findElement(By.id("com.sxsfinance.SXS:id/url2")).click();
		an.driver.findElement(By.id("com.sxsfinance.SXS:id/layout_btn_ok")).click();
		an.driver.close();
	}
}
