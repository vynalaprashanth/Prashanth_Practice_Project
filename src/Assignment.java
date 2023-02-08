import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		
    	Thread.sleep(2000);
    //	Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), "3");
    	Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);
    	//	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    	//driver.close();
    	//Assert.asserte
    	
   
    	
	}

}
