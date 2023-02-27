package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		WebElement allMonth = driver.findElement(By.id("month"));
		Select sel = new Select(allMonth);
		List<WebElement> ls= sel.getOptions();
		for(WebElement abc:ls) {
			String monthName = abc.getText();
			System.out.println(monthName);

			if(monthName.contains("Aug")) {
				System.out.println("August is selected");
			}
		}

	}

}
