package Android_Project_ExPage;

import org.testng.Assert;

public class PublicLoginPage
{
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doJumpButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("JumpButton")).click();
    }

    public void doUserButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("UserButton")).click();
    }

    public void doLoginPageUsernameText(String TelephoneNumber) throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageUsernameText")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageUsernameText"))
                .sendKeys(TelephoneNumber);
    }

    public void doLoginPagePasswordText(String PassWord) throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPagePasswordText")).clear();
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPagePasswordText")).sendKeys(PassWord);
    }

    public void doLoginPageLoginSubmitButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageLoginSubmitButton")).click();
    }

    public void doCheck() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageTittle")).click();
    }

    public void doLoginByJump(String TelephoneNumber, String PassWord) throws Exception
    {
        Thread.sleep(400);
        doJumpButton();
        Thread.sleep(300);
        doUserButton();
        doLoginPageUsernameText(TelephoneNumber);
        doLoginPagePasswordText(PassWord);
        doLoginPageLoginSubmitButton();
        Thread.sleep(500);
        doCheck();
    }

    public void doLoginByNoJump(String TelephoneNumber, String PassWord) throws Exception
    {
        Thread.sleep(300);
        doLoginPageUsernameText(TelephoneNumber);
        doLoginPagePasswordText(PassWord);
        doLoginPageLoginSubmitButton();
        Thread.sleep(500);
        Assert.assertEquals("我的资产", Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageTittle")).getText());
    }
}
