import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String pr=it.next();
		String ch=it.next();

		driver.switchTo().window(ch);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red [href]")).getText());
		
		driver.switchTo().window(pr);
	//	String email=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split("")[2];
		String email=driver.findElement(By.cssSelector(".text-center.text-white b:nth-child(1) i")).getText();
		
		
		
		driver.findElement(By.name("username")).sendKeys(email);
	String pwd=	driver.findElement(By.cssSelector(".text-center.text-white b:nth-child(2) i" )).getText();
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.className("checkmark")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
//		//p[@class='text-center text-white'] /b[2] /i
		
		
		
	}

}
