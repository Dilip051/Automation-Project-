package com.Modules;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BrowserSelection.BrowserSetup;

public class M_login {

	
public void selectUser(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]")).click();
	Thread.sleep(1000);
}

public void User(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='demouser']")).click();
	Thread.sleep(2000);
	
}
public void selectPass(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"password\"]/div/div[1]/div[1]")).click();
	Thread.sleep(1000);
}

public void Password(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
	Thread.sleep(2000);
}

public void Lbtn(WebDriver driver) throws InterruptedException {
	driver.findElement(By.id("login-btn")).click();
	Thread.sleep(5000);
}
 }