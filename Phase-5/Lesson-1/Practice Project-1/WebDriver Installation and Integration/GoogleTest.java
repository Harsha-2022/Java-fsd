package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static void main(String[] args) {

		// download selenium google chrome driver from
		// Link: https://chromedriver.chromium.org/downloads
		// check your google chrome version from chrome>help>aboout google chrome
		// driver> check your version and downbload the driver

		// download selenium standalone server .jar and
		// selenium-standalone-server-3.5.0.jar AND Selenium-java-3.5.0.jar file from
		// link: https://www.selenium.dev/downloads/
		// and extract it
		
		String path = "C:\Users\USER\Downloads\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Add selenium java jar files and standalone server jar files in build path
		WebDriver driver = new ChromeDriver();

		String url = "http://www.google.com";
		driver.get(url);
		driver.close();
		System.out.println("Driver Working Properly");
	}

}
