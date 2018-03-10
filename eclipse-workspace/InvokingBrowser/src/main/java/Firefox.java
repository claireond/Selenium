import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
public static void main(String[] args) {
		//Giving firefox webdriver path
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/geckodriver/geckodriver.exe");
					
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.fr/");
	
	}

}
