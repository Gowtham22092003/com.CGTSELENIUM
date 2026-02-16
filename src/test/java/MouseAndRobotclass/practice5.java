package MouseAndRobotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5 {

	
	public static void main(String[] args) throws AWTException {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	WebElement textarea=driver.findElement(By.xpath("//textarea[@name='q']"));
	//	textarea.sendKeys("Selenium webdriver");
		
		Robot robo = new Robot();
		for (int i = 0; i < 2; i++) {
		
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
		}
		for (int i = 0; i < 5; i++) {
			
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
