package fnptestNG;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazontestNG {
	public static WebDriver driver;



		@Test
	  public void f()
		{
			driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("krishbhuvan.7@gmail.com");
			driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
				driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Kbk@1234");
				driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		}
	 
		@BeforeClass
	  public void beforeClass() 
	  {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https:\\www.amazon.in");
	       driver.manage().window().maximize();
			
			
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  
	}
