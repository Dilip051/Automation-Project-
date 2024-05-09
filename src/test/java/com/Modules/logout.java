package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
public void user_logout(WebDriver driver) throws InterruptedException {
	driver.findElement(By.id("logout")).click();
	Thread.sleep(2000);
}
}
