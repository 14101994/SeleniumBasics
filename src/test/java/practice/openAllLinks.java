package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[5]"));
		System.out.println( footer.findElements(By.tagName("a")).size());
		
		for (int i=0; i<footer.findElements(By.tagName("a")).size(); i++) {
			//String linkClick =  Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).click();
			Thread.sleep(2000);
		}
//		
		Set <String> abc= driver.getWindowHandles();
		Iterator <String> it =  abc.iterator();
//		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
//		WebElement footerLinks= driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[5]"));
//		List <WebElement> actualLinks = footerLinks.findElements(By.tagName("a"));
//		System.out.println(actualLinks.size());
//		Thread.sleep(3000);
//
//		for(int i=0; i<footerLinks.findElements(By.tagName("a")).size(); i++){
//
//		footerLinks.findElements(By.tagName("a")).get(i).click();
//		}
//
//		Set <String> abc = driver.getWindowHandles();
//		Iterator <String> it = abc.iterator();
//		while(it.hasNext()){
//			Thread.sleep(3000);
//		driver.switchTo().window(it.next());
//		System.out.println(driver.getTitle());
//
//		}
		
		
		
		
		
		
	}

}
