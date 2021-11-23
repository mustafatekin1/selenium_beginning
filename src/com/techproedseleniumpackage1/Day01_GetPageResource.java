package com.techproedseleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_GetPageResource {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/merve1/Desktop/tech/selenium dependecies/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//we use page source to find some text, title...
		String pageSource = driver.getPageSource();
		System.out.println(pageSource); 
		// we print all the page source which we see when we right click and select view page source on any webpage. 
		System.out.println(pageSource.contains("Most-loved dresses"));//false
		System.out.println(pageSource.contains("Computers and Accessories")); // true:some special characters may not work as &
	}
}
