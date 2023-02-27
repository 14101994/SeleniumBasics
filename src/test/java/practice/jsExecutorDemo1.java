package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutorDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//sample program for js executor
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//send text to text box
		js.executeScript("document.getElementBtId('id of element').value='hello';");
		
		//another method to send text in textbox
		WebElement password = driver.findElement(By.xpath("xpath of element"));
		js.executeScript("arguments[0].value='hello';", password);
		
		//click on element
		js.executeScript("documnet.getElementById('id of element').click();");
		
		//get title of web page
		String title =  js.executeScript("documnet.title;").toString();
		System.out.println(title);
		
		//get url of web page
		String url = js.executeScript("document.URL;").toString();
		System.out.println(url);
		
		//refresh the page
		js.executeScript("location.reload()");
		
		//scroll page
		js.executeScript("window.scrollBy(0,150)");

	}

}
