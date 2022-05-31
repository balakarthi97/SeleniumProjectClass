package com.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala karthi\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//LaunchWebsite
		String xurl = "https://www.facebook.com/";
		driver.get(xurl);
		
		//to maximize
		driver.manage().window().maximize();
		
		//to get title
		String title= driver.getTitle();
		System.out.println(title);
		
		//to get url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to check url
		boolean urlStatus= xurl.contains(url);
		System.out.println(urlStatus);
		
		if(urlStatus = true) {
			System.out.println("URL is Pass");
		}
		else {
			System.out.println("Url is Fail");
		}
		
		//to close url
		driver.close();
	}

}
