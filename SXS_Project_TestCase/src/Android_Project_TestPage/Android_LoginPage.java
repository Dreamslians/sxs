package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

public class Android_LoginPage
{

    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    public Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doLoginPageForgotPassword() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageForgotPassword")).click();
    }

    public void doLoginPageRegisterButton() throws Exception {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("LoginPageRegisterButton")).click();
    }

}
