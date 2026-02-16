package TakeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenshots {
	
	public static void main(String[] args) throws IOException {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
			WebElement	Toolsapp=driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	
			JavascriptExecutor js= (JavascriptExecutor)driver;
	
			js.executeScript("arguments[0].setAttribute('style','Background:yellow;border:4px solid red')", Toolsapp);
			
			TakesScreenshot ts= (TakesScreenshot)driver;
	
			File temp= ts.getScreenshotAs(OutputType.FILE);
			
			File perm= new File("C:\\Users\\admin\\eclipse-workspace\\com.CGTSELENIUM\\Screenshots.png");
			
			org.openqa.selenium.io.FileHandler.copy(temp, perm);
			
	
	}

}
