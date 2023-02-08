import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarhandling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();
	while(!driver.findElement(By.cssSelector("[class='flatpickr-month'] [title='Scroll to increment']")).getText().contains("April"))
		{
		driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/div/span[30]")).click();
		}
		Thread.sleep(3000);
		//List<WebElement>date = driver.findElements(By.className("day"));
		System.out.println("hi");
		int count = driver.findElements(By.className("flatpickr-day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			System.out.println(text);
		if(text.equalsIgnoreCase("24")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
			System.out.println("clicked");
			
		}
		
		
		
		
	}

}
