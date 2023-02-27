package intro;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class sychronizationFluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(Exception.class);
		
		WebElement text = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply (WebDriver driver) {
				
				if (driver.findElement(By.xpath("//div[@id='finish']/button")).isDisplayed())
					
				{
					
				return driver.findElement(By.xpath("//div[@id='finish']/button"));
				}
				
				else
					return null;
				
				
				}});
		System.out.println("-------------------------");
	    System.out.println(driver.findElement(By.cssSelector("div[@id='finish'] button")).getText());
		System.out.println("+++++++++++++++");
	}

}
