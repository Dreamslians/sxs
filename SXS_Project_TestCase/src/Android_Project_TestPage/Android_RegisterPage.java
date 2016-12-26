package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_RegisterPage extends BasePage
{
	public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

	// 跳过
	public void doJumpButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
	}

	public void doUserButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
	}

	public void doLoginPageRegisterButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageRegisterButton")).click();
	}

	// 注册输入手机号码
	public void doRegisterPageTelephone(String Telephone) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageTelephone")).clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageTelephone")).sendKeys(Telephone);
	}

	// 获取验证码
	public void doRegisterPageRegisterCode() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterCode")).click();
	}

	// 输入验证码
	public void doRegisterPageRegisterCodeText(String RegisterCode) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterCodeText")).clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterCodeText"))
				.sendKeys(RegisterCode);
	}

	// 点击“我同意”按钮
	public void doRegisterPageAgreeButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageAgreeButton")).click();
	}

	// 读取协议
	public void doRegisterPageRegisterText() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterText")).click();
	}

	// 从协议返回
	public void doRegisterPageRegisterTextReturnButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterTextReturnButton")).click();
	}

	// 点击注册按钮
	public void doRegisterPageRegisterButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageRegisterButton")).click();
	}

	// 输入图文验证码
	public void doRegisterPageVerifyCode(String VerifyCode) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageVerifyCode")).sendKeys(VerifyCode);
	}

	// 从注册页面点击登录
	public void doRegisterPageLoginButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageLoginButton")).click();
	}

	public void doRegisterPagePassWord(String PassWord) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPagePassWord")).clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPagePassWord")).sendKeys(PassWord);
	}

	public void doRegisterPageNewPassWord(String NewPassWord) throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageNewPassWord")).clear();
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageNewPassWord")).sendKeys(NewPassWord);
	}

	public void doRegisterPageButton() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageButton")).click();
	}

	public void doRegisterPageJump() throws Exception {
		Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageJump")).click();
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

	// 加等待时间传输验证码并完成注册流程
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
}
