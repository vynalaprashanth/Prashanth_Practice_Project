import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());   
    Thread.sleep(2000);
 
    driver.findElements(By.cssSelector("input[type='checkbox']")).size();
 // Assert.assertEquals(,"6");

//    System.out.println(  driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//    Assert.assertEquals( driver.findElements(By.cssSelector("input[type='checkbox']")).size(), "6");

 // driver.close();
		
		
		
		
		
		
	}

}
