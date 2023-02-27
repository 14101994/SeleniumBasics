package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class openChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", "Google");
		Assert.assertEquals("Google", "Google");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.quit();

	}

}
