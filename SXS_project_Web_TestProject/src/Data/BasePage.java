package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Dreamslians on 2016/12/29.
 */
public class BasePage
{
    public static String gen(int length)
    {
        char[] ss = new char[length];
        int i = 0;
        while (i < length)
        {
            int f = (int) (Math.random() * 3);
            if (f == 0)
                ss[i] = (char) ('A' + Math.random() * 26);
            else if (f == 1)
                ss[i] = (char) ('a' + Math.random() * 26);
            else
                ss[i] = (char) ('0' + Math.random() * 10);
            i++;
        }
        String is = new String(ss);
        return is;
    }

    public static int random()
    {
        Random random = new Random();
        int a = random.nextInt(10);
        return a;
    }

    public static String randomtelephonenumber()
    {
        String a1 = "13";
        String a2 = "15";
        String a3 = "18";
        String a4 = "17";
        Random random = new Random();
        String telephonenumber1 = a1 + "3333" + random.nextInt(100000);
        String telephonenumber2 = a2 + "2222" + random.nextInt(100000);
        String telephonenumber3 = a3 + "1111" + random.nextInt(100000);
        String telephonenumber4 = a4 + "0000" + random.nextInt(100000);
        return telephonenumber4;
    }

    public static String GetVerifyByRegisterPage()
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

    public static String GetVerifyByRegisterPage_Assert()
    {
        String user_id = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByRegister_Assert);
            rs.next();
            user_id = rs.getString("user_id");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("注册账户的用户ID:" + user_id);
        return user_id;
    }


    public static String GetVerifyByRegisterPage_mobile()
    {
        String verify = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Baseinfo.SqlUrl, Baseinfo.User, Baseinfo.Password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Baseinfo.GetVerifyByRegister_mobile);
            rs.next();
            verify = rs.getString("verify");
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return verify;
    }


    public void showData()
    {
        SimpleDateFormat sf = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        System.out.println(sf.format(new Date()));
    }
}
