package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Akshay\\chromeDriver V11\\chromedriver_win32 (1)\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);

			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
		
		/*	List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());

			for (int i=0; i<links.size(); i++){
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();

			Thread.sleep(4000);

			httpConn.connect();

			int rescode = httpConn.getResponseCode();

			if(rescode>400)
			{
			System.out.println(url + "_" +" is broken link");
			}
			else{
			System.out.println(url + "_" +" is valid link");
			}
			}	*/
			
			
	        driver.manage().window().maximize();
	        //driver.get("https://demoqa.com/broken");

	        //Storing the links in a list and traversing through the links
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // This line will print the number of links and the count of links.
	        System.out.println("No of links are "+ links.size());  
	      
	        //checking the links fetched.
	        for(int i=0;i<links.size();i++)
	        {
	            WebElement E1= links.get(i);
	            String url= E1.getAttribute("href");
	            verifyLinks(url);
	        }
	        
	        driver.quit();
	    }
	    
	    
	    public static void verifyLinks(String linkUrl)
	    {
	        try
	        {
	            URL url = new URL(linkUrl);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	        }catch (Exception e) {
	      } 
	   }
	}
			
			
			
			
			
			
			
			

			
