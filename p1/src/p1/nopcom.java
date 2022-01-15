package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class nopcom {
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.nopcommerce.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//span[@class='ico-user sprite-image']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).build().perform();
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@class='btn blue-button'][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("Bharti");
	driver.findElement(By.id("LastName")).sendKeys("Jha");
	driver.findElement(By.id("Email")).sendKeys("Bh@gmail.com");
	driver.findElement(By.id("ConfirmEmail")).sendKeys("Bh@gmail.com");
	driver.findElement(By.id("Username")).sendKeys("Bharti Jha");
	driver.findElement(By.id("check-availability-button")).click();
	WebElement ele3=driver.findElement(By.name("CountryId"));
	Select sel=new Select(ele3);
	sel.selectByIndex(4);
	
	//driver.close();
}
}
