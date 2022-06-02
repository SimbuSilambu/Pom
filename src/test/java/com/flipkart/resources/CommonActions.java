package com.flipkart.resources;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver d;
	public void URL(String url){
		WebDriverManager.chromedriver().setup();
 		d = new ChromeDriver();
 		d.get(url);
 		d.manage().window().maximize();
	}
	public void Send(WebElement Fi,String value){
     Fi.sendKeys(value);
	}
	public void Cli(WebElement cl){
		cl.click();
	}
	public void windowH(){
		String Pw = d.getWindowHandle();
		Set<String> Cw = d.getWindowHandles();
		for (String C : Cw) {
			if(!C.equals(Pw)){
				d.switchTo().window(C);
			}}
	}}
	
