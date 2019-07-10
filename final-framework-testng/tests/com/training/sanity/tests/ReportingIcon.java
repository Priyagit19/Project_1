package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ReportingPOM;
import com.training.pom.AddClassesPOM;
import com.training.pom.AssignmentselectPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ReportingIcon {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AssignmentselectPOM AssignmentselectPOM;
	private ReportingPOM ReportingPOM;
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
		ReportingPOM = new ReportingPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);			
		//Open the browser 
		driver.get(baseUrl);			
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test
	public void validLoginTest() throws InterruptedException {			
				loginPOM.sendUserName("manzoor");
				loginPOM.sendPassword("manzoor");
				loginPOM.clickLoginBtn(); 
				screenShot.captureScreenShot("loginmanzoor");
				AssignmentselectPOM.selectcourse();
				Thread.sleep(2000);
				ReportingPOM.reporting();	
				ReportingPOM.priyasst();
				ReportingPOM.testcorrect();
				screenShot.captureScreenShot("correct");
				AssignmentselectPOM.send_notification();
				AssignmentselectPOM.formemailsubmit();
				screenShot.captureScreenShot("EmailSent");	
				
			}
}