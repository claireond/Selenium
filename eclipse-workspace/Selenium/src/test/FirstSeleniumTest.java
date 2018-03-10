package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

/**
 * @date 14/11/2017
 * @author lacla
 * Automation project
 */

public class FirstSeleniumTest {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	
	}

	public static void setBrowser () {
		browser = "Chrome";


	}
	public static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");
		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+ "/lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}

	}

	public static void runTest () {
		driver.get("https://comparoid.com/");
		driver.quit();

	}
}
