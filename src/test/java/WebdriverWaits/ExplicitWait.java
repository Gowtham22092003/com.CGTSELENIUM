package WebdriverWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement	emailtxtfeild=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"email\"]")));
		
		emailtxtfeild.sendKeys("gautham");
		
		System.out.println("Email is entered succesfully after element is visible");
	}
}
