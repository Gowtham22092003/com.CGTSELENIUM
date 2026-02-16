package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		
		boolean b=s.isMultiple();
		
		System.out.println(b);
		
		s.selectByVisibleText("Volvo");
		s.selectByIndex(2);
		
		List<WebElement> d=s.getAllSelectedOptions();
		
		for (WebElement txt : d) {
			
			System.out.println(txt);
		}
		WebElement First=s.getFirstSelectedOption();
		System.out.println(First);
		
		s.deselectAll();
	
	}
	
}
