package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class brand_select {

	public void select(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();
		Thread.sleep(6000);
	}
}
