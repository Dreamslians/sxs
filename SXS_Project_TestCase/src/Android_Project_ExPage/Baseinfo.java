package Android_Project_ExPage;

public class Baseinfo
{

    public static final String AndroidDriverURL = "http://192.168.1.83:4723/wd/hub";

    public static final String AndroidDriverName = "192.168.56.101:5555";

    public static final String AndroidappPackage = "com.sxsfinance.SXS";

    public static final String AndroidappActivity = "com.sxsfinance.SXS.actvity.main.GuidepageActivity";
    public static final String AndroidplatformVersion = "4.3";

    public static final String AndroidappDir = "sxs_android_v1.2.4_2016-12-16.apk";


    //************************登录页面操作所需值************************

    public static final String Mymoney = "SELECT vault_user_money.mymoney FROM vault_user_money,vault_user WHERE vault_user.id = vault_user_money.user_id AND moblie = '17301216033'";
    public static final String Lockmoney = "SELECT vault_user_money.lockmoney from vault_user_money,vault_user WHERE vault_user.id = vault_user_money.user_id AND  moblie ='17301216033'";

    //定期计划总额=定期收益总额+定期投资总额
    //定期收益总额
    public static final String Dq_earnings = "SELECT sum(vault_user_dq_gains.earnings) total FROM vault_user_dq_gains,vault_user WHERE vault_user.id=vault_user_dq_gains.user_id AND moblie = '17301216033'";
    //定期投资总额
    public static final String Dq_Inmoney = "SELECT sum(vault_user_dq_log.in_money) amy FROM vault_user_dq_log,vault_user WHERE vault_user_dq_log.user_id = vault_user.id AND moblie = '17301216033'";
    //活期计划总额
    //活期收益总额

    //活期投资总额

    //************************登录页面操作所需值************************
    public static final String LoginTelephoneNumber = "17301216444";
    public static final String LoginWrongTelephoneNumber = "17301216000";
    public static final String LoginNullTelephoneNumber = "";
    public static final String LoginNullPassWord = "";
    public static final String LoginLongWrongPassWord = "qqqqqqq";
    public static final String LoginPassWord = "qqqqqq";
    public static final String AssLoginPageByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************

    public static final String SqlUrl = "jdbc:mysql://123.57.72.212:8301/sxs_vault";
    public static final String User = "test";
    public static final String Password = "mysqltest2016";


    public static final String AssByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216102'";



    public static final String GetVerifyByTest = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='15313960614' ORDER BY id DESC LIMIT 1;";

    //************************修改登录密码页面操作所需值（ChangeLoginPWPage）************************
    public static final String ChangeLoginPWTelephoneNumber = "17301216444";
    public static final String ChangeLoginPWPassWord = "qqqqqq";
    public static final String ChangeLoginPWNewPW = "123456";
    public static final String ChangeLoginPWNewPWAgain = "123456";
    public static final String AssChangeLoginPWByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************

    //*******************************注册页面操作所需值*******************************
    public static final String RegisterTelephoneNumber = "17600110006";
    public static final String RegisterWrongTelephoneNumber = "1730121600";
    public static final String RegisterNullTelephoneNumber = "";
    public static final String RegisterNullVerifyCode = "";
    public static final String RegisterWrongVerifyCode = "123456";
    public static final String RegisterPassword = "qqqqqq";
    public static final String RegisterAgainPassword = "qqqqqq";
    public static final String GetVerifyByRegister = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='17600110006' ORDER BY id DESC LIMIT 1;";
    //************************************************************************************************

    //************************身份证实名操作页面所需值************************
    public static final String IdentityAuthenticationTelephoneNumber = "17600110001";
    public static final String IdentityAuthenticationPassWord = "qqqqqq";
    public static final String IdentityAuthenticationUsername = "宋培东";
    public static final String IdentityAuthenticationNumber = "411122199309258133";
    public static final String AssIAPageByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17600110001'";
    //************************************************************************************************

    //************************忘记密码页面操作所需值************************
    public static final String ForgotPasswordTelephone = "17301216444";
    public static final String ForgotPasswordNewPassword = "qqqqqq";
    public static final String ForgotPasswordAgainPassword = "qqqqqq";
    public static final String GetVerifyByForgetPW = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216444' ORDER BY id DESC LIMIT 1;";
    //************************************************************************************************

    public static final String InvestMoneyByXS = "100";
    public static final String InvestMoneyBySF = "1000";
    public static final String LostByHistoryMoney = "1";


    //************************检查版本更新操作页面所需值（CheckUpdatePage）************************
    public static final String CheckUpdateTelephone = "17301216444";
    public static final String CheckUpdatePassword = "123456";
    public static final String AssCheckUpdateByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************

    //************************更改绑定手机号页面操作所需值（ChangeBildingPage）************************
    public static final String ChangeBildingTelephone = "17301216004";
    public static final String GetVerifyByBildingPageOne = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216004' ORDER BY id DESC LIMIT 1;";
    public static final String ChangeBildingPassword = "qqqqqq";
    public static final String ChangeBildingNewTelephone = "17301216444";
    public static final String GetVerifyByBildingPageTwo = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216444' ORDER BY id DESC LIMIT 1;";
    public static final String AssChangeBildingByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216004'";
    //************************************************************************************************

    //***********************首页投资页面操作所需值***********************
    public static final String InvestTelephone = "17301216444";
    public static final String InvestPassword = "qqqqqq";
    public static final String InvestMoney = "1000";
    public static final String AssInvestByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************

    //***********************发现页面操作元素所需值（FoundPage）******************************
    public static final String FoundPageLoginTelePhone = "17301216444";
    public static final String FoundPagePassword = "qqqqqq";
    public static final String AssFoundPageByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************

    //***********************支付密码页面操作所需值***********************
    public static final String PayPWTelephone= "17301216444";
    public static final String PayPWPassword= "123456";
    public static final String GetVerifyByFindPayPW = "SELECT verify FROM vault_user_moblie_verify WHERE moblie='17301216444' ORDER BY id DESC LIMIT 1;";
    public static final String AssPayPWByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216444'";
    //************************************************************************************************


    //************************关于我们页面操作元素所需值（AboutUSPage）*************************
    public static final String AboutUSPageTelephone = "17301216004";
    public static final String AboutUSPagePassword = "qqqqqq";
    public static final String AssAboutUSByInUseID = "SELECT vault_user_auth.inuse FROM vault_user_auth,vault_user WHERE vault_user.id=vault_user_auth.user_id AND moblie='17301216004'";
    //************************************************************************************************

}
