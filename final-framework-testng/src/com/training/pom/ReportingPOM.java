package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingPOM {
	
	private WebDriver driver; 
	
	//Should not be void
	public ReportingPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//img[@alt='Reporting']")	
	private WebElement reporting;	
	
	@FindBy(xpath="//table/tbody/tr[3]/td[16]/center/a/img")	
	private WebElement priyasst;
	
	@FindBy(xpath="//img[@alt='Test']")	
	private WebElement testcorrect;

	
	
	
	//SelectCourse
	public void reporting() {
		this.reporting.click(); 
	}		
	public void priyasst() {
		this.priyasst.click(); 
	}
	public void testcorrect() {
		this.testcorrect.click(); 
	}	
	
}	