package Android_Project_Data;

import Android_Project_ExPage.Android_Element_ObjectMap;
import Android_Project_ExPage.Android_LoadDevice_NotReset;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
public class BasePage extends Android_LoadDevice_NotReset{

    Android_Element_ObjectMap obj = null;

    public BasePage(){
        if(obj == null){
            obj = new Android_Element_ObjectMap();
        }
    }

    public void swipeToUp(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
    }
    public void swipeToDown(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        // wait for page loading
    }

    
    public void swipeToLeft(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    public void swipeToRight(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }

    public static void snapshot(TakesScreenshot drivername, String filename) {
        // this method will take screen shot ,require two parameters ,one is
        // driver name, another is file name

        String currentPath = System.getProperty("user.dir"); // get current work
        // folder
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy
        // somewhere
        try {
            System.out.println("save snapshot path is:" + currentPath + "/"
                    + filename);
            FileUtils
                    .copyFile(scrFile, new File(currentPath + "\\" + filename));
        } catch (IOException e) {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } finally {
            System.out.println("screen shot finished, it's in " + currentPath
                    + " folder");
        }
    }
}