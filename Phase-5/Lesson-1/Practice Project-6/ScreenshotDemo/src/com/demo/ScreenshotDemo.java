package com.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\Users\USER\Downloads\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("D:\\Phase5\\Screenshots\\Facebook.png"));
			System.out.println("Screenshot Saved Successfully");
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Screenshot dpesn't saved successfully");
			
		}
	}

}
