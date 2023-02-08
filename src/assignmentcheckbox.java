import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentcheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();

	String opt=	driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
		//System.out.println(stt);
		
	WebElement dropdown=driver.findElement(By.name("dropdown-class-example"));
	
	Select s=new Select(dropdown);
	
	s.selectByVisibleText(opt);
		
driver.findElement(By.name("enter-name")).sendKeys(opt);	
driver.findElement(By.id("alertbtn")).click();
String alt=driver.switchTo().alert().getText();
if(alt.contains(opt)) {
	System.out.println("successful");
}else {
	System.out.println("Unsuccessful");
}
		
	}

}
