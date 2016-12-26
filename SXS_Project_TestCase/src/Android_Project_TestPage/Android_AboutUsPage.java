package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.testng.Assert;

/**
 * Created by Dreamslians on 2016/11/17.
 */
public class Android_AboutUsPage extends BasePage
{
   public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    public void doJumpButton() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("JumpButton")).click();
    }

    public void doMyPageUserSettingButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("MyPageUserSettingButton")).click();
    }
    public void clickAboutUS() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAbout")).click();
    }
    public void clickSettingPageAboutVersion() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutVersion")).click();
        Assert.assertEquals("V1.2.4",Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutVersion")).getText());
    }
    public void clickSettingPageAboutChat() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutChat")).click();
        Assert.assertEquals("shaxiaoseng66",Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutChat")).getText());
    }
    public void clickSettingPageAboutTelephone() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutTelephone")).click();
    }
    public void clickSettingPageAboutNoDoTele() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutNoDoTele")).click();
    }
    public void clickSettingPageAboutReturnButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SettingPageAboutReturnButton")).click();
    }
    public void doUserButton() throws Exception{
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("UserButton")).click();
    }
    public void doAboutUS() throws Exception{
        Thread.sleep(300);
        doMyPageUserSettingButton();
        clickAboutUS();
        clickSettingPageAboutVersion();
        clickSettingPageAboutChat();
        Thread.sleep(200);
        clickSettingPageAboutTelephone();
        clickSettingPageAboutNoDoTele();
        clickSettingPageAboutReturnButton();
    }
    public void doAboutUSByLogin() throws Exception{
        Thread.sleep(300);
        doJumpButton();
        Thread.sleep(300);
        doUserButton();
        doMyPageUserSettingButton();
        clickAboutUS();
        clickSettingPageAboutVersion();
        clickSettingPageAboutChat();
        Thread.sleep(200);
        clickSettingPageAboutTelephone();
        clickSettingPageAboutNoDoTele();
        clickSettingPageAboutReturnButton();
    }
}
