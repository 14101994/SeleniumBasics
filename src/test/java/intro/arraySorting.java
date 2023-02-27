package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.Copies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraySorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List <WebElement> originalList = driver.findElements(By.cssSelector("ul[class='oxd-main-menu']"));
	
		ArrayList <String> originalStringList = new ArrayList<String>();
		
		for(int i=0; i<originalList.size(); i++) {
			originalStringList.add(originalList.get(i).getText());		
			System.out.println(originalStringList);
		}
	
		ArrayList <String> copidList = new ArrayList<String>();
		
		for (int j =0; j<originalStringList.size(); j++) {
			copidList.add(originalStringList.get(j));
		}

		Thread.sleep(2000);
		Collections.sort(copidList);
		
		for(String abc:copidList) {
			System.out.println(abc);
		}
		
	}

}
