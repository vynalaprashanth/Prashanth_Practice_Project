import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sorting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		List<WebElement> eList = driver.findElements(By.xpath("//tr//td[1]"));
		
		List<String> oList = eList.stream().map(s->s.getText()).collect(Collectors.toList());
	
		List<String> wList = oList.stream().sorted().collect(Collectors.toList());
		// System.out.println(oList);
		
		
	}
 
}
