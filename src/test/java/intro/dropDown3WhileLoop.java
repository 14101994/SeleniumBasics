package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown3WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		
		//click it for 4 times, for this will use for loop
		for(int i=1; i<5; i++)
		{
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		
		//we can use while loop also
		/*int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		} */
		
		String a = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText();
		System.out.println(a);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click(); //click on done button

	}

}
