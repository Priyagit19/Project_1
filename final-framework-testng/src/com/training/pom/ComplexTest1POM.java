package com.training.pom;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class ComplexTest1POM {
		
		private WebDriver driver; 
		
		//Should not be void
		public ComplexTest1POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(id="create_groups_submit")
		private WebElement creategroupssubmit;
}
