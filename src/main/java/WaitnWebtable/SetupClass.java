package WaitnWebtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupClass 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Resource1/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		//Implicit Wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
	}
}


//Url haavi asel tar 2 types 
//driver.get("https://opensource-demo.orangehrmlive.com/");
//OR
//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");