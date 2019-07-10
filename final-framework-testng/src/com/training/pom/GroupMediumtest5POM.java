package com.training.pom;

 
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class GroupMediumtest5POM {
		
		private WebDriver driver; 
		
		//Should not be void
		public GroupMediumtest5POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(id="create_groups_submit")
		private WebElement creategroupssubmit;
		
		@FindBy(xpath="//img[@alt='Groups']")	
		private WebElement groups;
		
		@FindBy(xpath="//img[@alt='Create new group(s)']")	
		private WebElement newgroup;
		
		
		@FindBy(xpath="//table/tbody/tr[2]/td[2]/input[@class='form-control']")	
		private WebElement groupname;
		

		@FindBy(id="create_groups_step2_submit")
		private WebElement submitgroup;
						
		@FindBy(xpath="//img[@alt='Group members']")	
		private WebElement groupmembers;
		
	/*	@FindBy(id="group_members")	
		private WebElement group_members;
		//Select select = new Select(driver.findElement(By.id("group_members")));*/
		
		
		@FindBy(id="group_members_rightSelected")	
		private WebElement group_members_rightSelected;
		
		
		@FindBy(id="Edit this group")	
		private WebElement Editgroup;
		
		@FindBy(id="group_edit_submit")	
		private WebElement group_edit_submit;
		
		
		@FindBy(id="self_registration_allowed")	
		private WebElement self_registration_allowed;
		
		
		@FindBy(id="self_unregistration_allowed")	
		private WebElement self_unregistration_allowed;
		
	    //@FindBy(xpath="//div[@class='alert alert-success']")	
		//private WebElement groupModified;		
		
		//Functions 
		public void group_members_rightSelected() {
			this.group_members_rightSelected.click(); 
		}	
		
		public void groupmembers() {
			this.groupmembers.click(); 
		}	
		
		//Selectgroup
		public void groups() {
			this.groups.click(); 
		}	
		
		//Newgroup
		public void newgroup() {
			this.newgroup.click(); 
		}	
		
		public void creategroupssubmit() {
			this.creategroupssubmit.click(); 
		}	
		
		public void submitgroup() {
			this.submitgroup.click(); 
		}	
		
		
			
		//group comments
		public void groupname(String groupname) {
			this.groupname.clear();
			this.groupname.sendKeys(groupname);
		}
		public void group_edit_submit() {
			this.group_edit_submit.click(); 
		}		
		
		public void Editgroup() {
			this.Editgroup.click(); 
		}		
			
		
		
		public void self_registration_allowed() {
			this.self_registration_allowed.click(); 
		}		
		
		
		public void self_unregistration_allowed() {
			this.self_unregistration_allowed.click(); 
		}		
		
	
	}	

