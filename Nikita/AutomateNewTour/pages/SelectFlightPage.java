package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SelectFlightPage {
	public static By select_depart=By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']");
	public static By select_return=By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']");
	public static By btn_reserveflights=By.xpath("//input[@name='reserveFlights']");


	static WebDriver driver=null;
	public static void selectFlightDetails()
	{
		driver=DriverFactory.driver;
		driver.findElement(select_depart).click();
		driver.findElement(select_return).click();
	}

	public static void clickReserveFlights()
	{
		driver=DriverFactory.driver;
		driver.findElement(btn_reserveflights).click();

	}
}
