package windowHandles;

import java.security.Identity;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allwindows= driver.getWindowHandles();
		
		for (String window: allwindows) {
			if (!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				
			System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
			
			driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		
		String parentTitle=driver.getTitle();
		
		if (parentTitle.equalsIgnoreCase("The Internet")) {
			System.out.println("Tittle succesful");
		}
		else {
			System.out.println("Not matching");
		}
	}

}
