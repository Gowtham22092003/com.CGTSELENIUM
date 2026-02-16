package VisibilityOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

		System.out.println(checkbox1.isDisplayed());
		
		System.out.println(checkbox1.isEnabled());
		
		System.out.println(checkbox1.isSelected());
		
		if (!checkbox1.isSelected()) {
			checkbox1.click();
		}
		
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	
		
		System.out.println(checkbox2.isSelected());
			
		if (checkbox2.isSelected()) {
			checkbox2.click();
		}
		System.out.println(checkbox2.isSelected());
	}

}
