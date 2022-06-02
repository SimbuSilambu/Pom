package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepositary.Pom;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketBatvalidation extends Pom {
	
     CommonActions a = new CommonActions();
	           Pom p = new Pom();
	           
	           
	static  String Batname;
	

	@Given("User Login With Valid Username and Password agains")
	public void user_Login_With_Valid_Username_and_Password_agains() throws Exception {
//		WebElement email= d.findElement(By.xpath("//*[text()='Login']//following::input[1]"));
//		email.sendKeys("9080655955");
//		d.findElement(By.xpath("//*[text()='Login']//following::input[2]")).sendKeys("9080655955");
//		d.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
//		Thread.sleep(3000); 
		
		a.Send(p.getLo1(), "9080655955");
		a.Send(p.getLo2(), "9080655955");
		a.Cli(p.getCl1());
		
	}

	@When("User Search The Bat")
	public void user_Search_The_Bat() throws Exception {
		//d.findElement(By.xpath("//*[@type='text']")).sendKeys("Cricket Bat");
		//d.findElement(By.xpath("//*[@type='submit']")).click();
		//Thread.sleep(3000);
		
		a.Send(p.getTx(), "Cricket Bat");
		a.Cli(p.getTx1());
		Thread.sleep(3000);
	}

	@When("User Click The Bat")
	public void user_Click_The_Bat() throws Exception {
//		d.findElement(By.xpath("(//*[@class='s1Q9rs'])[1]")).click();
//		String Pw = d.getWindowHandle();
//		Set<String> Cw = d.getWindowHandles();
//		for (String C : Cw) {
//			if(!C.equals(Pw)){
//				d.switchTo().window(C);
//			}}	
		a.Cli(p.getCl2());
		a.windowH();
		}
		
		@When("User Click The Go to Cart for Bat purchase")
		public void user_Click_The_Go_to_Cart_for_Bat_purchase() throws Exception {
//			d.findElement(By.xpath("//*[@class='_36yFo0']")).sendKeys("600020");
//			d.findElement(By.xpath("//*[@class='_2P_LDn']")).click();
//			Thread.sleep(3000);
//			d.findElement(By.xpath("//*[text()='3']")).click();
//			Thread.sleep(6000);
//			d.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
//			Thread.sleep(3000);
			
			a.Send(p.getS1(), "600020");
			a.Cli(p.getS3());
			Thread.sleep(3000);
			a.Cli(p.getS4());
			Thread.sleep(6000);
			a.Cli(p.getTx3());
			Thread.sleep(3000);
			
		}
		@Then("User Click and Buy The Product")
		public void user_Click_and_Buy_The_Product() throws Exception {
//			d.findElement(By.xpath("//*[text()='Place Order']")).click();
			
			a.Cli(p.getTx4());
	}
		
		}
	


