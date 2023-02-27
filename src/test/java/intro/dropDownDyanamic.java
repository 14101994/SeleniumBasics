package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownDyanamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[7]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[1]")).click();

	}

}



////div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']
