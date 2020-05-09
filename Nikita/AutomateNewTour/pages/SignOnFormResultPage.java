package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SignOnFormResultPage {
	static WebDriver driver = null;
	public static String getSignOnFormResultTitle()	{
		driver = DriverFactory.driver;
		return driver.getTitle();
	}

}
