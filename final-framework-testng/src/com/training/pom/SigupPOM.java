package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigupPOM {

	private WebDriver driver; 
	
	//Should not be void
	public SigupPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="registration_firstname")
	private WebElement firstname; 
	
	@FindBy(id="registration_lastname")
	private WebElement lastname;
	
	@FindBy(id="registration_email")
	private WebElement registeremail; 
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="pass1")
	private WebElement passwordset;
	
	@FindBy(id="pass2")
	private WebElement confirmpwd;
	
	@FindBy(id="registration_phone")
	private WebElement registration_phone;
	
	@FindBy(xpath="(//p[@class='caption'])[2]")
	private WebElement teachcourses;
		
	@FindBy(id="registration_submit")
	private WebElement registration_submit;
	
	public void sendUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	public void sendPassword(String passwordset) {
		this.passwordset.clear(); 
		this.passwordset.sendKeys(passwordset); 
	}
	public void firstname(String firstname) {
		this.firstname.clear(); 
		this.firstname.sendKeys(firstname); 
	}
	
	public void lastname(String lastname) {
		this.lastname.clear(); 
		this.lastname.sendKeys(lastname); 
	}
	
	
	public void registeremail(String registeremail) {
		this.registeremail.clear(); 
		this.registeremail.sendKeys(registeremail); 
	}
	public void confirmpwd(String confirmpwd) {
		this.confirmpwd.clear(); 
		this.confirmpwd.sendKeys(confirmpwd); 
	}
	
	public void registration_phone(String registration_phone) {
		this.registration_phone.clear(); 
		this.registration_phone.sendKeys(registration_phone); 
	}	
	
	public void clickteachcourses() {
		this.teachcourses.click(); 
	}	
	
	public void registration_submit() {
		this.registration_submit.click(); 
	}	  
}
