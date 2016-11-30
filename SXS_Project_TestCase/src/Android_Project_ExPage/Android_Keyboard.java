package Android_Project_ExPage;

import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_Keyboard implements AndroidKeyCode,AndroidKeyMetastate{

    //返回键
    public static void BACK(){
        Android_LoadDevice_NotReset.driver.pressKeyCode(4);
    }
    public static void Input8(){
        Android_LoadDevice_NotReset.driver.pressKeyCode(8);
    }
    //清除键
    public static void BACKSPACE (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(67);
    }

    //删除键
    public static void DEL (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(67);
    }

    //确定键
    public static void ENTER (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(66);
    }

    //Home键
    public static void HOME (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(3);
    }

    //菜单键
    public static void MENU (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(82);
    }

    //设置键
    public static void SETTINGS (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(176);
    }

    //空格键
    public static void SPACE (){
        Android_LoadDevice_NotReset.driver.pressKeyCode(62);
    }
}
