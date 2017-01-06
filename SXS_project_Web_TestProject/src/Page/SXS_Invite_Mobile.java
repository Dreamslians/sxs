package Page;

import Data.BasePage;
import Data.Baseinfo;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dreamslians on 2017/1/5.
 */
public class SXS_Invite_Mobile extends Page
{
    public SXS_Invite_Mobile(WebDriver driver)
    {
        super(driver);
    }

    public void InputTel(String Tel)
    {
        getElement("Tele").clear();
        getElement("Tele").sendKeys(Tel);
    }

    public void InputPW(String PW)
    {
        getElement("Pw").clear();
        getElement("Pw").sendKeys(PW);
    }

    public void clickImageverify()
    {
        getElement("ImageV").click();
    }

    public void inputImageVerify(String verify)
    {
        getElement("InputImage").clear();
        getElement("InputImage").sendKeys(verify);
    }

    public void GetVerifyCode()
    {
        getElement("GetVerifyCode").click();
    }

    public void InputVC(String VC)
    {
        getElement("InputVC").clear();
        getElement("InputVC").sendKeys(VC);
    }

    public void Register1()
    {
        getElement("Register1").click();
    }

    public void doRegister_SendTel_PW(String Tle, String PW, String Verify) throws Exception
    {
        InputTel(Tle);
        if (Baseinfo.Telephone.length() < 11)
    {
        System.out.println("手机号码输入错误");
    } else
    {
        System.out.println("手机号码输入正确：" + Baseinfo.Telephone);
    }
        InputPW(PW);
        System.out.println("密码为：" + Baseinfo.PassWord);
        clickImageverify();
        inputImageVerify(Verify);
        if (Baseinfo.ImageVerify.length() < 4)
        {
            System.out.println("图文验证码输入错误");
            inputImageVerify(Verify);
        } else
        {
            System.out.println("图文验证码验证通过:"+Baseinfo.ImageVerify);
        }
        GetVerifyCode();
    }

    public void doRegister_SendVerify(String VC)
    {
        InputVC(VC);
        Register1();
        if (BasePage.GetVerifyByRegisterPage_Assert().isEmpty())
        {
            System.out.println("注册失败");
        } else
        {
            System.out.println("账户" + Baseinfo.Telephone + "注册成功");
        }
    }


}
