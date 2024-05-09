package com.Main_Module;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.BrowserSelection.BrowserSetup;
import com.Modules.M_login;
import com.Modules.add_cart;
import com.Modules.brand_select;
import com.Modules.check_out;
import com.Modules.continue_shopping;
import com.Modules.detail_checkout;
import com.Modules.download_receipt;
import com.Modules.fav_btn;
import com.Modules.logout;
import com.Modules.menubar;
import com.Modules.navigate_menubar;
import com.Modules.scroll_down;
import com.Modules.select_filter;

public class main_test {
WebDriver driver=null;
M_login lg=null;
brand_select bs=null;
add_cart ac=null;
check_out co=null;
detail_checkout dc=null;
download_receipt dor=null;
continue_shopping cs=null;
menubar navi=null;
fav_btn fv=null;
logout log=null;
select_filter fl=null;
scroll_down sDown=null;




	@BeforeTest
	public void browser() {
		driver=new BrowserSetup().Chrombrowser("chrome","https://bstackdemo.com/signin");
		
	}
	
	@Test(priority = 0)
	public void login() throws InterruptedException {
		lg=new M_login();
		lg.selectUser(driver);
		lg.User(driver);
		lg.selectPass(driver);
		lg.Password(driver);
		lg.Lbtn(driver);
		
	}
	
	@Test(priority = 1)
	public void brand() throws InterruptedException {
		bs=new brand_select();
		bs.select(driver);
			
	}
	
	
	@Test(priority = 2)
	public void addtocart() throws InterruptedException {
		ac=new add_cart();
		ac.cart(driver);
	}
	
	@Test(priority = 3)
	public void checkout() throws InterruptedException {
		co=new check_out();
		co.check_and_out(driver);
	}
	
	@Test(priority = 4)
	public void details_enter() throws InterruptedException {
		dc=new detail_checkout();
		dc.firstname(driver,"Dilip");
		dc.lastname(driver,"Makvana");
		dc.address(driver,"38,satadhar,surat");
		dc.state(driver,"gujrat");
		dc.pincode(driver,"395006");
		dc.submitt(driver);
	}
	@Test(priority = 5)
	public void receipt() throws InterruptedException, IOException {
		dor=new download_receipt();
		dor.order_receipt(driver);
		dor.pdf(driver);
	}
	
	@Test(priority = 6)
	public void c_shopping() throws InterruptedException {
		cs=new continue_shopping();
		cs.more_shopping(driver);
	}
	@Test(priority = 7)
	public void navigate() throws InterruptedException {
		navi=new menubar();
	    navi.orde(driver);
	    navi.offe(driver);
	    navi.favourite(driver);
	}
	@Test(priority = 8)
	public void favbtn() throws InterruptedException {
		fv=new fav_btn();
		fv.ref(driver);;
		fv.click_fav_btn(driver);
	}
	
	
	@Test(priority = 9)
	public void filter() throws InterruptedException {
		fl=new select_filter();
		fl.filter_select(driver);
	}
	
	
	@Test(priority = 10)
	public void scr_down() throws InterruptedException {
		sDown=new scroll_down();
		sDown.scroll(driver);
	}
	
	
	@Test(priority = 11)
	public void logout_user() throws InterruptedException {
		log=new logout();
		log.user_logout(driver);
	}
	
	
	
	
	@AfterTest
	public void browserclose() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("thank you for visit...");
		driver.close();
	}
}
