package com.cg.googleautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {

	public WebDriver webDriver; //instance of WebDriver interface 
	
	public GoogleAutomation() {
		
		//The setProperty() method of Java system class sets the property of the system which is indicated by a key.
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		
		//initilize webDriver 
		webDriver = new ChromeDriver();
	}
	
	/**
	 * This method will open URL in web browser
	 */
	public void loadDriver() {
		
		//get() method is used to open an URL and it will wait till the whole page gets loaded.
		webDriver.get("https://www.google.co.in/");
	}
	
	/**
	 * This method will print Current URL and Title of Page.
	 */
	public void printInfo() {
		String url = webDriver.getCurrentUrl();
		String title = webDriver.getTitle();
		System.out.println("Current URL is "+url);
		System.out.println(title);
	}
}
