package com.cg.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAutomation {

	WebDriver driver;

	public RegisterAutomation() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void loadURL() {
		driver.get("http://demo.automationtesting.in/Register.html");
	}

	public void setUpperFields() {
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Mayank");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Shivhare");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Indore, M.P.");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("mayank@mail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("888999");

	}

	public void selectGender() {
		List<WebElement> list = driver.findElements(By.name("radiooptions"));
		for (WebElement we : list) {
			if (we.getAttribute("value").equals("Male")) {
				we.click();
			}
		}
	}

	public void selectHobies() {
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
	}

	public void selectLanguage() {
		WebElement languages = driver.findElement(By.id("msdd"));
		languages.click();
		List<WebElement> options = languages
				.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li"));
		for (WebElement we : options) {
			if (we.getText().contains("English") || we.getText().contains("Hindi")) {
				we.click();
			}
		}
	}

	public void selectSkill() {
		Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		skill.selectByVisibleText("Java");
	}

	public void selectCountry() {
		driver.findElement(By.xpath("//*[@id=\"countries\"]")).sendKeys("India");
	}

	public void selectCCountry() {
		WebElement dropdownBtn = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]/b"));
		dropdownBtn.click();
		List<WebElement> dropdownItems = dropdownBtn.findElements(By.xpath("//*[@id=\"select2-country-results\"]//li"));
		for (WebElement e : dropdownItems) {
			if (e.getText().contains("India")) {
				e.click();
				break;
			}
		}
	}

	public void setDOB() {
		driver.findElement(By.id("daybox")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).sendKeys("January");
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).sendKeys("1998");
	}
	
	public void setPassword() {
		driver.findElement(By.id("firstpassword")).sendKeys("password");
		driver.findElement(By.id("secondpassword")).sendKeys("password");
	}
	
	public void chooseFile() {
		WebElement chooseFile = driver.findElement(By.id("imagesrc"));
		chooseFile.sendKeys("C://Users//MASHIVHA//Desktop//photo.jpg");
	}

}
