package Android_Project_TestCase;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_IdentityAuthenticationPage;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Android_IdentityAuthenticationPage_TestCase extends BasePage
{

	Android_IdentityAuthenticationPage ai = new Android_IdentityAuthenticationPage();
	PublicLoginPage pl = new PublicLoginPage();
	PublicLoginOutPage po = new PublicLoginOutPage();
	Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

	@Test(priority = 1)
	public void doIdentityAuthentication() throws Exception {
		System.out.println("Android_IdentityAuthenticationPage_TestCase开始运行……");
		try
		{
			pl.doLoginByJump(Baseinfo.IdentityAuthenticationTelephoneNumber, Baseinfo.IdentityAuthenticationPassWord);
			System.out.println("登录成功");
		}catch (Exception e){
			System.out.println("登录失败");
		}
		if(ag.GetInuseByIAPage().contains("1"))
		{
			try
			{
				ai.doSettingPageIdentityAuthenticationTest(Baseinfo.IdentityAuthenticationUsername,
						Baseinfo.IdentityAuthenticationNumber);

				Assert.assertEquals(Baseinfo.IdentityAuthenticationUsername,
						Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageUsername")).getText());
				po.doLoginOutBySetPage();
				System.out.println("Android_IdentityAuthenticationPage_TestCase运行成功……");
			} catch (Exception e)
			{
				System.out.println("Android_IdentityAuthenticationPage_TestCase运行失败……");
				Android_LoadDevice_NotReset.driver.closeApp();
				Android_LoadDevice_NotReset.driver.launchApp();
				po.doLoginOutByResetApp();
				System.out.println("退出当前登录账号" + Baseinfo.IdentityAuthenticationUsername);
				System.out.println("*************************失败***********************");
			}
		}else {
			System.out.println("失败");
		}
	}
}
