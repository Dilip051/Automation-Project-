package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class detail_checkout {
	

	public void firstname(WebDriver driver,String first) throws InterruptedException {
		driver.findElement(By.id("firstNameInput")).sendKeys(first);
		Thread.sleep(3000);
	}
	public void lastname(WebDriver driver,String last) throws InterruptedException {
		driver.findElement(By.id("lastNameInput")).sendKeys(last);
		Thread.sleep(2000);
	}
	public void address(WebDriver driver,String address) throws InterruptedException {
		driver.findElement(By.id("addressLine1Input")).sendKeys(address);
		Thread.sleep(2000);
	}
	public void state(WebDriver driver,String state) throws InterruptedException {
		driver.findElement(By.id("provinceInput")).sendKeys(state);
		Thread.sleep(2000);
	}
	public void pincode(WebDriver driver,String pin) throws InterruptedException {
		driver.findElement(By.id("postCodeInput")).sendKeys(pin);
		Thread.sleep(2000);
	}
	public void submitt(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("checkout-shipping-continue")).click();
		Thread.sleep(3000);
		
		
		String ss=driver.findElement(By.id("confirmation-message")).getText();
		if (ss.equals("Your Order has been successfully placed.")) {
			System.out.println("your order has been placed successfully.");
		} else {
             System.out.println("your order has been not placed.");
		}
	}
}
