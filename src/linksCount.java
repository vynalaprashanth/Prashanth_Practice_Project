import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://www.rahulshettyacademy.com/AutomationPractice/";
		
		driver.get(url);
	System.out.println(	driver.findElements(By.tagName("a")).size());
		
	WebElement footer=driver.findElement(By.id("gf-BIG"));
//WebElement li= (WebElement) driver.findElements(By.id(""));
	System.out.println(	footer.findElements(By.tagName("a")).size());
	
	WebElement st=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(st.findElements(By.tagName("a")).size());
	
	for(int i=1;i<st.findElements(By.tagName("a")).size();i++) {
		
		String keycontrol=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		st.findElements(By.tagName("a")).get(i).sendKeys(keycontrol);
		
		
	}
	
	Thread.sleep(10000);

	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
	
	
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	
	}

}
