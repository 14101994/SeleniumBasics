package brokenLink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromeDriver V11\\chromedriver_win32 (1)\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");

	}

}
