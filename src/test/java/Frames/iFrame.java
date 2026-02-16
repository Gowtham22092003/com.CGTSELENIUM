package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='tox-icon']")).click();
		
		WebElement	iframe=driver.findElement(By.id("mce_0_ifr"));
	
		driver.switchTo().frame(iframe);
		
		WebElement textarea=driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]"));
		
		String	frametxt=textarea.getText();
		System.out.println(frametxt);
		
		driver.switchTo().defaultContent();
		
		WebElement	outeriframe=driver.findElement(By.xpath("//h3[contains(text(),'An iFrame contain')]"));
		
		System.out.println(outeriframe.getText());
		
		
		
	}
}
