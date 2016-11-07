package Android_Project_Data;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class Android_Project_NotReset {
	public AndroidDriver driver;

	public void setUp() throws Exception {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "./apps");
		File app = new File(appDir, "沙小僧理财.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("noSign", "True");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("deviceName", "192.168.56.101:5555");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.sxsfinance.SXS");
		capabilities.setCapability("appActivity", "com.sxsfinance.SXS.actvity.GuidepageActivity");
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");
		try {
			driver = new AndroidDriver(new URL("http://192.168.1.43:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
