package com.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select_filter {
public void filter_select(WebDriver driver) throws InterruptedException {
	WebElement e1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select"));
	Select s1=new Select(e1);
	s1.selectByVisibleText("Lowest to highest");
	Thread.sleep(4000);
	
}
}
