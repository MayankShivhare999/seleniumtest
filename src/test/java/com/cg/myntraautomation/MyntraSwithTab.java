package com.cg.myntraautomation;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSwithTab {

WebDriver driver;
	
	public MyntraSwithTab() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void loadURL() {
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
	
	public void printInfo() {
		System.out.println("Current URL : "+driver.getCurrentUrl());
		System.out.println("Title of the Page : "+driver.getTitle());
	}
	
	public void clickMen() {
		String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("MEN")).sendKeys(tab);;
	}
	
	public void switchTab(int n) {
		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(n));
	}
	
}
