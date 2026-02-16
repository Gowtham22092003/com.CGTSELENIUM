package com.CGTSELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserJarLaunch {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\com.CGTSELENIUM\\jar\\msedgedriver.exe" );
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String exptitle=driver.getTitle();
		
		System.out.println(exptitle);
		
		
	

	}
}
