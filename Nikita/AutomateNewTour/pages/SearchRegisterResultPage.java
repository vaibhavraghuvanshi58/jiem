package frm1.pages;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SearchRegisterResultPage {

	static WebDriver driver = null;
	
	public static String getSearchRegisterResultTitle()	{
		driver = DriverFactory.driver;
		return driver.getTitle();
	}
}
