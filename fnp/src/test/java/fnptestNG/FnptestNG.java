package fnptestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FnptestNG {

		public static WebDriver driver;
		
			@Test
			  public void g()
				{
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	      driver.get("https:\\www.fnp.com");
	driver.manage().window().maximize();

	}
	}



