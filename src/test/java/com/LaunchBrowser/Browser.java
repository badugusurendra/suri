package com.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		
  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.nopcommerce.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Surendra");

	}

}
