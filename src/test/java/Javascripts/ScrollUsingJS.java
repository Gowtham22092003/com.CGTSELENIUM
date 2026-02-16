package Javascripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJS {

	
	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement	submit=driver.findElement(By.id("submit"));
		
		WebElement username=driver.findElement(By.id("userName"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",submit );
		
		js.executeScript("arguments[0].scrollIntoView(false)", username);
	
	
	}
}
