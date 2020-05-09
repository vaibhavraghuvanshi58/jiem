package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class RegisterFormResultPage {
	// Your user name is a.
	
			
	static WebDriver driver=null;
	public static String getRegisterFormResultTitle()
	{
		driver=DriverFactory.driver;
		return driver.getTitle();
	}
}
