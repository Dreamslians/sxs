package Android_Project_TestPage;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;

/**
 * Created by Dreamslians on 2016/11/24.
 */
public class Android_SetPicturePage
{
    public Android_LoadDevice_NotReset an = new Android_LoadDevice_NotReset();
    Android_Element_ObjectMap ao = new Android_Element_ObjectMap("src/Android_Project_ExPage/demo.properties");

    public void doSetPictureClick() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SetPictureClick")).click();
    }

    public void doSetPictureByTake() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SetPictureByTake")).click();
    }

    public void doSetPictureByPick() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SetPictureByPick")).click();
    }

    public void doSetPictureLost() throws Exception
    {
        Android_LoadDevice_NotReset.driver.findElement(ao.getLocaator("SetPictureLost")).click();
    }

}
