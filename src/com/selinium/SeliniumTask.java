package com.selinium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeliniumTask {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala karthi\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		// Launch website
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		// Maximize
		  driver.manage().window().maximize();
		
		  WebElement log = driver.findElement(By.xpath("(//input [@type = 'text'])[2]"));
		 log.sendKeys("9688593090");
		 
		  WebElement pass = driver.findElement(By.xpath("//input [@type = 'password']"));
		 pass.sendKeys("bala@123");
		 
		 WebElement logIn = driver.findElement(By.xpath("(//span[text() = 'Login'])[2]")); logIn.click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(3000);
		 WebElement fn = driver.findElement(By.xpath("(//div[@class = 'xtXmba'])[4]")); 
		 Actions mouse = new Actions (driver); 
		 mouse.moveToElement(fn).perform();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a [text() = 'Kids']")).click();
		 
		 driver.findElement(By.xpath("(//a [@class= 'IRpwTa'])[3]")).click();
		 
		 Set<String> aw = driver.getWindowHandles();
		 
		 List<String> lis = new ArrayList<>();
		 
		 lis.addAll(aw);
		 
		 driver.switchTo().window(lis.get(1));
		 
		 
		 WebElement lns = driver.findElement(By.xpath("//span [text() = 'Girls Lehenga Choli Ethnic Wear Embroidered Lehenga, Choli and Dupatta Set']"));
		 System.out.println(lns.getText());
		 
		  
		 WebElement lnsa = driver.findElement(By.xpath("(//input [@type = 'text'])[2]"));
		 lnsa.sendKeys("620014");
		 
		 driver.findElement(By.xpath("//span [text() = 'Check']")).click();
		  
		 Thread.sleep(3000);
		 WebElement clic = driver.findElement(By.xpath("//button [@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		 clic.click();
		 
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a [text()='2 - 3 Years']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button [text()='ADD TO CART']")).click();
		 

		TakesScreenshot ts = (TakesScreenshot)driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		File pa = new File ("C:\\Users\\Bala karthi\\eclipse-workspace\\SeleniumProject\\TaskScreenshot\\order.png");
		FileUtils.copyFile(fs, pa);
		
		
		
		
		/*
		 * WebElement we =
		 * driver.findElement(By.xpath("//table [@class = 'tsc_table_s13']"));
		 * 
		 * List<WebElement> wall = we.findElements(By.tagName("tr")); for (int i=0; i <
		 * wall.size(); i++) { WebElement ob = wall.get(i);
		 * 
		 * //System.out.println(ob.getText());
		 * 
		 * List<WebElement> wall2 = ob.findElements(By.tagName("td"));
		 * 
		 * for (int j=0; j < wall2.size(); j++) {
		 * 
		 * WebElement ob1 = wall2.get(j);
		 * 
		 * System.out.println(ob1.getText()); } }
		 */

	}

}
