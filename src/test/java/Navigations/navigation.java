package Navigations;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://example.com/");
		
		driver.findElement(By.xpath("//a[.='Learn more']")).click();
		
		driver.navigate().back();
		
		String backTitle=driver.getTitle();
		System.out.println(backTitle);
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		String forwordtitle =driver.getTitle();
		
		System.out.println(forwordtitle);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		
	}
}
