package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class FlightConfirmationResultPage {
	static WebDriver driver=null;
	public static String getFlightConfirmationResultTitle()
	{
		driver=DriverFactory.driver;
		return driver.getTitle();
	}
}
