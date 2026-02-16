package Alert;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Alert a=driver.switchTo().alert();
		String	simplealert =a.getText();
		
		System.out.println(simplealert);
		a.accept();
		
		
	}
}
