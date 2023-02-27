package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		//type first name
		driver.findElement(By.name("firstname")).sendKeys("Saurabh");
		driver.findElement(By.name("lastname")).sendKeys("zagade");
		driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("saurabh");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		
		//select day
		WebElement selectDay = driver.findElement(By.id("day"));
		selectDay.click();
		Select sel = new Select (selectDay);
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		WebElement dayText = sel.getFirstSelectedOption();
		String d = dayText.getText();
		System.out.println(d);
		
		//select month
		WebElement selectMonth = driver.findElement(By.id("month"));
		selectMonth.click();
		Select selMonth = new Select(selectMonth);
		selMonth.selectByValue("10");
		WebElement monthText =  selMonth.getFirstSelectedOption();
		System.out.println(monthText.getText());
		
		//select year
		WebElement selectYear = driver.findElement(By.id("year"));
		selectYear.click();
		Select selYear = new Select(selectYear);
		selYear.selectByIndex(3);
		WebElement yearText = selYear.getFirstSelectedOption();
		System.out.println(yearText.getText());
		
		//print all values from dropdown
		List <WebElement> monthCount =  selMonth.getOptions();
		int aa = monthCount.size();
		System.out.println(aa);
		for(WebElement mName:monthCount) {
			String allName = mName.getText();
			System.out.println(allName);
			
			//check specific value is present or not
			if(allName.contains("Aug")) {
				System.out.println("August month is present");
			}
		}

	}

}
