package com.nop.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver=new ChromeDriver();
	@BeforeClass
	void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		
	}
	@BeforeMethod
	void beforemethod()
	{
		
		driver.get("https:\\www.nopcommerce.com");
		driver.manage().window().maximize();
	}
	@Test
	void test1() {
		WebElement ele=driver.findElement(By.xpath("//span[@class='ico-user sprite-image']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	

}
