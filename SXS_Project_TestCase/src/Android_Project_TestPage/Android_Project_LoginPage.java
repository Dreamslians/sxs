package Android_Project_TestPage;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_LoginPage {

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

	public void doLoginPageForgotPassword() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageForgotPassword")).click();
	}

	public void doLoginPageLoginSubmitButton() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageLoginSubmitButton")).click();
	}

	public void doLoginPageRegisterButton() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageRegisterButton")).click();
	}

	public void doMyPageUserSettingButton() throws Exception {
		an.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
	}

	public void doSettingPageSignOutButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutButton")).click();
	}

	public void doSettingPageSignOutSureButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutSureButton")).click();
	}

	public void doSettingPageSignOutNoSureButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutNoSureButton")).click();
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

	public void doLoginOut() throws Exception {
		doMyPageUserSettingButton();
		doSettingPageSignOutButton();
		doSettingPageSignOutSureButton();
	}
}
