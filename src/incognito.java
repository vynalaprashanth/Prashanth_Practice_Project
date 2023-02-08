import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.remote.CapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
public class incognito {

	public static void main(String[] args) throws InterruptedException {

	   WebDriverManager.chromedriver().setup();
		  // WebDriver driver = new ChromeDriver(); 
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--incognito");
		
		   ChromeDriver driver=new ChromeDriver(options);
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000);

//		   int i=1;
//		   while(i<5)
//		   {
//			   
//               i++;
//		   }
	
		   
		   for(int i=1;i<5;i++)
		   {
			   driver.findElement(By.id("hrefIncAdt")).click();
		   }
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    
		    driver.close();
		   
		   }
		
	}


