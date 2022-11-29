package package_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_makemytrip extends util_makemytrip {
	public static String url="https://www.makemytrip.com/";
WebDriver driver;

@BeforeTest
public void beforetest() throws InterruptedException
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
Thread.sleep(5000);
driver.get(url);
	}	

@Test
public void tc1() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.linkText("Holiday Packages")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='appendBottom5 ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("toCity")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("Singapore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='dest-search-list']/div")).click();
	Thread.sleep(6000);
	
//	driver.findElement(By.xpath("//*[@for='departure_date']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='DayPicker-Day']/div/p"));
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='appendBottom5 blue-font up-arrow']"));
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='skipBtn']")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='DayPicker-Months']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@aria-label='Wed Nov 16 2022']")).click();
	driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
	Thread.sleep(2000);
}
@Test

	public void tc2()throws InterruptedException {
	
		
		
	}



















}
