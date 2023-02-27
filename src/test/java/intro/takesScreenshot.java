package intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		TakesScreenshot ts  =(TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(f, new File ("D:\\New folder\\abc.png"));
		
		System.out.println("ss captured");
		
	//	File path = new File ("C:\\abc.png");
	//	FileUtils.copyFile(f, path);
//syntax is correct but not working
	}

}
