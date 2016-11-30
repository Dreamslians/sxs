package Android_Project_TestCase;

import Android_Project_ExPage.*;
import Android_Project_TestPage.Android_NewsAllPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Dreamslians on 2016/11/21.
 */
public class Android_NewsAllPage_TestCase
{

    Android_NewsAllPage aa = new Android_NewsAllPage();
    PublicLoginPage pl = new PublicLoginPage();
    PublicLoginOutPage po = new PublicLoginOutPage();
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        aa.an.setUp();
    }

    @AfterMethod
    public void TearDown() throws Exception
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    @Test

    public void doNewsAllPageTest() throws Exception
    {
        try
        {
            pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord);
            System.out.println("登录成功");
        }catch (Exception e){
            System.out.println("失败");
        }
        if(ag.GetInuseByLoginPage().contains("1"))
        {
            try
            {
                aa.doHomePageNewsTest();
                po.doLoginOutByUserPage();
                System.out.println("****************成功****************");
            } catch (NoSuchElementException e)
            {
                Android_LoadDevice_NotReset.driver.closeApp();
                Android_LoadDevice_NotReset.driver.launchApp();
                po.doLoginOutByResetApp();
                System.out.println("******************失败******************");
            }
        }else{
            System.out.println("失败");
        }
    }
}
