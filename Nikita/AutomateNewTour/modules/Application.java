package frm1.modules;

import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;
import frm1.constant.ApplicationConstant;

public class Application {

	static WebDriver driver =null;
	
	public static void OpenApp()
	{
		DriverFactory.geWebDriver(ApplicationConstant.browsername);
		driver = DriverFactory.driver;
	
		
		driver.get(ApplicationConstant.ApplicationURL);
		System.out.println("Browser has been open with title: "+driver.getTitle());
	
	}
	
	public static void CloseApp()
	{
		driver.quit();
		DriverFactory.driver = null;
	}
	
}
