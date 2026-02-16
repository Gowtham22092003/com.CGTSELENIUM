package MouseAndRobotclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions mouse= new Actions(driver);
		
		WebElement	Fullname=driver.findElement(By.xpath("//input[@id='userName']"));
		mouse.sendKeys("Gowtham").perform();
		
		WebElement	usermail= driver.findElement(By.xpath("//input[@id='userEmail']"));
		mouse.sendKeys("gowtham123@gmail.com").perform();
		
		
		WebElement	current_addres=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		mouse.sendKeys("chennai").perform();
		
		WebElement	Permaddres=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		mouse.sendKeys("chennai").perform();
		
	//	WebElement	submit=driver.findElement(By.xpath("//button[text()='Submit']"));
	//	submit.click();
		
		
		
		
		
	}
}
