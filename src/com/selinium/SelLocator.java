package com.selinium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class SelLocator {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala karthi\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//select [@name = 'country']")).click();
		
		Thread.sleep(2000);
		
		WebElement mon = driver.findElement(By.xpath("//select [@id = 'fruits']"));
		//mon.click();
		
		Select country = new Select (mon);
		
		List <WebElement> alls = country.getOptions();
		System.out.println(alls);
		
		for (int i=0; i<alls.size(); i++) {
			
			if(i%2 == 0) {
				
				country.selectByIndex(i);
			}
		}
	}
}	
		
		
		
		/*for(WebElement sel : clic) {	 
		String text = sel.getText();
		
		if (text.contains("Selenium")) {
			sel.click();
			break;
		}*/
		
			

		
		/*WebElement dateTable = driver.findElement(By.tagName("table"));
		List <WebElement> allDate = dateTable.findElements(By.tagName("tr"));
		
		    for(int i=1; i<allDate.size(); i++ ) {
			WebElement allRD = allDate.get(i);
		
		   //for (WebElement allRD: allDate) {
			
			List<WebElement> rowDate = allRD.findElements(By.tagName("td"));
			
			for(int j=0; j<rowDate.size();j++) {
				WebElement rdata = rowDate.get(j);
			
			//for( WebElement rdata : rowDate ) {
				
				String dateText = rdata.getText();
				
				if (dateText.equals("21") ) {
					rdata.click();
					break;
				}
			}
			
		}*/
		
		
		
		