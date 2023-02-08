import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	String pasword=getpassword(driver);
	String n= " prashanth";
	//driver.findElement(By.linkText("Forgot your password?")).click();
	
//	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("venny");
//	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("venny123@gmail.com");
//	driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9989163980");
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	
	driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
	
	
	driver.findElement(By.id("inputUsername")).sendKeys(n);
	driver.findElement(By.name("inputPassword")).sendKeys(pasword);
	Thread.sleep(1000);
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText(), "Hello"+n+",");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	
	driver.quit();
	


}
	

public static String getpassword(WebDriver driver) throws InterruptedException {
	
	String url="https://rahulshettyacademy.com/locatorspractice/";

		driver.get(url);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        String pwd=driver.findElement(By.cssSelector("p.infoMsg")).getText();
	String[]  pwdarray=pwd.split("'");
	String password= pwdarray[1].split("'")[0];
	return password;
	
	
	
}


}















