package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowMinMax {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.close();
		

	}

}
