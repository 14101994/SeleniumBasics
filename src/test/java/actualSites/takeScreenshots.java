package actualSites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("amazon");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\Admin.DESKTOP-31QM75N\\eclipse-workspaceNew\\seleniumIntro\\screenshots\\a.png");
		FileUtils.copyFile(f, destination);
		System.out.println("Screenshot Captured");
	}

}
