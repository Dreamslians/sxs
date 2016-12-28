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
        } else
        {
            System.out.println("配置文件读取失败");
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

    //login
    public boolean doLoginByLoginTelephoneNumber() throws Exception
    {
        if (login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }

        if (!loginFlag)
        {
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

    //修改登录密码登录
    public boolean doLoginByChangeLoginPW() throws Exception
    {
        if (CL_PW())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            CL_PW();
        }
        return loginFlag;
    }

    private boolean CL_PW() throws Exception
    {
        if (pl.doLoginByJump(Baseinfo.ChangeLoginPWTelephoneNumber, Baseinfo.ChangeLoginPWPassWord))
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

    //修改绑定手机号码登录
    public boolean doChangeBilding_login() throws Exception
    {
        if (CB_login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            CB_login();
        }
        return loginFlag;
    }

    private boolean CB_login() throws Exception
    {
        System.out.println("开始登陆操作");
        if (pl.doLoginByJump(Baseinfo.ChangeBildingTelephone, Baseinfo.ChangeBildingPassword))
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

    //修改绑定手机号码登录（NoJump）
    public boolean doNoJmupLogin() throws Exception
    {
        if (NJ_login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            NJ_login();
        }
        return loginFlag;
    }

    private boolean NJ_login() throws Exception
    {
        if (pl.doLoginByNoJump(Baseinfo.ChangeBildingNewTelephone, Baseinfo.ChangeBildingPassword))
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

    //修改登录密码（Nojump）
    public boolean NoJumpByChangeLoginPw() throws Exception
    {
        if (NJ_CL_login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            NJ_CL_login();
        }
        return loginFlag;
    }

    private boolean NJ_CL_login() throws Exception
    {
        if (pl.doLoginByNoJump(Baseinfo.ChangeLoginPWTelephoneNumber, Baseinfo.ChangeLoginPWNewPW))
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


    public boolean NoJumpLoginByForgetPW() throws Exception
    {
        if (NJ_L_FPW())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            NJ_L_FPW();
        }
        return loginFlag;
    }

    private boolean NJ_L_FPW() throws Exception
    {
        System.out.println("开始登录操作");
        if (pl.doLoginByNoJump(Baseinfo.ForgotPasswordTelephone, Baseinfo.ForgotPasswordNewPassword))
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

    //投资登录账户
    public boolean LoginJumpByInvest() throws Exception
    {
        if (Invest_Jump_Login())
        {
            loginFlag = true;
        } else
        {
            loginFlag = false;
        }
        if (!loginFlag)
        {
            Invest_Jump_Login();
        }
        return loginFlag;
    }

    private boolean Invest_Jump_Login() throws Exception
    {
        System.out.println("开始登录操作");
        if (pl.doLoginByJump(Baseinfo.InvestTelephone, Baseinfo.InvestPassword))
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