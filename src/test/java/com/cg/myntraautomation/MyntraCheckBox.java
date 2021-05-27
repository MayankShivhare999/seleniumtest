package com.cg.myntraautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraCheckBox {

	WebDriver driver;

	public MyntraCheckBox() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void loadURL() {
		driver.get("https://www.myntra.com/men-bags-backpacks");
		driver.manage().window().maximize();
	}

	public void printInfo() {
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Title of the Page : " + driver.getTitle());
	}

	public void selectCheckBox() {
		List<WebElement> categories = driver.findElements(
				By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li"));
		for (WebElement c : categories) {
			if (c.getText().contains("Backpacks") || c.getText().contains("Handbags")) {
				c.click();
			}
		}
	}
}
