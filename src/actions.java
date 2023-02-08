import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions ac=new Actions(driver);
		WebElement wb=driver.findElement(By.id("nav-link-accountList"));
	ac.moveToElement(wb).build().perform();
	driver.findElement(By.xpath("//span[text()='Your Wish List']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//		
		ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		
		
		
		
	}

}
