package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/22.
 */
public class Android_ChangePayPWPage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doMyPageUserSettingButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("MyPageUserSettingButton")).click();
    }

    public void doSettingPageSetPassword() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPassword")).click();
    }

    public void doSettingPageSetPasswordNewSure() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordNewSure")).click();
    }

    public void doSettingPageSetPasswordNewSureSubmit() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordNewSureSubmit")).click();
    }

    public void doSettingPageSetPasswordNewSureSubitFinsh() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SettingPageSetPasswordNewSureSubitFinsh")).click();
    }
    public void doChangePayPW() throws Exception{
        Thread.sleep(300);
        doMyPageUserSettingButton();
        doSettingPageSetPassword();
        Thread.sleep(500);
    }
}
