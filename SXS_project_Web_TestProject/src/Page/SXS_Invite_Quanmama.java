package Page;

import Data.BasePage;
import Data.Baseinfo;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dreamslians on 2017/1/6.
 */
public class SXS_Invite_Quanmama extends Page
{

    public SXS_Invite_Quanmama(WebDriver driver)
    {
        super(driver);
    }

    public void InputQuan_Tel(String Tel)
    {
        getElement("Quan_Tel").clear();
        getElement("Quan_Tel").sendKeys(Tel);

    }

    public void InputQuan_PW(String PW)
    {
        getElement("Quan_PW").sendKeys(PW);
    }

    public void Quan_ImageVerify()
    {
        getElement("Quan_ImageVerify").click();
    }

    public void Quan_InputImageVerify(String verify)
    {
        getElement("Quan_InputImageVerify").clear();
        getElement("Quan_InputImageVerify").sendKeys(verify);
    }

    public void clickQuan_GetCode()
    {
        getElement("Quan_GetCode").click();
    }

    public void Quan_InputCode(String code)
    {
        getElement("Quan_InputCode").sendKeys(code);
    }

    public void clickQuan_Register()
    {
        getElement("Quan_Register").click();
    }

    public void SendTel_ImageVerify(String Tel, String PW, String verify)
    {
        while (true)
        {
            InputQuan_Tel(Tel);
            if (Baseinfo.Telephone.length() < 11)
            {
                System.out.println("手机号码错误");
                InputQuan_Tel(Tel);
            } else
            {
                System.out.println("手机号码输入正确:" + Baseinfo.Telephone);
            }
            break;
        }
        InputQuan_PW(PW);
        System.out.println("密码为：" + Baseinfo.PassWord);
        Quan_ImageVerify();
        Quan_InputImageVerify(verify);
        if (Baseinfo.ImageVerify.length() < 4)
        {
            System.out.println("图文验证码输入错误");
            Quan_InputImageVerify(verify);
        } else
        {
            System.out.println("图文验证码验证通过:" + Baseinfo.ImageVerify);
        }
        clickQuan_GetCode();
    }

    public void SendCode(String code)
    {
        Quan_InputCode(code);
        System.out.println(Baseinfo.Telephone + "的验证码为：" + BasePage.GetVerifyByRegisterPage());
        clickQuan_Register();
        if (BasePage.GetVerifyByRegisterPage_Assert().isEmpty())
        {
            System.out.println("注册失败");
        } else
        {
            System.out.println("账户" + Baseinfo.Telephone + "注册成功");
        }
    }
}
