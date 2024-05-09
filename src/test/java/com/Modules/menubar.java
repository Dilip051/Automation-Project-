package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class menubar {
//	WebDriver driver=null;
//	@BeforeTest
//public void browser() throws InterruptedException {

	

//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://bstackdemo.com/signin");
//	Thread.sleep(3000);
//}
//	@Test(priority = 0)
//	public void login(WebDriver driver) throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='demouser']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"password\"]/div/div[1]/div[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("login-btn")).click();
//		Thread.sleep(5000);
//	}
	
	public void offe(WebDriver driver) throws InterruptedException {
		Actions atActions=new Actions(driver);
		WebElement offer=driver.findElement(By.xpath("//*[@id=\"offers\"]/strong"));
		
		atActions.moveToElement(offer).click().perform();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		
	}
//	@Test(priority = 2)
	public void orde(WebDriver driver) throws InterruptedException {
		Actions atActions=new Actions(driver);
		WebElement order=driver.findElement(By.xpath("//*[@id=\"orders\"]/strong"));
		atActions.moveToElement(order).click().perform();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		
	}
//	@Test(priority = 3)
	public void favourite(WebDriver driver) throws InterruptedException {
		Actions atActions=new Actions(driver);
		WebElement fav=driver.findElement(By.xpath("//*[@id=\"favourites\"]/strong"));
		atActions.moveToElement(fav).click().perform();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		
	}
	
	
	
	
}
