package actualSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceJetUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		
		//select from location
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[7]")).click(); //select from location
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[1]")).click(); //select to location
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-14']")).click(); //click on date
		
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click(); //select passengers
		
		for(int i=1; i<5; i++) {
			
			
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click(); //click on done button
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'])[2]//div[3]")).click(); //click on radio button

	}

}
