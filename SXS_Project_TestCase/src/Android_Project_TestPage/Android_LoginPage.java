package Android_Project_TestPage;

import Android_Project_ExPage.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_LoginPage extends BasePage
{

    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doLoginPageForgotPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageForgotPassword")).click();
    }

    public void doLoginPageRegisterButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("LoginPageRegisterButton")).click();
    }

}
