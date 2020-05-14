package ProjectMy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass 
{
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	  driver.findElement(By.name("Submit")).click();  
  }
  
  @Parameters("browsers")
  @BeforeMethod
  public void beforeMethod(String brow) 
  {
	  String browser=brow;
	  
	  if(browser.equals(brow))
	  {
		  System.setProperty("webdriver.chrome.driver", "Resource1/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  else if(browser.equals(brow))
	  {
		  System.setProperty("webdriver.ie.driver", "Resource1/IEdriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  
	  else if(browser.equals(brow))
	  {
		  System.setProperty("webdriver.gecko.driver", "Resource1/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
