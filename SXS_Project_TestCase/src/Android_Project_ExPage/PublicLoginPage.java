package Android_Project_ExPage;

import org.testng.Assert;

public class PublicLoginPage
{
    public void doJumpButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
    }

    public void doUserButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }

    public void doLoginPageUsernameText(String TelephoneNumber) throws Exception
    {
//        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText"))
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageUsernameText"))
                .sendKeys(TelephoneNumber);
    }

    public void doLoginPagePasswordText(String PassWord) throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPagePasswordText")).sendKeys(PassWord);
    }

    public void doLoginPageLoginSubmitButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageLoginSubmitButton")).click();
    }

    public void doCheck() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageTittle")).click();
    }

    public void doLoginByJump(String TelephoneNumber, String PassWord) throws Exception
    {
        Thread.sleep(500);
        doJumpButton();
        Thread.sleep(300);
        doUserButton();
        Android_Keyboard.clearText(TelephoneNumber);
        doLoginPageUsernameText(TelephoneNumber);
        System.out.println("输入用户名："+TelephoneNumber);
        doLoginPagePasswordText(PassWord);
        System.out.println("输入密码："+PassWord);
        doLoginPageLoginSubmitButton();
        Thread.sleep(500);
        doCheck();
        System.out.println(TelephoneNumber+"：登录成功");
    }

    public void doLoginByNoJump(String TelephoneNumber, String PassWord) throws Exception
    {
        Thread.sleep(300);
        Android_Keyboard.clearText(TelephoneNumber);
        doLoginPageUsernameText(TelephoneNumber);
        System.out.println("输入用户名："+TelephoneNumber);
        doLoginPagePasswordText(PassWord);
        System.out.println("输入密码："+PassWord);
        doLoginPageLoginSubmitButton();
        Thread.sleep(500);
        Assert.assertEquals("我的资产(元)", Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageTittle")).getText());
        System.out.println(TelephoneNumber+"：登录成功");
    }
}
