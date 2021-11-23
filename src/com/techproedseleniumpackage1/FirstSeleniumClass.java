package com.techproedseleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {	
/* 
 Very important notes to install selenium in eclipse:
 - Create new folder as selenium dependencies in a specific location in the computer
 - Create 2 folders as 
 	* libraries
 	* drivers
 - download java libraries from the selenium.dev/downloads web page.
 - It is a zip file, open this downloaded folder 
 and drag and drop the all files to our "*libraries" folder
 - download drivers: . scroll down on the same page selenium.dev/downloads
 					 . click browser+	
 					 . select chrome latest stable version 
 					 (confirm that the version is same with the real chrome version of your computer)
- open the downloaded file drag and drop (copy) the file to "*drivers" folder.

- Create a new Java project>>package>>class 
- right click on the project>>build path>>configure build path>>select class path>>add external jars>> 
>> find the libraries folder>> there are totally 7 jar files (2 is directly seen, 5 is under libs)
>> Add all 7 jar files and apply.


 					 
  * Lets open the google home page in our class with the following codes.

A. System.setProperty method:
	1. System.setProperty("", ""); eclipse göstermedi. kendim yazdým
	2. first argument is always: "webdriver.chrome.driver"
	3. Second argument is the path of "chromedriver.exe" which we created at the beginning of the selenium install video
		- change the two-forward-slashes (\\) ==> (/) to one back slash
		- add the name of the driver at the end:  chromedriver.exe

B. WebDriver driver = new ChromeDriver(); create driver object
	driver.get() ile istediðimiz web sitesini açabiliriz.
 
*/		
		System.setProperty("webdriver.chrome.driver", "C:/Users/merve1/Desktop/tech/selenium dependecies/drivers/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
	}
	
}
