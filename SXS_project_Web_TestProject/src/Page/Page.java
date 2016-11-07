package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.JavascriptExecutor;

import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Set;
import java.util.List;

public class Page {

	public WebDriver driver;

	private String yamlFile;

	public Page(WebDriver driver) {
		this.driver = driver;
		yamlFile = "demo";
		this.getYamlFile();
	}

	private HashMap<String, HashMap<String, String>> ml;

	private HashMap<String, HashMap<String, String>> extendLocator;

	@SuppressWarnings("unchecked")
	protected void getYamlFile() {
		File f = new File("src/Data/" + yamlFile + ".yaml");
		try {
			ml = Yaml.loadType(new FileInputStream(f.getAbsolutePath()), HashMap.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void loadExtendLocator(String fileName) {
		File f = new File("locator/" + fileName + ".yaml");
		try {
			extendLocator = Yaml.loadType(new FileInputStream(f.getAbsolutePath()), HashMap.class);
			ml.putAll(extendLocator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void setLocatorVariableValue(String variable, String value) {
		Set<String> keys = ml.keySet();
		for (String key : keys) {
			String v = ml.get(key).get("value").replaceAll("%" + variable + "%", value);
			ml.get(key).put("value", v);
		}
	}

	private String getLocatorString(String locatorString, String[] ss) {
		for (String s : ss) {
			locatorString = locatorString.replaceFirst("%s", s);
		}
		return locatorString;
	}

	private By getBy(String type, String value) {
		By by = null;
		if (type.equals("id")) {
			by = By.id(value);
		}
		if (type.equals("name")) {
			by = By.name(value);
		}
		if (type.equals("xpath")) {
			by = By.xpath(value);
		}
		if (type.equals("className")) {
			by = By.className(value);
		}
		if (type.equals("linkText")) {
			by = By.linkText(value);
		}
		if (type.equals("tagName")) {
			by = By.tagName(value);
		}
		return by;
	}

	private WebElement watiForElement(final By by) {
		WebElement element = null;
		int waitTime = 10;
		try {
			element = new WebDriverWait(driver, waitTime).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver d) {
					return d.findElement(by);
				}
			});
		} catch (Exception e) {
			System.out.println(by.toString() + " is not exist until " + waitTime);
		}
		return element;
	}

	private boolean waitElementToBeDisplayed(final WebElement element) {
		boolean wait = false;
		if (element == null)
			return wait;
		try {
			wait = new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return element.isDisplayed();
				}
			});
		} catch (Exception e) {
			System.out.println(element.toString() + " is not displayed");
		}
		return wait;
	}

	public boolean waitElementToBeNonDisplayed(final WebElement element) {
		boolean wait = false;
		if (element == null)
			return wait;
		try {
			wait = new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return !element.isDisplayed();
				}
			});
		} catch (Exception e) {
			System.out.println("Locator [" + element.toString() + "] is also displayed");
		}
		return wait;
	}

	private WebElement getLocator(String key, String[] replace, boolean wait) {
		WebElement element = null;
		if (ml.containsKey(key)) {
			HashMap<String, String> m = ml.get(key);
			String type = m.get("type");
			String value = m.get("value");
			if (replace != null)
				value = this.getLocatorString(value, replace);
			By by = this.getBy(type, value);
			if (wait) {
				element = this.watiForElement(by);
				boolean flag = this.waitElementToBeDisplayed(element);
				if (!flag)
					element = null;
			} else {
				try {
					element = driver.findElement(by);
				} catch (Exception e) {
					element = null;
				}
			}
		} else
			System.out.println("Locator " + key + " is not exist in " + yamlFile + ".yaml");
		((JavascriptExecutor) driver)
				.executeScript(
						"element = arguments[0];" + "original_style = element.getAttribute('style');"
								+ "element.setAttribute('style', original_style + \";"
								+ "background: yellow; border: 2px solid red;\");"
								+ "setTimeout(function(){element.setAttribute('style', original_style);}, 1000);",
						element);
		return element;

	}

	public WebElement getElement(String key) {
		waitMs(500);
		return this.getLocator(key, null, true);
	}

	public List<WebElement> getElements(String key) {
		waitMs(500);
		List<WebElement> eles = null;
		if (ml.containsKey(key)) {
			HashMap<String, String> m = ml.get(key);
			String type = m.get("type");
			String value = m.get("value");
			By by = this.getBy(type, value);
			eles = driver.findElements(by);
		} else
			System.out.println("Locator " + key + " is not exist in " + yamlFile + ".yaml");
		for (WebElement e : eles) {
			((JavascriptExecutor) driver)
					.executeScript(
							"element = arguments[0];" + "original_style = element.getAttribute('style');"
									+ "element.setAttribute('style', original_style + \";"
									+ "background: yellow; border: 2px solid red;\");"
									+ "setTimeout(function(){element.setAttribute('style', original_style);}, 1000);",
							e);
		}
		return eles;
	}

	public WebElement getElementNoWait(String key) {
		return this.getLocator(key, null, false);
	}

	public WebElement getElement(String key, String[] replace) {
		return this.getLocator(key, replace, true);
	}

	public WebElement getElementNoWait(String key, String[] replace) {
		return this.getLocator(key, replace, false);
	}

	public void waitMs(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
