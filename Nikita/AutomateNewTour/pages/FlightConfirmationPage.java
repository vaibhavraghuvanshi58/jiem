package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class FlightConfirmationPage {
	public static By btn_logout=By.xpath("(//a[@href='mercurysignoff.php'])[2]");

	static WebDriver driver=null;
	public static void clickLogout()
	{
		driver=DriverFactory.driver;
		driver.findElement(btn_logout).click();

	}
}
