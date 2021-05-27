package com.cg.googleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigation {

	WebDriver driver;
	
	public GoogleNavigation() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void loadURL() {
		driver.get("https://www.google.com/");
		
		//below statement will maximize the browser window
		driver.manage().window().maximize();
	}
	
	public void printInfo() {
		System.out.println("Current URL : "+driver.getCurrentUrl());
		System.out.println("Title of the Page : "+driver.getTitle());
	}
	
	/**
	 * This method will click the link whose text mathces with Images
	 */
	public void clickImage() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	public void forward() {
		driver.navigate().forward();
	}
	
	public void back() {
		driver.navigate().back();
	}
}
