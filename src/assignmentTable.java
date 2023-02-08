import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentTable {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(3000);
		
		
		List<WebElement>list=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]"));
		int sum=0;
		for(int i=0;i<list.size();i++) {
			
			
			sum=sum+Integer.parseInt(list.get(i).getText());
			
		}		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.getTitle();
	
		WebDriverManager.chromedriver().setup();
		
		(text.getText())
		(tag.getTagName())
		Thread.sleep(2000);
		
		public static void main(String []args)
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("")).build().perform();
		
		
		
		ac.contextClick().perform();
		driver.switchTo().alert().accept();
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,600)");
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.id(""))
		driver.navigate().back();
		Alert alert=driver.switchTo().alert();
		
		
		InterruptedException
		
		.length();
		
		NoSuchElementException
		submit.isEnabled();
		
		
		
		
		
		
		
	}

}
