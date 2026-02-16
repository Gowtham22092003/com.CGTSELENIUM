package MouseAndRobotclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice4 {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions mouse= new Actions(driver); 
		
		//double click
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		mouse.doubleClick(doubleclick).perform();
		
		WebElement doubleclick_msg=driver.findElement(By.xpath("//p[text()='You have done a double click']"));
		
		String actualresult=doubleclick_msg.getText();
				
		if (actualresult.equals("You have done a double click")) {
		
			System.out.println("double clicked succcesfull");
		}
		
		
		//right click
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		mouse.contextClick(rightclick).perform();
		
		WebElement	rightclickmsg=driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
		String actualrightclick=rightclickmsg.getText();
		
		if (actualrightclick.equalsIgnoreCase("You have done a right click")) {
			System.out.println("Right clicked succesfully");
		}
		
		
		//Clixk
		
		WebElement clickme_button=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		mouse.click(clickme_button).perform();
		
		WebElement clickmemsg=driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
		
		String	actualclickmsg=clickmemsg.getText();
		if (actualclickmsg.equalsIgnoreCase("You have done a dynamic click")) {
			System.out.println("Single clicK is sucessfull");
		}
		
	}
	
}
