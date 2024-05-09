package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_down {
	
	
	
//	WebDriver driver=null;
//	@BeforeTest
//  public void browser() throws InterruptedException {
//
//	
//
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://bstackdemo.com/signin");
//	Thread.sleep(3000);
//}
//	@Test(priority = 0)
//	public void login() throws InterruptedException {
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
	
public void scroll(WebDriver driver) throws InterruptedException {
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollby(0,300)");
	  WebElement e1=driver.findElement(By.xpath("//*[@id=\"18\"]/p"));
	js.executeScript("arguments[0].scrollIntoView();", e1);
	Thread.sleep(4000);
	driver.navigate().refresh();
}
}
