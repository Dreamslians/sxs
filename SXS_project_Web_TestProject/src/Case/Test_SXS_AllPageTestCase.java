package Case;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Data.Baseinfo;
import Page.SXS_Page_AllPage;

public class Test_SXS_AllPageTestCase {
	WebDriver driver = new FirefoxDriver();
	int runCount = 0;
	@Test
	public void testSXSCase() {
		
			driver.manage().window().maximize();
			driver.get(Baseinfo.URL);
			while (true) {
				System.out.println("Begin to run " + runCount++ + "次");
			SXS_Page_AllPage sa = new SXS_Page_AllPage(driver);
			sa.testSXSPageCase();
			Assert.assertEquals("首页", "首页");
		}
	}
}
