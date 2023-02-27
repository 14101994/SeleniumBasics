package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class connectionDemo {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Akshay\\\\chromedriver_win32\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver;
		String host = "localhost";
		String port = "3306";
		Connection con =DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "Sweethome@14");
		Statement s = con.createStatement();
		ResultSet rs =s.executeQuery("select * from credentials");

		while(rs.next())
		{
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys( (rs.getString("username")));
		driver.findElement(By.id("password")).sendKeys( (rs.getString("password")));
		driver.findElement(By.id("Login")).click();
		}
	}


	

}
