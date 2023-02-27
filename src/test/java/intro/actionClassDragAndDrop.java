package intro;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		for (int i=1; i<8; i++) {
		WebElement src = driver.findElement(By.id("box" +i));
		WebElement trg = driver.findElement(By.id("box10" + i));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, trg).build().perform();
		
//		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(f, new File("C:\\Users\\praf0\\Desktop\\March Automation Batch\\abc" + i + ".png"));
//		
//		Thread.sleep(2000);
		
		}
	}

}
