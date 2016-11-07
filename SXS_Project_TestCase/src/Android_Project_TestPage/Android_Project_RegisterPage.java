package Android_Project_TestPage;

import Android_Project_Data.Android_Project_NotReset;
import Android_Project_ExPage.Android_Element_ObjectMap;

public class Android_Project_RegisterPage {
	Android_Project_NotReset an = new Android_Project_NotReset();
	Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

	// 跳过
	public void doJumpButton() throws Exception {
		an.driver.findElement(ao.getLocaator("JumpButton")).click();
	}

	public void doUserButton() throws Exception {
		an.driver.findElement(ao.getLocaator("UserButton")).click();
	}

	public void doLoginPageRegisterButton() throws Exception {
		an.driver.findElement(ao.getLocaator("LoginPageRegisterButton")).click();
	}

	// 注册输入手机号码
	public void doRegisterPageTelephone(String Telephone) throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageTelephone")).clear();
		an.driver.findElement(ao.getLocaator("RegisterPageTelephone")).sendKeys(Telephone);
	}

	// 获取验证码
	public void doRegisterPageRegisterCode() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterCode")).click();
	}

	// 输入验证码
	public void doRegisterPageRegisterCodeText(String RegisterCode) throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterCodeText")).clear();
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterCodeText")).sendKeys(RegisterCode);
	}

	// 点击“我同意”按钮
	public void doRegisterPageAgreeButton() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageAgreeButton")).click();
	}

	// 读取协议
	public void doRegisterPageRegisterText() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterText")).click();
	}

	// 从协议返回
	public void doRegisterPageRegisterTextReturnButton() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterTextReturnButton")).click();
	}

	// 点击注册按钮
	public void doRegisterPageRegisterButton() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageRegisterButton")).click();
	}

	// 输入图文验证码
	public void doRegisterPageVerifyCode(String VerifyCode) throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageVerifyCode")).sendKeys(VerifyCode);
	}

	// 从注册页面点击登录
	public void doRegisterPageLoginButton() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageLoginButton")).click();
	}

	public void doRegisterPagePassWord(String PassWord) throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPagePassWord")).clear();
		an.driver.findElement(ao.getLocaator("RegisterPagePassWord")).sendKeys(PassWord);
	}

	public void doRegisterPageNewPassWord(String NewPassWord) throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageNewPassWord")).clear();
		an.driver.findElement(ao.getLocaator("RegisterPageNewPassWord")).sendKeys(NewPassWord);
	}

	public void doRegisterPageButton() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageButton")).click();
	}

	public void doRegisterPageJump() throws Exception {
		an.driver.findElement(ao.getLocaator("RegisterPageJump")).click();
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

	// 输入手机号码并click获取验证码
	public void doSendTelephone(String Telephone) throws Exception {
		Thread.sleep(1000);
		doJumpButton();
		Thread.sleep(1000);
		doUserButton();
		doLoginPageRegisterButton();
		doRegisterPageTelephone(Telephone);
		Thread.sleep(1000);
		doRegisterPageRegisterCode();
	}
	//加等待时间传输验证码并完成注册流程
	public void SendVerfy(String RegisterCode, String PassWord, String NewPassWord) throws Exception {

		Thread.sleep(2000);
		doRegisterPageRegisterCodeText(RegisterCode);
		Thread.sleep(1000);
		doRegisterPageAgreeButton();
		doRegisterPageAgreeButton();
		doRegisterPageRegisterText();
		Thread.sleep(1000);
		doRegisterPageRegisterTextReturnButton();
		Thread.sleep(1000);
		doRegisterPageRegisterButton();
		Thread.sleep(1000);
		doRegisterPagePassWord(PassWord);
		doRegisterPageNewPassWord(NewPassWord);
		doRegisterPageButton();
		Thread.sleep(2000);
		doRegisterPageJump();
	}
	//退出当前注册账号的登录流程
	public void doLoginOut() throws Exception {
		doMyPageUserSettingButton();
		doSettingPageSignOutButton();
		doSettingPageSignOutSureButton();
	}
}
