package com.Modules;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.log4j.helpers.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class download_receipt {
	
public void order_receipt(WebDriver driver) throws InterruptedException, IOException {
	driver.findElement(By.id("downloadpdf")).click();
	Thread.sleep(3000);  
	
}
public void pdf(WebDriver driver) throws IOException {
	File file= new File("C:\\Users\\ASUS\\Downloads\\confirmation (5).pdf");
//	load pdf document 
    PDDocument document=PDDocument.load(file);   // using 2.x dependency version
//	PDDocument document=Loader.
	
	PDFTextStripper pdfStripper=new PDFTextStripper();
	String text=pdfStripper.getText(document);
//	document.close();
    System.out.println(text);	
}
}
