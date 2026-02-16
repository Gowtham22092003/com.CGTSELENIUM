package ShadowDom;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement shadowhost=driver.findElement(By.id("userName"));
		
		WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('input')", shadowhost);
		
		shadowRoot.sendKeys("Gowtham");
	}

}
