package com.techproedseleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_VerifyURLTest {
	
public static void main(String[] args) {
	//The task: Verify the url is "www.google.com"
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/merve1/Desktop/tech/selenium dependecies/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		//Navigate to google home
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	// Verify the url is "https://www.google.com"
	String expectedUrl= "www.google.com";
	String actualUrl = driver.getCurrentUrl();
	
	if (expectedUrl==actualUrl)  {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		System.out.println("The urls do not match");
		System.out.println("Expected Url= " + expectedUrl);
		System.out.println("Actual Url= " + actualUrl);
		
	}
	driver.close();

	/* Result is: 
	Fail
	The urls do not match
	Expected Url= www.google.com
	Actual Url= https://www.google.com/*/
	
	}	
}
