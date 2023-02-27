package intro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create an account")).click();

		Set<String> ids = driver.getWindowHandles();
		for (String abc : ids) {   //using enhanced for loop we can get windows ids
			System.out.println(abc);
		}
	}
}
