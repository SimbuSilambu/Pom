package com.flipkart.stepdefinition;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.resources.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonActions {
	
	CommonActions a = new CommonActions();
	@BeforeClass
	public void launch(){
//		WebDriverManager.chromedriver().setup();
// 		d = new ChromeDriver();
// 		d.get("https://www.flipkart.com/");
// 		d.manage().window().maximize();
		a.URL("https://www.flipkart.com/");
	}
	@AfterClass
	public void After(){
		d.quit();
	}

}
