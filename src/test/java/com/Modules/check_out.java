package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class check_out {

	public void check_and_out(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='buy-btn']")).click();
	     Thread.sleep(5000);
	}
}
