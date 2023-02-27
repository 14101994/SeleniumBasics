package actualSites;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenKartEcommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		int j=0;
		
		String [] itemsNeeded = {"Brocolli", "Cucumber","Beetroot"};
		List <WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for (int i=0; i<products.size();i++) {
			
			String [] name =products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			//first will convert array into arraylist for easy search & more methods
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length) //if we found our items then no need to iterate all items agian
					
					break; //so will use break statement so it will immediately come out of loop
			}
		}

	}

}
