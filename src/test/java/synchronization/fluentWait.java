package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fluentWait {

	//public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/signup");
		
		

	}

}
