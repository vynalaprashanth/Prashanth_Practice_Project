import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions o = new ChromeOptions();
//		
//		o.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver();
  String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement dr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(dr);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		//driver.navigate().back();
		
		//driver.get(url);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("value"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("value").contains("RoundTrip")) {
			
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(2000);
		
		   driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000);

		 for(int i=1;i<5;i++)
		   {
			   driver.findElement(By.id("hrefIncAdt")).click();
		   }
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.close();

		

	}

}
