package jsExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import executor.JavaScriptExecutor;

public class js1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromeDriver V11\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("www.google.com");
		
		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");

	}

}
