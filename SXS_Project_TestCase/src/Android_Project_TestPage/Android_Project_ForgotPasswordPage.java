package Android_Project_TestPage;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_ForgotPasswordPage {

	Android_Project_NotReset an = new Android_Project_NotReset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	// 跳过
	public void doJumpButton() throws Exception {
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
	}

	public void doUserButton() throws Exception {
		an.driver.findElement(ao.getLocaator("UserButton")).click();
	}

	public void doForgotPassword() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageForgotPassword")).click();
	}

	public void doFoundPasswordPageTelephone(String Telephone) throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageGetCode")).sendKeys(Telephone);
	}

	public void doFoundPasswordPageGetCode() throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageGetCode")).click();
	}

	public void doFoundPasswordPageInputCode(String verifyCode) throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).sendKeys(verifyCode);
	}

	public void doFoundPasswordPageNextPageButton() throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageNextPageButton")).click();
	}

	public void doFoundPasswordPageSettingPassword(String Password) throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPassword")).clear();
		an.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPassword")).sendKeys(Password);
	}

	public void doFoundPasswordPageSettingPasswordNew(String NewPassword) throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordNew")).clear();
		an.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordNew")).sendKeys(NewPassword);
	}

	public void doFoundPasswordPageSettingPasswordButton() throws Exception {
		an.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordButton")).click();
	}

	public void doLoginPageUsernameText(String TelePhone) throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).clear();
		an.driver.findElement(ao.getLocaator("LoginPageUsernameText")).sendKeys(TelePhone);
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

	public void doSettingPageSignOutButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutButton")).click();
	}

	public void doSettingPageSignOutSureButton() throws Exception {
		an.driver.findElement(ao.getLocaator("SettingPageSignOutSureButton")).click();
	}

	public void SendTelephone(String Telephone) throws Exception {
		Thread.sleep(2000);
		doJumpButton();
		doUserButton();
		doForgotPassword();
		doFoundPasswordPageTelephone(Telephone);
		doFoundPasswordPageGetCode();
		Thread.sleep(2000);
	}

	public void SendVerifyCode(String verifyCode, String Password, String NewPassword) throws Exception {
		doFoundPasswordPageInputCode(verifyCode);
		Thread.sleep(1000);
		doFoundPasswordPageNextPageButton();
		doFoundPasswordPageSettingPassword(Password);
		doFoundPasswordPageSettingPasswordNew(NewPassword);
		doFoundPasswordPageSettingPasswordButton();
		Thread.sleep(2000);
	}

	public void FinshForgotPassword(String TelePhone, String PassWord) throws Exception {
		doLoginPageUsernameText(TelePhone);
		doLoginPagePasswordText(PassWord);
		doLoginPageLoginSubmitButton();
	}

	public void doLoginOut() throws Exception {
		doMyPageUserSettingButton();
		doSettingPageSignOutButton();
		doSettingPageSignOutSureButton();
	}
}
