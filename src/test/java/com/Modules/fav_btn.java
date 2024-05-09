package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class fav_btn {

	public void ref(WebDriver driver) throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	public void click_fav_btn(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button")).click();
		Thread.sleep(5000);
		
		Actions at=new Actions(driver);
		WebElement fav=driver.findElement(By.xpath("//*[@id=\"favourites\"]/strong"));
		at.moveToElement(fav).click().perform();
		Thread.sleep(5000);    
		driver.navigate().back();
		Thread.sleep(3000);
	}
		
	}

