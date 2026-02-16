package MouseAndRobotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {
	
	public static void main(String[] args) throws AWTException {
		
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		Actions mouse = new Actions(driver);
		
		
		
		WebElement Fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		mouse.moveToElement(Fashion).perform();
		
		Robot robo = new Robot();
		
		for (int i = 0; i < 2; i++) {
			
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);		
		} 
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}

}
