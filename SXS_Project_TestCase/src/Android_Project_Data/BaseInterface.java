package Android_Project_Data;

import Android_Project_ExPage.Android_LoadDevice_NotReset;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Dreamslians on 2016/12/23.
 */
public class BaseInterface extends Android_LoadDevice_NotReset
{
    @BeforeMethod
    public void doSetUp() throws Exception
    {
        setUp();
    }

    @AfterMethod
    public void TearDown()
    {
        Android_LoadDevice_NotReset.driver.quit();
    }

}
