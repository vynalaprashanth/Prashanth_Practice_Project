import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollTable {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
     //	cssSelector	div.left-align tbody tr td:nth-child(2)
	//big table xpath	//div[@class='left-align']/fieldset/table/tbody/tr/td/following-sibling::td[2]
	List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
	List<WebElement> list = driver.findElements(By.cssSelector("div.tableFixHead tbody tr"));
		int sum=0;
	for(int i=0;i<list.size();i++) {

		
		sum= sum+Integer.parseInt(value.get(i).getText());
//			System.out.println(driver.findElement(By.cssSelector(".tableFixHead td")).getText());
					
		}
	System.out.println(sum);
	driver.findElement(By.cssSelector(".totalAmount")).getText();
	
 int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
Assert.assertEquals(sum, total);
	
	
	}

}
