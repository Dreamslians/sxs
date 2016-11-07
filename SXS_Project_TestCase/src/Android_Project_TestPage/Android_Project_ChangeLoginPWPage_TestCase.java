package Android_Project_TestPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_Project_ChangeLoginPWPage_TestCase {

	Android_Project_ChangeLoginPWPage ac = new Android_Project_ChangeLoginPWPage();
	String TelephoneNumber = "17301216017";
	String PassWord = "123456";
	String NewPW = "qqqqqq";
	String NewPWAgain = "qqqqqq";

	@BeforeMethod
	public void doSetUp() throws Exception {
		ac.an.setUp();
	}

	@AfterMethod
	public void TearDown() {
		ac.an.driver.quit();
	}

	@Test
	public void doChangePassword() throws Exception {
		ac.doLogin(TelephoneNumber, PassWord);
		ac.doChangePassWord(PassWord, NewPW, NewPWAgain);
		ac.doNoJumpLogin(TelephoneNumber, NewPW);
	}
}
