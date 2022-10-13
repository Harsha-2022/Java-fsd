package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\Users\USER\Downloads\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		// Name
		WebElement names= driver.findElement(By.id("id_name"));
		names.sendKeys("LokeshRayala");
		
		// Email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("Lokesh@gmail.com");
		
		// CellPhone
		WebElement cell= driver.findElement(By.id("id_cell_phone"));
		cell.sendKeys("9876512340");
		
		// Password
		WebElement pass= driver.findElement(By.id("id_password"));
		pass.sendKeys("Loki!1234");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
		//driver.close();
		
	}

}
