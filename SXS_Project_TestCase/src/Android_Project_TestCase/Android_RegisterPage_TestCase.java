package Android_Project_TestCase;

import Android_Project_Data.Android_RandomTelephoneNumber;
import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_RegisterPage;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Android_RegisterPage_TestCase
{

    Android_RegisterPage ar = new Android_RegisterPage();
    Android_RandomTelephoneNumber at = new Android_RandomTelephoneNumber();
    PublicLoginOutPage po = new PublicLoginOutPage();
    String RanTelephone = at.randomtelephonenumber();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doBefore() throws Exception {
        ar.an.setUp();
    }

    @AfterMethod
    public void TearDown() throws Exception {
        Android_LoadDevice_NotReset.driver.quit();
    }

    // 注册成功案例-----手机号码&验证码正确
    @Test(priority = 1)
    public void doRegister() throws Exception {
        ar.doSendTelephone(Baseinfo.RegisterTelephoneNumber);
        try {
            ar.SendVerfy(ag.GetVerifyByRegisterPage(), Baseinfo.RegisterPassword, Baseinfo.RegisterAgainPassword);
            Assert.assertEquals("我的资产",
                    Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageTittle")).getText());
            System.out.println(Baseinfo.RegisterTelephoneNumber + "注册成功");
            po.doLoginOutByUserPage();
            System.out.println("******************成功*****************");
        } catch (Exception e) {
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
            System.out.println("*******************失败*********************");
        }
    }

    // 注册失败案例-----手机号码正确&验证码错误
    @Test(priority = 2)
    public void doRegisterFailByVerifyCode() throws Exception {
        try {
            ar.doSendTelephone(RanTelephone);
            ar.doRegisterPageRegisterCodeText(Baseinfo.RegisterWrongVerifyCode);
            ar.doRegisterPageRegisterButton();
            Assert.assertEquals("请输入验证码",
                    Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageVerify")).getText());
        }catch (Exception e){
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
        }
    }

    // 注册失败案例-----手机号码&验证码 错误
    @Test(priority = 3)
    public void doRegisterFailByTelephoneAndVerifyCode() throws Exception {
        try {
            ar.doSendTelephone(Baseinfo.RegisterWrongTelephoneNumber);
            ar.doRegisterPageRegisterCodeText(Baseinfo.RegisterWrongVerifyCode);
            ar.doRegisterPageRegisterButton();
            Assert.assertEquals("请输入手机号码",
                    Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageTelephone")).getText());
        }catch (Exception e){
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
        }
    }

    @Test(priority = 4)
    public void doRegisterFailByAll() throws Exception {
        try {
            ar.doSendTelephone(Baseinfo.RegisterNullTelephoneNumber);
            ar.doRegisterPageRegisterCodeText(Baseinfo.RegisterNullVerifyCode);
            ar.doRegisterPageRegisterButton();
            Thread.sleep(300);
            Assert.assertEquals("请输入手机号码",
                    Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("RegisterPageTelephone")).getText());
        }catch (Exception e){
            Android_LoadDevice_NotReset.driver.closeApp();
            Android_LoadDevice_NotReset.driver.launchApp();
            po.doLoginOutByResetApp();
        }
    }
}
