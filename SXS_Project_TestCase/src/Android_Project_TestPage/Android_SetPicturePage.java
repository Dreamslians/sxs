package Android_Project_TestPage;

import Android_Project_Data.BasePage;
import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/24.
 */
public class Android_SetPicturePage extends BasePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();

    public void doSetPictureClick() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SetPictureClick")).click();
    }

    public void doSetPictureByTake() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SetPictureByTake")).click();
    }

    public void doSetPictureByPick() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SetPictureByPick")).click();
    }

    public void doSetPictureLost() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(Android_Element_ObjectMap.getLocaator("SetPictureLost")).click();
    }

}
