package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitly wait
		driver.get("https://www.amazon.in");
		
//		WebDriverWait wait =new WebDriverWait(driver, 30);
//		//WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best Sellers"))).click();
//		
		WebDriverWait wait = new WebDriverWait (driver, null);
		

	}

}
