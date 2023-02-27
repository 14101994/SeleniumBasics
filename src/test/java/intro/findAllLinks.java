package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		
		List <WebElement> ls = driver.findElements(By.tagName("a"));
		
		System.out.println(ls.size());  //print count of all links
		
		//print all links in output
		for (WebElement abc:ls) {
			String names = abc.getText();
			System.out.println(names);
		}
		
		

	}

}
