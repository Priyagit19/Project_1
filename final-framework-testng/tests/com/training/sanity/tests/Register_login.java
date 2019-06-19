	package com.training.sanity.tests;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
import com.training.pom.SigupPOM;
import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class Register_login {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private SigupPOM SigupPOM;
		private static Properties properties;
		private ScreenShot screenShot;

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			//Need to create a class
			SigupPOM = new SigupPOM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}

		/*@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}*/
		
		@AfterClass
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			driver.quit();
		}
		
		@Test
		public void validLoginTest() {
			
			loginPOM.Signuplink();		
			
			//href="http://elearning.upskills.in/main/auth/lostPassword.php"			
			//loginPOM.clickLoginBtn();	
		
			SigupPOM.firstname("Manzoor");
			SigupPOM.lastname("mehadi");
			SigupPOM.sendUserName("manzoor");
			SigupPOM.sendPassword("manzoor");
			SigupPOM.registeremail("manzoor@gmail.com");
			SigupPOM.confirmpwd("manzoor");
			SigupPOM.registration_phone("9876543210");   
					
			screenShot.captureScreenShot("First");		
			SigupPOM.clickteachcourses();
			screenShot.captureScreenShot("clickTeach");	
			SigupPOM.registration_submit();		
			screenShot.captureScreenShot("Registered");	
		}
	}		