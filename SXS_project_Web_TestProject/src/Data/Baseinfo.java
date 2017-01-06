package Data;

public class Baseinfo extends BasePage
{
    public static final String URL = "http://www.shaxiaoseng.com";
    public static final String URL_invite = "https://ts.shaxiaoseng.com/inv";
    public static final String URL_invite_mobile = "https://ts.shaxiaoseng.com/activity/inv/mobile/";
    public static final String URL_invite_quanmama = "https://ts.shaxiaoseng.com/activity/quanmama_3/index.html";
    public static final String URL_invite_mobile1 = "https://ts.shaxiaoseng.com/activity/inv/mobile1/index.html";
    public static final String URL_invite_fanli_11 = "https://ts.shaxiaoseng.com/activity/fanli_11/index.html";


    public static final String ImageVerify = gen(3) + random();

    public static final String SqlUrl = "jdbc:mysql://123.57.72.212:8301/sxs_vault";
    public static final String User = "test";
    public static final String Password = "mysqltest2016";

    public static final String Telephone = randomtelephonenumber();
    public static final String PassWord = gen(3) + Telephone;

    public static final String GetVerifyByRegister = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='" + Telephone + "' ORDER BY id DESC LIMIT 1;";
    public static final String GetVerifyByRegister_mobile = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='" + Telephone + "' ORDER BY id DESC LIMIT 1;";

    public static final String GetVerifyByRegister_Assert = "SELECT user_id FROM vault_user_money ,vault_user WHERE vault_user.id = vault_user_money.user_id AND moblie ='" + Telephone + "';";

}
