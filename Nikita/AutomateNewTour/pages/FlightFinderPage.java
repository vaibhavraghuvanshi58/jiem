package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import frm1.driverfactory.DriverFactory;

public class FlightFinderPage {
	public static By radiobtn_trip=By.xpath("//input[@value='roundtrip']");
	public static By select_passcount=By.xpath("//select[@name='passCount']");
	public static By select_fromport=By.xpath("//select[@name='fromPort']");
	public static By select_frommonth=By.xpath("//select[@name='fromMonth']");
	public static By select_fromday=By.xpath("//select[@name='fromDay']");
	public static By select_toport=By.xpath("//select[@name='toPort']");
	public static By select_tomonth=By.xpath("//select[@name='toMonth']");
	public static By select_today=By.xpath("//select[@name='toDay']");
	public static By radiobtn_first=By.xpath("//input[@value='First']");
	public static By select_airline=By.xpath("//select[@name='airline']");
	public static By btn_findflight=By.xpath("//input[@name='findFlights']");

	static WebDriver driver=null;
	public static void selectFlightDetails(String passcount, String fromport, String frommonth, String fromday, String toport, String tomonth, String today)
	{
		driver=DriverFactory.driver;
		driver.findElement(radiobtn_trip).click();
		Select passcount1 = new Select(driver.findElement(select_passcount));
		passcount1.selectByVisibleText(passcount);
		

		Select fromport1 = new Select(driver.findElement(select_fromport));
		fromport1.selectByVisibleText(fromport);
		
		Select frommonth1 = new Select(driver.findElement(select_frommonth));
		frommonth1.selectByVisibleText(frommonth);
	
		Select fromday1 = new Select(driver.findElement(select_fromday));
		fromday1.selectByVisibleText(fromday);
	
		Select toport1 = new Select(driver.findElement(select_toport));
		toport1.selectByVisibleText(toport);
	
		Select tomonth1 = new Select(driver.findElement(select_tomonth));
		tomonth1.selectByVisibleText(tomonth);
	

		Select today1 = new Select(driver.findElement(select_today));
		today1.selectByVisibleText(today);
	}

	public static void selectPreferences(String airline)
	{
		driver=DriverFactory.driver;
		driver.findElement(radiobtn_first).click();
		

		Select airline1 = new Select(driver.findElement(select_airline));
		airline1.selectByVisibleText(airline);
	}

	public static void clickFlightFinder()
	{
		driver=DriverFactory.driver;
		driver.findElement(btn_findflight).click();

	}

}
