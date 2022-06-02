package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Vivomobilevalidation {
	static WebDriver d;
	
	
	@Given("User Launch Flipkart Application")
	public void user_Launch_Flipkart_Application() throws Exception {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
	    
	}

	@Given("User Login With Valid Username and Password")
	public void user_Login_With_Valid_Username_and_Password() throws Exception {
		WebElement email= d.findElement(By.xpath("//*[text()='Login']//following::input[1]"));
		email.sendKeys("9080655955");
		d.findElement(By.xpath("//*[text()='Login']//following::input[2]")).sendKeys("9080655955");
		
		d.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
		Thread.sleep(3000);
		
	   
	}
	@When("User Search The Vivo Y{int} Mobile")
	public void user_Search_The_Vivo_Y_Mobile(Integer int1) throws Exception {
		d.findElement(By.xpath("//*[@type='text']")).sendKeys("Vivo y 17");
		d.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@When("User Click The Mobile")
	public void user_Click_The_Mobile() {
		d.findElement(By.xpath("(//*[@class='s1Q9rs'])[1]")).click();

}

	@When("User Click Mobile Communication")
	public void user_Click_Mobile_Communication() {
		String Pw = d.getWindowHandle();
		Set<String> Cw = d.getWindowHandles();
		for (String C : Cw) {
			if(!C.equals(Pw)){
				d.switchTo().window(C);
			}
			
		}
		
		d.findElement(By.xpath("//*[text()='KRISHIKA MOBILE COMMUNICATION ']")).click();
	    
	}

	@Then("User Communicate To Order The Mobile")
	public void user_Communicate_To_Order_The_Mobile() throws Exception {
		String C = d.getWindowHandle();
		Set<String> Cw2 = d.getWindowHandles();
		
		for (String th : Cw2) {
			if(th.equals(C)){
				d.switchTo().window(th);
			}
			
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[text()='Contact Seller']")).click();
		d.quit();
	    
	}
	
	   
		

}
