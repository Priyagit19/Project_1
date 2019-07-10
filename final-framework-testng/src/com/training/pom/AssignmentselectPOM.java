package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentselectPOM {
	
	private WebDriver driver; 
	
	//Should not be void
	public AssignmentselectPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="form-email_submit")
	private WebElement formemailsubmit;
	
	@FindBy(id="work_comment_button")
	private WebElement work_comment_button;
	
	//Send score by email
	@FindBy(id="send_notification")
	private WebElement send_notification;
	
	@FindBy(xpath="//img[@alt='Test_Assignment']")
	private WebElement selectcourse;
	
	//Assignments	
	@FindBy(xpath="//img[@alt='Assignments']")
	private WebElement Assignment;
	
	@FindBy(linkText="Assignment1")
	private WebElement Assignment1;
		
	//Assignment mark and correct
	@FindBy(xpath="//img[@title='Correct and rate']")
	private WebElement Assignmentscore;
	
	@FindBy(xpath="//input[@id='qualification']")
	private WebElement	scorevalue;
	
	//@FindBy(xpath="//button[@name='button']")
	//private WebElement	submitbutton;
		
	@FindBy(xpath="//button[@id='work_comment_button']")
	private WebElement	submitbutton;
	
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement	addcomments;
	
	//tests icon
	@FindBy(xpath="//img[@alt='Tests']")
	private WebElement tests;
	
	//Results and feedback icon click

	@FindBy(xpath="//img[@alt='Results and feedback']")
	private WebElement results;
	

	@FindBy(xpath="//img[@alt='Grade activity']")
	private WebElement gradeactivity;
	
	
	//SelectCourse
	public void selectcourse() {
		this.selectcourse.click(); 
	}
	
	//Assignment
	public void Assignment() {
		this.Assignment.click(); 
	}
	
	// work_comment_button
	
	public void work_comment_button() {
		this.work_comment_button.click(); 
	}
	
	//Assignment
		public void Assignment1() {
			this.Assignment1.click(); 
		}
	
	public void Assignmentscore() {
		this.Assignmentscore.click(); 
	}	
	
	public void submitbutton() {
		this.submitbutton.click(); 
	}	
	
	
	public void scorevalue(String scorevalue) {
		this.scorevalue.clear();
		this.scorevalue.sendKeys(scorevalue);
	}
	
	//Send comments
	public void addcomments(String addcomments) {
		this.addcomments.clear();
		this.addcomments.sendKeys(addcomments);
	}
	//tests icon
	
	public void tests() {
		this.tests.click(); 
	}	
	public void results() {
		this.results.click(); 
	}	
//Grade and score
	public void gradeactivity() {
		this.gradeactivity.click(); 
	}	
	public void send_notification() {
		this.send_notification.click(); 
	}
		
	public void formemailsubmit() {
		this.formemailsubmit.click(); 
	}
	
	
}