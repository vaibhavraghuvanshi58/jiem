package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class BookFlightResultPage {
	static WebDriver driver=null;
	public static String getFlightResultTitle()
	{
		driver=DriverFactory.driver;
		return driver.getTitle();
	}
}
