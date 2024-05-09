package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add_cart {

	public void cart(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"17\"]/div[4]")).click();
		Thread.sleep(6000);
	}
}
