package MouseAndRobotclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions mouse = new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@class='simple-drop-container']//p[text()='Drop here']"));
		
		//mouse.dragAndDrop(drag, drop).perform();
		mouse.dragAndDrop(drag, drop).perform();
		
		WebElement Droppedmesg = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		
		
		
		
		String msg =Droppedmesg.getText();
		
		if (msg.equalsIgnoreCase("Dropped!")) {
		
			System.out.println("dropped sucessfully");
		}
		else {
			System.out.println("Not sucessfull");
		}
		
		

	}
}
