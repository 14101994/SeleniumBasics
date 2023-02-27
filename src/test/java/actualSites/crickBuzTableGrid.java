package actualSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class crickBuzTableGrid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum =0;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/50508/brh-vs-sys-25th-match-big-bash-league-2022-23");
		
		//limit the driver scope for accurate result
		 WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		 
		 //selecting one row from table having common css
		 int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		 System.out.println("total row count from table is " +rowCount);
		 
		 //counting the runs of each player using css travers method
		 int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		 System.out.println("total player played "+count);

		 //printing all the values for each player
		 for (int i=0; i<count-2; i++)
		 {
			System.out.println( table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			//string each score in string
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//converting string to integer format
			int valueInteger = Integer.parseInt(value);
			//adding each score in sum integer for total score
			sum = sum+valueInteger;
					
		 }
		 
		 System.out.println("total score without extras run "+sum);
		 
		 //finding extra run with xpath parent child method
		 String extra =  table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 String total =  table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		 int a = Integer.parseInt(extra);		 
		 int b = Integer.parseInt(total);
		 System.out.println("extra runs are "+ a);
		 System.out.println("total runse are "+ b);
		 
		 //final score is addition of sum and extra run
		int  totalSum = sum+a;
		System.out.println("total score is " +totalSum);
		
		Assert.assertEquals(b,totalSum);
	}

}
