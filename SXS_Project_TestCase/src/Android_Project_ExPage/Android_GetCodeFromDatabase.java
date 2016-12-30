package Android_Project_ExPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Android_GetCodeFromDatabase
{
    public String GetVerifyByChangeBildingPageOne()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByBildingPageOne);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }

    public String GetVerifyByChangeBildingPageTwo()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByBildingPageTwo);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }

    public String GetVerifyByForgotPasswordPage()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.GetVerifyByForgetPW);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }

    public String GetVerifyByFoundPayPWPage()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByFindPayPW);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }

    public String GetVerifyByRegisterPage()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByRegister);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }

    //**********************************************InuseCode*******************************************
    public String GetInuseByChangeBildingPage()
    {
        String inuse = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.AssChangeBildingByInUseID);
            rs.next();
            inuse = rs.getString("inuse");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        if (inuse.contains("1"))
        {
            System.out.println("当前为登录状态");

        } else
        {
            System.out.println("当前账户未登录");
        }
        return inuse;
    }

    public String GetInuseByChangeLoginPWPage()
    {
        String inuse = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.AssChangeLoginPWByInUseID);
            rs.next();
            inuse = rs.getString("inuse");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        if (inuse.contains("1"))
        {
            System.out.println("当前为登录状态");

        } else
        {
            System.out.println("当前账户未登录");
        }
        return inuse;
    }

    public String GetInuseInvestPage()
    {
        String inuse = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.AssInvestByInUseID);
            rs.next();
            inuse = rs.getString("inuse");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        if (inuse.contains("1"))
        {
            System.out.println("当前为登录状态");

        } else
        {
            System.out.println("当前账户未登录");
        }
        return inuse;
    }

    public String GetInuseByLoginPage()
    {
        String inuse = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.AssLoginPageByInUseID);
            rs.next();
            inuse = rs.getString("inuse");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        if (inuse.contains("1"))
        {
            System.out.println("当前为登录状态");

        } else
        {
            System.out.println("当前账户未登录");
        }
        return inuse;
    }

    //**********************************************Money*******************************************
    public String Mymoney()
    {
        String mymoney = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.Mymoney);
            rs.next();
            mymoney = rs.getString("mymoney");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("可以余额" + mymoney);
        return mymoney;
    }

    public String LockMoney()
    {
        String lockmoney = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.Lockmoney);
            rs.next();
            lockmoney = rs.getString("lockmoney");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("冻结金额" + lockmoney);
        return lockmoney;
    }

    public String Dq_earnings()
    {
        String earnings = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.Dq_earnings);
            rs.next();
            earnings = rs.getString("total");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("定期收益" + earnings);
        return earnings;
    }

    public String Dq_Inmoney()
    {
        String in_money = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    Baseinfo.Dq_Inmoney);
            rs.next();
            in_money = rs.getString("amy");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("定期投资" + in_money);
        return in_money;
    }
}
