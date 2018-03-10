package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	
	}
	public static void readPropertiesFile() {
	
		try {

			InputStream input = new FileInputStream("C:/Users/lacla/eclipse-workspace/Selenium/src/config/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			FirstSeleniumTest.browser=prop.getProperty("browser");
			System.out.println(FirstSeleniumTest.browser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream("C:/Users/lacla/eclipse-workspace/Selenium/src/config/config.properties");
		prop.setProperty("browser", "Chrome");
		prop.setProperty("result", "pass");
		prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
