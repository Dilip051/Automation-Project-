package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class continue_shopping {
public void more_shopping(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button")).click();
	Thread.sleep(5000);
}
}
