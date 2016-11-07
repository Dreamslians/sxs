package Android_Project_TestPage;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_PayPasswordPage {
	Android_Project_NotReset an = new Android_Project_NotReset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	public void doJumpButton() throws Exception {
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
	}

	public void doUserButton() throws Exception {
		an.driver.findElement(ao.getLocaator("UserButton")).click();
	}

	public void doLoginPageUsernameText(String TelephoneNumber) throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).clear();
		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).sendKeys(TelephoneNumber);
	}

	public void doLoginPagePasswordText(String PassWord) throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPagePasswordText")).clear();
		an.driver.findElement(ao.getLocaator("LoginPagePasswordText")).sendKeys(PassWord);
	}

	public void doLoginPageLoginSubmitButton() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageLoginSubmitButton")).click();
	}

	public void doMyPageUserSettingButton() throws Exception {
		an.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageSetPassword() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPassword")).click();
	}

	public void doSettingPageSetPasswordInputOne(String One) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputOne")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputOne")).sendKeys(One);
	}

	public void doSettingPageSetPasswordInputTwo(String Two) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputTwo")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputTwo")).sendKeys(Two);
	}

	public void doSettingPageSetPasswordInputThree(String Three) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputThree")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputThree")).sendKeys(Three);
	}

	public void doSettingPageSetPasswordInputFour(String Four) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFour")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFour")).sendKeys(Four);
	}

	public void doSettingPageSetPasswordInputFive(String Five) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFive")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputFive")).sendKeys(Five);
	}

	public void doSettingPageSetPasswordInputSis(String Sis) throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputSis")).clear();
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordInputSis")).sendKeys(Sis);
	}

	public void doSettingPageSetPasswordSubmitButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSetPasswordSubmitButton")).click();
	}

	public void doSettingPageSignOutButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutButton")).click();
	}

	public void doSettingPageSignOutSureButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutSureButton")).click();
	}

	public void doLogin(String TelephoneNumber, String PassWord) throws Exception {
		Thread.sleep(1000);
		doJumpButton();
		Thread.sleep(1000);
		doUserButton();
		doLoginPageUsernameText(TelephoneNumber);
		Thread.sleep(3000);
		doLoginPagePasswordText(PassWord);
		Thread.sleep(1000);
		doLoginPageLoginSubmitButton();
		Thread.sleep(1000);
	}

	//
	public void SendPassWord(String One, String Two, String Three, String Four, String Five, String Sis)
			throws Exception {
		doMyPageUserSettingButton();
		doSettingPageSetPassword();
		Thread.sleep(1000);
		doSettingPageSetPasswordInputOne(One);
		Thread.sleep(500);
		doSettingPageSetPasswordInputTwo(Two);
		Thread.sleep(500);
		doSettingPageSetPasswordInputThree(Three);
		Thread.sleep(500);
		doSettingPageSetPasswordInputFour(Four);
		Thread.sleep(500);
		doSettingPageSetPasswordInputFive(Five);
		Thread.sleep(500);
		doSettingPageSetPasswordInputSis(Sis);
		Thread.sleep(500);
		doSettingPageSetPasswordSubmitButton();
		Thread.sleep(500);
	}

	public void doLoginOut() throws Exception {
		doSettingPageSignOutButton();
		doSettingPageSignOutSureButton();
	}
}
