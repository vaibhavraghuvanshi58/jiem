package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class FlightFinderResultPage {
	static WebDriver driver=null;
	public static String getFlightFinderResultTitle()
	{
		driver=DriverFactory.driver;
		return driver.getTitle();
	}
}
