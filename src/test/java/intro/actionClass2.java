package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://prafpawar11.github.io/");
		driver.findElement(By.linkText("Right Click with Alert")).click();
		WebElement wb = driver.findElement(By.id("btn2"));
		
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert(); //switch to alert
		String abc = a.getText();
		System.out.println(abc);//grab the text from alert
		
		
		if(abc.contains("Right Click!")) {
			System.out.println("Alert popped succesfully");
		}
		else
			System.out.println("test failed");
		
		a.accept(); //acccept the alert

	}

}
