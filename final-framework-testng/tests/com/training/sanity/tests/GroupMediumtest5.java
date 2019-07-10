package com.training.sanity.tests;


	
	import java.io.FileInputStream;
	import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
	import com.training.pom.ReportingPOM;
	import com.training.pom.AddClassesPOM;
	import com.training.pom.AssignmentselectPOM;
	import com.training.pom.GroupMediumtest5POM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class GroupMediumtest5 {
		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private AssignmentselectPOM AssignmentselectPOM;
		private ReportingPOM ReportingPOM;
		private GroupMediumtest5POM GroupMediumtest5POM;
		private static Properties properties;
		private ScreenShot screenShot;

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			AssignmentselectPOM = new AssignmentselectPOM(driver);	
			GroupMediumtest5POM = new GroupMediumtest5POM(driver);			
			ReportingPOM = new ReportingPOM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver);			
			//open the browser 
			driver.get(baseUrl);			
		}
		
		@AfterClass
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		}
		
		@Test
		public void validLoginTest() throws InterruptedException {			
					loginPOM.sendUserName("manzoor");
					loginPOM.sendPassword("manzoor");
					loginPOM.clickLoginBtn(); 				
					AssignmentselectPOM.selectcourse();
					Thread.sleep(2000);
					GroupMediumtest5POM.groups();				
					GroupMediumtest5POM.newgroup();
					GroupMediumtest5POM.creategroupssubmit();
					screenShot.captureScreenShot("loginmanzoor");						
					GroupMediumtest5POM.groupname("Rockers");	
					GroupMediumtest5POM.submitgroup();	
					Thread.sleep(2000);
					GroupMediumtest5POM.groupmembers();
					GroupMediumtest5POM.group_members_rightSelected();		
					//Select all the members
					Select selectall = new Select (driver.findElement(By.id("group_members")));
					List<WebElement> options = selectall.getOptions();
					int size = options.size();
					System.out.println(size);
					for(int i=0;i<size;i++)
					{ 
						selectall.selectByIndex(i);						
						
					}
					GroupMediumtest5POM.group_members_rightSelected();				
					GroupMediumtest5POM.group_edit_submit();
					//edit the group
					GroupMediumtest5POM.Editgroup();	
					GroupMediumtest5POM.self_registration_allowed();
					GroupMediumtest5POM.self_unregistration_allowed();
					GroupMediumtest5POM.group_edit_submit();
					//GroupMediumtest5POM.groupModified();
					screenShot.captureScreenShot("Selectionmembers");	
		}
	}