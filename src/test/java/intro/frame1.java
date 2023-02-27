package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		//we can hadnle frames using 3 methods
		//1.using frame index
		//2.using frame name
		//3.using webelement
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//switching frame 1
		driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized.browser.model")).click();
		Thread.sleep(2000);
		
		//switching frame 2
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		WebElement wb = driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		driver.switchTo().frame(wb);
		driver.findElement(By.linkText("AbstractAnnotations")).click();

	}

}
