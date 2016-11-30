package Android_Project_Data;

import org.testng.annotations.BeforeMethod;

import Android_Project_ExPage.Baseinfo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

public class Android_LoadDevice_AirplaneMode {
	public AndroidDriver driver;

	@BeforeMethod
	@BeforeClass
	public void setUp() throws Exception {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "./apps");
		File app = new File(appDir, "SXSFinanceAndroid1.2.2.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("noSign", "True");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("deviceName", Baseinfo.AndroidDriverName);
		capabilities.setCapability("platformVersion", Baseinfo.AndroidplatformVersion);
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", Baseinfo.AndroidappPackage);
		capabilities.setCapability("appActivity", Baseinfo.AndroidappActivity);
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");
		try {
			driver = new AndroidDriver(new URL(Baseinfo.AndroidDriverURL), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		NetworkConnectionSetting airplaneMode = new NetworkConnectionSetting(1);
		driver.setNetworkConnection(airplaneMode);
		System.out.println(driver.getNetworkConnection().value);
	}
}
