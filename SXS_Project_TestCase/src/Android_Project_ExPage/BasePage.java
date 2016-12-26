package Android_Project_ExPage;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BasePage extends Android_LoadDevice_NotReset
{
    PublicLoginPage pl = new PublicLoginPage();
    Android_Element_ObjectMap obj = null;
    private boolean loginFlag = false;

    public BasePage()
    {
        if (obj == null)
        {
            obj = new Android_Element_ObjectMap();
        }
    }

    @BeforeMethod
    public void doSetUp() throws Exception
    {
        setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

    public boolean doLoginByLoginTelephoneNumber() throws Exception
    {
        int count = 0;
        if (login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }

        if (!loginFlag && count < 3)
        {
            count++;
            login();
        }

        return loginFlag;
    }

    private boolean login() throws Exception
    {
        System.out.println("开始登陆操作");
        if (pl.doLoginByJump(Baseinfo.LoginTelephoneNumber, Baseinfo.LoginPassWord))
        {
            loginFlag = true;
            System.out.println("登录成功");
        } else
        {
            loginFlag = false;
            System.out.println("登录失败");
        }
        return loginFlag;
    }

    public void doChangeBilding_login() throws Exception
    {
        pl.doLoginByJump(Baseinfo.ChangeBildingTelephone, Baseinfo.ChangeBildingPassword);
        System.out.println("登录成功");
    }

    public void doNoJmupLogin() throws Exception
    {
        pl.doLoginByNoJump(Baseinfo.ChangeBildingNewTelephone, Baseinfo.ChangeBildingPassword);
    }


    public void restartApp() throws Exception
    {
        System.out.println("重启App");
        Android_LoadDevice_NotReset.driver.closeApp();
        Android_LoadDevice_NotReset.driver.launchApp();
    }

    public void swipeToUp(AppiumDriver driver, int during)
    {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
    }

    public void swipeToDown(AppiumDriver driver, int during)
    {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        // wait for page loading
    }


    public void swipeToLeft(AppiumDriver driver, int during)
    {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    public void swipeToRight(AppiumDriver driver, int during)
    {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }

    public static void snapshot(TakesScreenshot drivername, String filename)
    {
        // this method will take screen shot ,require two parameters ,one is
        // driver name, another is file name

        String currentPath = System.getProperty("user.dir"); // get current work
        // folder
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy
        // somewhere
        try
        {
            System.out.println("save snapshot path is:" + currentPath + "/"
                    + filename);
            FileUtils
                    .copyFile(scrFile, new File(currentPath + "\\" + filename));
        } catch (IOException e)
        {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } finally
        {
            System.out.println("screen shot finished, it's in " + currentPath
                    + " folder");
        }
    }
}