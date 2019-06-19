package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClassesPOM {
private WebDriver driver; 
	
	//Should not be void
	public AddClassesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(xpath="//a[@href=\"usergroups.php\"]")
	private WebElement classesclick;

	@FindBy(xpath="(//img[@alt='Add classes'])")
	private WebElement addclasses;
	

	@FindBy(id="usergroup_name")
	private WebElement studentname;
	

	@FindBy(id="usergroup_description")
	private WebElement Description_classes;
	
	
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement openclass;
	
	
	
	
	@FindBy(xpath="//div[@class='dropdown-menu open']")
	private WebElement openclassselect;
	
	@FindBy(id="usergroup_submit")
	private WebElement usergroup_submit;
	
	/*public void registration_phone(String registration_phone) {
		this.registration_phone.clear(); 
		this.registration_phone.sendKeys(registration_phone); 
	}	
	*/
	public void classesclick() {
		this.classesclick.click(); 
	}	
	
	
	public void AddClassesPOM() {
		this.addclasses.click(); 
	}	
	
	public void studentname(String studentname) {
	this.studentname.clear(); 
	this.studentname.sendKeys(studentname); 
}	
	
	public void Description_classes(String Description_classes) {
	this.Description_classes.clear(); 
	this.Description_classes.sendKeys(Description_classes); 
}
	
	public void openclass() {
		this.openclass.click(); 
	}	
	
	
	public void openclassselect() {
		this.openclassselect.click(); 
	}	
	
	
	
	
	public void usergroup_submit() {
		this.usergroup_submit.click(); 
	}	
	

}
	
	

	

