package com.techproedseleniumpackage1;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_VerifyTitleTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:/Users/merve1/Desktop/tech/selenium dependecies/drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
//Navigate to google home
driver.get("https://www.google.com");
driver.manage().window().maximize();
//verify if title is "google"
String expectedTitle = "google";
String actualTitle = driver.getTitle();

//1st way with if
if (expectedTitle==actualTitle)  {
	System.out.println("Pass");
}
else {
	System.out.println("fail");
	System.out.println("Titles do not match");
	System.out.println("Expected Title= " + expectedTitle);
	System.out.println("Actual Title= " + actualTitle);
	
}
driver.close();

assertTrue(expectedTitle==actualTitle);
/*
  If we come across a fail as this or when we find a bug:
   1. Run the script again and be sure about automation script is true
   2. Test manually to make sure the functionality is good
   3. Communicate with BA (Business Analyst-who writes acceptance criteria) 
   or communicate with sometimes PO (Product Owner- provides the acceptance criteria)
   - Ask them if it is an expected behavior or not!
   - Or ask them if it is a typo in the test case text or ...
   4. Neither fix nor ignore the bug!!! Even if it is a minor typo.
 
 *** Our GOAL IS TO WRITE SCRIPT TO CATCH BUGS
 *** OUR GOAL IS TO CATCH BUGS
 *** OUR GOAL IS BUGS :)
 *** BUGS BUGS BUGS  

   5. Should I open a JIRA without the response.
   - Follow the company culture
	   - Some companies do not open JIRA ticket if the story is in development.
	   - Talk to Dev to fix the issue quickly.
	   - Respect but do not trust
	   - Confirm that the bug is fixed
	   - Retest
   - Some companies directly open a JIRA ticket
   
   6. NOTE: If you find a bug that is already developed
   - Communicate
   - And Open a JIRA ticket. Because the user story has been created already
   
   7. Purpose of opening a JIRA ticket is to track the bug.  
     
  */

	}
	
}
