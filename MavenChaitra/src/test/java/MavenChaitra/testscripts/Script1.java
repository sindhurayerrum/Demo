package MavenChaitra.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MavenChaitra.MavenChaitra.Driver;
import MavenChaitra.MavenChaitra.WebDriverCommonlib;
import MavenChaitra.PageObjectRepo.PageRepo;

public class Script1 extends WebDriverCommonlib{
	
	WebDriver driver;
	PageRepo homepageloading;
	
	
	@Test
	public void openbrowser() throws IOException
	{
		driver=Driver.getDriver();
		System.out.println("Hi the driver URL is "  +driver);
		homepageloading=PageFactory.initElements(driver, PageRepo.class);
		homepageloading.hitUrl();
		System.out.println("MY first Commit");
		
	}	
}
