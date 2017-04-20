package MavenChaitra.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MavenChaitra.MavenChaitra.Constants;
import MavenChaitra.MavenChaitra.Driver;

import MavenChaitra.PageObjectRepo.LoginPageRepo;

public class Login{

		LoginPageRepo log;
		 
		@BeforeMethod
		public void setUp(){
			
			Driver.driver = new FirefoxDriver();
			Driver.driver.get(Constants.URL);
			Driver.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Driver.driver.manage().window().maximize();
			
			
		}
		@Test
		public void logintoapp() throws InterruptedException{
			
			log=PageFactory.initElements(Driver.driver, LoginPageRepo.class);
			log.login();
			log.CreateNewCamp();
			
			
		}
		
		
		
        
		
		
}
