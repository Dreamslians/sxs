package Page;

import Data.BasePage;
import Data.Baseinfo;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class SXS_Invite_Page extends Page
{
    public SXS_Invite_Page(WebDriver driver)
    {
        super(driver);
    }

    public void InputTelephone(String Telephone)
    {
        getElement("Telephone").clear();
        getElement("Telephone").sendKeys(Telephone);
    }

    public void InputPassword(String Password)
    {
        getElement("Password").clear();
        getElement("Password").sendKeys(Password);
    }

    public void clickImageVerify()
    {
        getElement("ImageVerify").click();
    }

    public void InputImageVerify(String ImageVerify)
    {
        getElement("InputImageVerify").clear();
        getElement("InputImageVerify").sendKeys(ImageVerify);
    }

    public void GetVerify()
    {
        getElement("GetVerify").click();
    }

    public void InputCodeVerify(String CodeVerify)
    {
        getElement("InputCodeVerify").clear();
        getElement("InputCodeVerify").sendKeys(CodeVerify);
    }

    public void AgreeButton()
    {
        getElement("AgreeButton").click();
        getElement("AgreeButton").click();
    }

    public void UserXieYi()
    {
        getElement("UserXieYi").click();
    }

    public void CloseButton()
    {
        getElement("CloseButton").click();
    }

    public void Register()
    {
        getElement("Register").click();
    }

    public void RegisterTestByGetCode(String Telephone, String Password, String ImageVerify)
    {
        InputTelephone(Telephone);
        if (Baseinfo.Telephone.length() < 11)
        {
            System.out.println("手机号码输入错误");
        } else
        {
            System.out.println("手机号码输入正确：" + Baseinfo.Telephone);
        }
        InputPassword(Password);
        System.out.println("密码为：" + Baseinfo.PassWord);
        clickImageVerify();
        InputImageVerify(ImageVerify);
        if (Baseinfo.ImageVerify.length() < 4)
        {
            System.out.println("图文验证码输入错误");
            InputImageVerify(ImageVerify);
        } else
        {
            System.out.println("图文验证码验证通过:"+Baseinfo.ImageVerify);
        }
        GetVerify();
    }

    public void RegisterInputCode(String CodeVerify)
    {
        InputCodeVerify(CodeVerify);

        Register();

        if (BasePage.GetVerifyByRegisterPage_Assert().isEmpty())
        {
            System.out.println("注册失败");
        } else
        {
            System.out.println("账户" + Baseinfo.Telephone + "注册成功");
        }
    }

}
