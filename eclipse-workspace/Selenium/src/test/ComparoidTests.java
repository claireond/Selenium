package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparoidTests {
	static WebDriver driver;	

	public static void main (String[] args) {
		//Giving chrome webdriver path
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+ "/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		//Open comparoid.com
		driver.get("https://comparoid.com/");

		//print current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("The tested url is " + currentURL);

		//maximize window
		driver.manage().window().maximize();

		/*
		 * //print current size
		Dimension currentSize = driver.manage().window().getSize();
		System.out.println("The current size is " + currentSize);		
		// or System.out.println(driver.manage().window().getSize());

		//setting and printing a new dimension
		Dimension newDimension = new Dimension(640, 480);
		driver.manage().window().setSize(newDimension);
		System.out.println("The new size is " + newDimension);
		 */


		// Close comparoid.com
		driver.quit();

	}

}