package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//find how many links are present in web page
		
		List <WebElement> ls= driver.findElements(By.tagName("a"));
		
		System.out.println(ls.size());  //count how many links are present
		
		for(WebElement abc : ls) {
			System.out.println(abc.getText()); //print all links
		}

	}

}
