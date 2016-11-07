package Android_Project_TestPage;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_Project_PayPasswordPage_TestCase {

	Android_Project_PayPasswordPage ap = new Android_Project_PayPasswordPage();
	String TelephoneNumber = "17301216017";
	String PassWord = "qqqqqq";
	String One = "1";
	String Two = "2";
	String Three = "3";
	String Four = "4";
	String Five = "5";
	String Sis = "6";

	@BeforeMethod
	public void doSetUp() throws Exception {
		ap.an.setUp();
	}

	@AfterMethod
	public void TearDown() {
		ap.an.driver.quit();
	}

	@Test
	public void SettingPayPassword() throws Exception {

		ap.doLogin(TelephoneNumber, PassWord);

		List<String> Code = new ArrayList<>();
		Code.add(One);
		Code.add(Two);
		Code.add(Three);
		Code.add(Four);
		Code.add(Five);
		Code.add(Sis);
		ap.SendPassWord(Code.get(0), Code.get(1), Code.get(2), Code.get(3), Code.get(4), Code.get(5));

		Assert.assertEquals(TelephoneNumber,
				ap.an.driver.findElement(ap.ao.getLocaator("SettingPageUsername")).getText());
		System.out.println("支付密码是：" + One + Two + Three + Four + Five + Sis);
		ap.doLoginOut();
	}
}
