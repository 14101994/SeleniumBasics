package intro;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uname= driver.findElement(By.name("username"));
		WebElement pass =  driver.findElement(By.name("password"));
		WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		WebElement src = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
//		act.sendKeys(uname, "Admin");
//		act.sendKeys(pass,"admin123");
//		act.click(logInButton).build().perform();
		
		//we can decrease our above code
		
		act.dragAndDrop(src, uname).build().perform();
		Thread.sleep(3000);
		uname.clear();
		
		act.sendKeys(uname, "Admin").sendKeys(pass, "admin123")
		.click(logInButton).build().perform();
		
		System.out.println(driver.getTitle());
		

	}

}
;