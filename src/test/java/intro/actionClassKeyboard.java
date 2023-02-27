package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(4000);
		
		Actions act =new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		Thread.sleep(4000);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		WebElement wb  = driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.xpath("//span [@class = 'a-button-inner']")).click();
		Thread.sleep(3000);
		act.keyDown(Keys.SHIFT).sendKeys(wb, "iphone").build().perform();
		System.out.println("hello");

		
		//act.keyUp(Keys.SHIFT).sendKeys("")
	}

}
