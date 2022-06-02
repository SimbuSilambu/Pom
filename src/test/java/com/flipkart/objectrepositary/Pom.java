package com.flipkart.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class Pom extends CommonActions{
	public Pom(){
		PageFactory.initElements(d, this);
	}
	public WebElement getLo1() {
		return lo1;
	}
	public WebElement getLo2() {
		return Lo2;
	}
	public WebElement getCl1() {
		return cl1;
	}
	public WebElement getTx() {
		return tx;
	}
	public WebElement getTx1() {
		return tx1;
	}
	public WebElement getCl2() {
		return cl2;
	}
	public WebElement getS1() {
		return s1;
	}
	public WebElement getS3() {
		return s3;
	}
	public WebElement getS4() {
		return s4;
	}
	public WebElement getTx3() {
		return tx3;
	}
	public WebElement getTx4() {
		return tx4;
	}
	
	@FindBy(xpath = "//*[text()='Login']//following::input[1]")
	private   WebElement lo1;
	@FindBy(xpath = "//*[text()='Login']//following::input[2]")
	private WebElement Lo2;
	@FindBy(xpath = "(//*[text()='Login'])[3]")
	private WebElement cl1;
	@FindBy(xpath = "//*[@type='text']")
	private WebElement tx;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement tx1;
	@FindBy(xpath = "(//*[@class='s1Q9rs'])[1]")
	private WebElement cl2;
	@FindBy(xpath = "//*[@class='_36yFo0']")
	private WebElement s1;
	@FindBy(xpath="//*[@class='_2P_LDn']")
	private WebElement s3;
	@FindBy(xpath = "//*[text()='3']")
	private WebElement s4;
	@FindBy(xpath = "//*[text()='ADD TO CART']")
	private WebElement tx3;
	@FindBy(xpath = "//*[text()='Place Order']")
	private WebElement tx4;

}
