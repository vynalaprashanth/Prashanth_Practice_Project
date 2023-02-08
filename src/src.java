import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class src {

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://www.google.co.in/";
		driver.get(url);
//		      try{
//
//		          File fscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		          System.out.println(fscreenshot.getPath());
//
//		          File fdest = new File("Screenshots:/");
//		          FileUtils.copyFile(fscreenshot,fdest);
//		          System.out.println(fdest.getPath());
//
//		      }catch(Exception e)
//		      {
//		          e.printStackTrace();
//		      }
		
		File fscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fscreenshot,new File("C:\\Users\\PrashanthVynala\\1.png"));		
		  }
	}


