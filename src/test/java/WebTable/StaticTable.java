package WebTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Table=driver.findElement(By.xpath("//table[@name='BookTable']"));
	
		List <WebElement> Row=Table.findElements(By.tagName("tr"));
		
		
	
		//count of ROW
		System.out.println(Row.size());
	
		//count of Cell
		List<WebElement> cell=Row.get(0).findElements(By.tagName("th"));
		
		System.out.println(cell.size());
		
		
		for (int i = 0; i < Row.size(); i++) {
			
				
			
				List<WebElement> cells=Row.get(i).findElements(By.tagName("td"));
			
				for (WebElement cellText : cells) {
					
					System.out.println(cellText.getText());
				
				
				
				}
			
		}
		
		//Print price
		
		for (int i = 0; i <Row.size(); i++) {
			
			List<WebElement> cells=Row.get(i).findElements(By.tagName("td"));
			System.out.println(cells.get(3).getText());
		
		}
		
		
		//Fetch book name Where AMIT Equls
		for (int i = 0; i <Row.size(); i++) {
			
			List<WebElement> cells=Row.get(i).findElements(By.tagName("td"));
			
			String Author=cells.get(1).getText();
			
			if (Author.equalsIgnoreCase("Amit")) {
				System.out.println(cells.get(0).getText());
			}
		}
		
		
		
	
		
		
	
		
	
	}

}
