package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Akshay\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		driver.findElement(By.name("proceed")).click();
		Alert alt = driver.switchTo().alert();
		String a = alt.getText();
		System.out.println(a);
		alt.accept(); //it will click on ok button
		//alt.dismiss(); it will click on cancel
		driver.close();

	}

}
