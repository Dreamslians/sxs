package Data;

public class Baseinfo extends BasePage
{
    public static final String URL = "http://www.shaxiaoseng.com";

    public static final String Telephone = randomtelephonenumber();

    public static final String ImageVerify = gen(3) + random();

    public static final String SqlUrl = "jdbc:mysql://123.57.72.212:8301/sxs_vault";
    public static final String User = "test";
    public static final String Password = "mysqltest2016";

    public static final String GetVerifyByRegister = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='1730000000' ORDER BY id DESC LIMIT 1;";

}
