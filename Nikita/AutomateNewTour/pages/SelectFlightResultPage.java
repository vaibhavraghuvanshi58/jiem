package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SelectFlightResultPage {
	static WebDriver driver=null;
	public static String getSelectFlightResultTitle()
	{
		driver=DriverFactory.driver;
		return driver.getTitle();
	}
}
