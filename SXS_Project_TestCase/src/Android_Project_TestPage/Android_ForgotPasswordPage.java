package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_ForgotPasswordPage
{

	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
	public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	public void doJumpButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("JumpButton")).click();
	}

	public void doUserButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("UserButton")).click();
	}

	public void doForgotPassword() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageForgotPassword")).click();
	}

	public void doFoundPasswordPageTelephone(String Telephone) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageTelephone")).sendKeys(Telephone);
	}

	public void doFoundPasswordPageGetCode() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageGetCode")).click();
	}

	public void doFoundPasswordPageInputCode(String verifyCode) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageInputCode")).sendKeys(verifyCode);
	}

	public void doFoundPasswordPageNextPageButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageNextPageButton")).click();
	}

	public void doFoundPasswordPageSettingPassword(String Password) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPassword")).clear();
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPassword")).sendKeys(Password);
	}

	public void doFoundPasswordPageSettingPasswordNew(String NewPassword) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordNew")).clear();
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordNew")).sendKeys(NewPassword);
	}

	public void doFoundPasswordPageSettingPasswordButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("FoundPasswordPageSettingPasswordButton")).click();
	}

	public void SendTelephone(String Telephone) throws Exception {
		Thread.sleep(2000);
		doJumpButton();
		doUserButton();
		doForgotPassword();
		Thread.sleep(500);
		doFoundPasswordPageTelephone(Telephone);
		Thread.sleep(500);
		doFoundPasswordPageGetCode();
		Thread.sleep(1000);
	}

	public void SendVerifyCode(String verifyCode, String Password, String NewPassword) throws Exception {
		doFoundPasswordPageInputCode(verifyCode);
		Thread.sleep(1000);
		doFoundPasswordPageNextPageButton();
		doFoundPasswordPageSettingPassword(Password);
		doFoundPasswordPageSettingPasswordNew(NewPassword);
		doFoundPasswordPageSettingPasswordButton();
		Thread.sleep(1000);
	}
}