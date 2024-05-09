package com.BrowserSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
    WebDriver driver=null;
    public WebDriver Chrombrowser(String browser,String url) {
		if (browser.equals("chrome")|| browser.equals("Chrome")|| browser.equals("CHROME")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		return driver;
	}
}
