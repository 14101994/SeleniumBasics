import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonMobText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/s?k=mobile+phone+under+20000&crid=3H17IG6GL2VJT&sprefix=mobile+phone+%2Caps%2C505&ref=nb_sb_ss_ts-doa-p_2_13");
		Thread.sleep(3000);
		//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']
		
		List<WebElement> wb =driver.findElements(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']"));
		
		
		for (int i=0; i<wb.size(); i++) {
			String a = wb.get(i).getText();
			System.out.println("************Mobile Text Is "+a);
			
		}

	}

}
