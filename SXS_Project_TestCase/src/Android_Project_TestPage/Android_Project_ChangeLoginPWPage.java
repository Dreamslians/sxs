package Android_Project_TestPage;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_ChangeLoginPWPage {
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

	public void doSetting() throws Exception {
		an.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageRevampPassword() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageRevampPassword")).click();
	}

	public void doChangeLoginPWOldPW(String OldPassword) throws Exception {
		an.driver.findElement(ao.getLocaator("ChangeLoginPWOldPW")).clear();
		an.driver.findElement(ao.getLocaator("ChangeLoginPWOldPW")).sendKeys(OldPassword);
	}

	public void doChangeLoginPWNewPW(String NewPW) throws Exception {
		an.driver.findElement(ao.getLocaator("ChangeLoginPWNewPW")).clear();
		an.driver.findElement(ao.getLocaator("ChangeLoginPWNewPW")).sendKeys(NewPW);
	}

	public void doChangeLoginPWNewPWAgain(String NewPWAgain) throws Exception {
		an.driver.findElement(ao.getLocaator("ChangeLoginPWNewPWAgain")).clear();
		an.driver.findElement(ao.getLocaator("ChangeLoginPWNewPWAgain")).sendKeys(NewPWAgain);
	}

	public void doChangeLoginPWSubmitButton() throws Exception {
		an.driver.findElement(ao.getLocaator("ChangeLoginPWSubmitButton")).click();
	}

	public void doLogin(String TelephoneNumber, String PassWord) throws Exception {
		Thread.sleep(1000);
		doJumpButton();
		doUserButton();
		doLoginPageUsernameText(TelephoneNumber);
		doLoginPagePasswordText(PassWord);
		doLoginPageLoginSubmitButton();
		Thread.sleep(500);
	}

	public void doChangePassWord(String OldPassword, String NewPW, String NewPWAgain) throws Exception {
		doSetting();
		doSettingPageRevampPassword();
		doChangeLoginPWOldPW(OldPassword);
		doChangeLoginPWNewPW(NewPW);
		doChangeLoginPWNewPWAgain(NewPWAgain);
		doChangeLoginPWSubmitButton();
		Thread.sleep(1000);
	}

	public void doNoJumpLogin(String TelephoneNumber, String PassWord) throws Exception {
		doLoginPageUsernameText(TelephoneNumber);
		doLoginPagePasswordText(PassWord);
		doLoginPageLoginSubmitButton();
		Thread.sleep(500);
	}
}
