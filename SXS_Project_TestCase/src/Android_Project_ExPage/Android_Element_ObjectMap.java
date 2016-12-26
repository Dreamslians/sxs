package Android_Project_ExPage;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Android_Element_ObjectMap {

	public static String property = "src/Android_Project_ExPage/demo.properties";

	static Properties properties;
	public Android_Element_ObjectMap(){
		properties = new Properties();
		try{
			FileInputStream in = new FileInputStream(property);
			properties.load(in);
			in.close();
		}catch(IOException e){
			System.out.println("读取配置文件失败");
			e.printStackTrace();
		}
	}

	public static By getLocaator(String ElementNamepropFile) throws Exception{

		//根据变量ElementNamepropFile，从配置文件中读取对应的配置对象
		String locator = properties.getProperty(ElementNamepropFile);
		
		//将配置文件中得定位类型存储到locatorType中，定位表达式存储到locatorValue中
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		locatorValue = new String(locatorValue.getBytes("ISO-8859-1"),"UTF-8");
		
		//输出获取到的locatorType和locatorValue
//		System.out.println("获取到的元素类型: "+locatorType+"获取到的元素定位表达式: "+locatorValue);
		
		//根据locatorTyoe判断返回的By类型定位方式
		if(locatorType.toLowerCase().equals("xpath")){
			return By.xpath(locatorValue);
		}else if(locatorType.toLowerCase().equals("id")){
			return By.id(locatorValue);
		}else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link"))){
			return By.linkText(locatorValue);
		}else if((locatorType.toLowerCase().equals("class")) || (locatorType.toLowerCase().equals("classname"))){
			return By.className(locatorValue);
		}else if(locatorType.toLowerCase().equals("partial")){
			return By.partialLinkText(locatorValue);
		}else if((locatorType.toLowerCase().equals("name"))){
			return By.name(locatorValue);
		}else{
			throw new Exception("输入的locator Type 未在程序中被定义"+locatorType);
		} 
	}
}
