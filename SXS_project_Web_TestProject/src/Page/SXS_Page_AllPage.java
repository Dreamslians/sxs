package Page;

import org.openqa.selenium.WebDriver;

public class SXS_Page_AllPage extends Page {

	public SXS_Page_AllPage(WebDriver driver) {
		super(driver);
	}

	public void clickHomePageLog() {
		getElement("HomePageLog").click();
	}

	public void clickHomePage_Assert() {
		getElement("HomePage_Assert").click();
	}

	public void clickProduct_project() {
		getElement("Product_project").click();
	}

	public void clickProduct_Assert() {
		getElement("Product_Assert").click();
	}

	public void clickSaft() {
		getElement("Saft").click();
	}

	public void clickSaft_Assert() {
		getElement("Saft_Assert").click();
	}

	public void clickAboutUs() {
		getElement("AboutUs").click();
	}

	public void clickAbout_Assert() {
		getElement("About_Assert").click();
	}

	public void clickApp_download() {
		getElement("App_download").click();
	}

	public void clickApp_Assert() {
		getElement("App_Assert").click();
	}

	public void testSXSPageCase() {
		clickHomePageLog();
		clickHomePage_Assert();
		clickProduct_project();
		clickProduct_Assert();
		clickSaft();
		clickSaft_Assert();
		clickAboutUs();
		clickAbout_Assert();
		clickApp_download();
		clickApp_Assert();
		clickHomePageLog();
	}
}
