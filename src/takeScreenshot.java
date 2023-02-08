import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class takeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://www.google.co.in/";
		driver.get(url);
		
		//TakesScreenshot scrShot =((TakesScreenshot)driver);
		
        Thread.sleep(2000);
       TakesScreenshot sc1= (TakesScreenshot) driver;
		File files=sc1.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Pictures\\Screenshots");
        
		FileUtils.copyFile(files,fs);
		
		
        System.out.println(fs);

//       
// File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(src1, new File("./SeleniumPrac/Screenshots.png"));    
//	
		
		
	}

	

}
