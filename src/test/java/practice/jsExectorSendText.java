package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import executor.JavaScriptExecutor;

public class jsExectorSendText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//get title of web page
		String pageTitle = js.executeScript("return document.title;").toString();
		System.out.println(pageTitle);
		
		//click on element
		WebElement wb = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();",wb);
		System.out.println("clicked successfully");
		Thread.sleep(2000);
		
		//send text in textbox
		WebElement username = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='admin';",username);
		System.out.println("username entered corectly");
		
		//scroll by operation
		js.executeScript("window.scrollBy(0,150)");
		
//		js.executeScript("document.getElementById('twotabsearchtextbox').click();");
//		js.executeScript("document.getElementById('twotabsearchtextbox').value='samsung';");

	}

}
