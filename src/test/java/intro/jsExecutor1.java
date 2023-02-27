package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('hello world');"); //generate alert 
		
		js.executeScript("document.getElementById('twotabsearchtextbox').click();");
		
		WebElement wb = driver.findElement(By.id("nav-cart"));
		js.executeScript("arguments[0].click();", wb); //click on element
		Thread.sleep(3000);
		js.executeScript("location.reload()"); //refresh the page
		
		String a = js.executeScript("return document.title;").toString();
		System.out.println(a); //get title of web page

	}

}
