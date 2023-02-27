package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		
		if(gmailLink.isDisplayed()) {
			
			if(gmailLink.isEnabled()) {
				
				System.out.println(gmailLink.getText());
				gmailLink.click();
			}
		}
		
		else {
			System.out.println("Test failed");
		}
		

	}

}
