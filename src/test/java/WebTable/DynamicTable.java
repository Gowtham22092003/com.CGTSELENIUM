package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
	
		//Printing number of rows
		
		System.out.println(rows.size());
		
		// Print all text
		for (WebElement rowtxt : rows) {
			System.out.println(rowtxt.getText());
		}
	
		// Search name ciera and print  specific email ID
		List<WebElement> Searchrow=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		for (WebElement search : Searchrow) {
			if (search.getText().contains("Cierra")) {
				
			String	email=search.findElements(By.xpath("//div[@class='rt-td']")).get(3).getText();
			
				
				System.out.println("Email Id of Ciera: "+ email);
			
			}
		}
		
		//Deleting the record
		driver.findElement(By.xpath("//span[@id='delete-record-1']")).click();
		
		//Counting after deletion
		List<WebElement> Row=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		
		System.out.println("AFter deletion count is : "+ Row.size());
		
		
		//Add a new Record
		
		
		System.out.println("\n After add a new row-------");
		
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Gowtham");
		
		driver.findElement(By.id("lastName")).sendKeys("G");
		
		driver.findElement(By.id("userEmail")).sendKeys("Gowtham123@gmail.com");
		
		driver.findElement(By.id("age")).sendKeys("23");
		
		driver.findElement(By.id("salary")).sendKeys("25000");
		
		driver.findElement(By.id("department")).sendKeys("QA");
		
		driver.findElement(By.id("submit")).click();
		
		List<WebElement> Record=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
	
		boolean Newrecord=false;
		
		for (WebElement Recrow : Record) {
			
			if (Recrow.getText().contains("Gowtham") && Recrow.getText().contains("G")) {
				Newrecord=true;
				System.out.println("New Record is Added : "+Recrow.getText());
				
				break;
			}
		}
		if (!Newrecord) {
			System.out.println("Not Found New Record");
		}
	}
}
