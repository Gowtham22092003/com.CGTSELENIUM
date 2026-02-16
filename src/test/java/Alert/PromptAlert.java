package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("Gowtham");
		a.accept();
		
		String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (res.equalsIgnoreCase("You entered: Gowtham")) {
			
			System.out.println("Test pass");
		} else {
			System.out.println("test Fail");
		}
	}

}
