package frm1.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import frm1.driverfactory.DriverFactory;

public class BookFlightPage {
	public static By txt_passfirst=By.xpath("//input[@name='passFirst0']");
	public static By txt_passlast=By.xpath("//input[@name='passLast0']");
	public static By select_meal=By.xpath("//select[@name='pass.0.meal']");
	public static By txt_passfirst1=By.xpath("//input[@name='passFirst1']");
	public static By txt_passlast1=By.xpath("//input[@name='passLast1']");
	public static By select_meal1=By.xpath("//select[@name='pass.1.meal']");
	
	public static By select_creditcard=By.xpath("//select[@name='creditCard']");
	public static By txt_number=By.xpath("//input[@name='creditnumber']");
	public static By select_cc_exp_dt_mn=By.xpath("//select[@name='cc_exp_dt_mn']");
	public static By select_cc_exp_dt_yr=By.xpath("//select[@name='cc_exp_dt_yr']");
	public static By txt_cc_frst_name=By.xpath("//input[@name='cc_frst_name']");
	public static By txt_cc_mid_name=By.xpath("//input[@name='cc_mid_name']");
	public static By txt_cc_last_name=By.xpath("//input[@name='cc_last_name']");


	public static By chk_ticketless_travel=By.xpath("(//input[@name='ticketLess'])[1]");
	public static By txt_add1=By.xpath("//input[@name='billAddress1']");
	public static By txt_add2=By.xpath("//input[@name='billAddress2']");
	public static By txt_city1=By.xpath("//input[@name='billCity']");
	public static By txt_state1=By.xpath("//input[@name='billState']");
	public static By txt_zip1=By.xpath("//input[@name='billZip']");
	public static By select_country1=By.xpath("//select[@name='billCountry']");


	public static By chk_billing_add=By.xpath("(//input[@name='ticketLess'])[2]");
	public static By txt_add3=By.xpath("//input[@name='delAddress1']");
	public static By txt_add4=By.xpath("//input[@name='delAddress2']");
	public static By txt_city2=By.xpath("//input[@name='delCity']");
	public static By txt_state2=By.xpath("//input[@name='delState']");
	public static By txt_zip2=By.xpath("//input[@name='delZip']");
	public static By select_country2=By.xpath("//select[@name='delCountry']");

	public static By btn_buyflight=By.xpath("//input[@name='buyFlights']");
	static WebDriver driver=null;
	public static void fillPassengers(String firstname1, String lastname1, String meal, String firstname2, String lastname2, String meal11)
	{
		driver=DriverFactory.driver;
		driver.findElement(txt_passfirst).sendKeys(firstname1);
		driver.findElement(txt_passlast).sendKeys(lastname1);

		Select meal1 = new Select(driver.findElement(select_meal));
		meal1.selectByVisibleText(meal);
		
		driver.findElement(txt_passfirst1).sendKeys(firstname2);
		driver.findElement(txt_passlast1).sendKeys(lastname2);

		Select meal2 = new Select(driver.findElement(select_meal1));
		meal2.selectByVisibleText(meal11);
	}

	public static void fillCreditCard(String cardtype, String number, String cc_exp_dt_mn, String cc_exp_dt_yr, String ccfirst, String ccmid, String cclast)
	{
		driver=DriverFactory.driver;
		Select cardtype1 = new Select(driver.findElement(select_creditcard));
		cardtype1.selectByVisibleText(cardtype);

		driver.findElement(txt_number).sendKeys(number);

		Select cc_exp_dt_mn1 = new Select(driver.findElement(select_cc_exp_dt_mn));
		cc_exp_dt_mn1.selectByVisibleText(cc_exp_dt_mn);

		Select cc_exp_dt_yr1 = new Select(driver.findElement(select_cc_exp_dt_yr));
		cc_exp_dt_yr1.selectByVisibleText(cc_exp_dt_yr);

		driver.findElement(txt_cc_frst_name).sendKeys(ccfirst);
		driver.findElement(txt_cc_mid_name).sendKeys(ccmid);
		driver.findElement(txt_cc_last_name).sendKeys(cclast);
	}

	public static void fillBillingAddress(String address1, String address2, String city, String state, String zip, String country)
	{
		driver=DriverFactory.driver;
		driver.findElement(chk_ticketless_travel).click();
		driver.findElement(txt_add1).clear();
		driver.findElement(txt_add1).sendKeys(address1);
		driver.findElement(txt_add2).sendKeys(address2);
		driver.findElement(txt_city1).clear();
		driver.findElement(txt_city1).sendKeys(city);
		driver.findElement(txt_state1).clear();
		driver.findElement(txt_state1).sendKeys(state);
		driver.findElement(txt_zip1).clear();
		driver.findElement(txt_zip1).sendKeys(zip);

		Select country1 = new Select(driver.findElement(select_country1));
		country1.selectByVisibleText(country);	
      
	}

	public static void fillDeliveryAddress(String address1, String address2, String city, String state, String zip, String country)
	{
		driver=DriverFactory.driver;
		driver.findElement(chk_billing_add).click();
		driver.findElement(txt_add3).clear();
		driver.findElement(txt_add3).sendKeys(address1);
		driver.findElement(txt_add2).sendKeys(address2);
		driver.findElement(txt_city2).clear();
		driver.findElement(txt_city2).sendKeys(city);
		driver.findElement(txt_state2).clear();
		driver.findElement(txt_state2).sendKeys(state);
		driver.findElement(txt_zip2).clear();
		driver.findElement(txt_zip2).sendKeys(zip);

		Select country1 = new Select(driver.findElement(select_country2));
		country1.selectByVisibleText(country);	
		
	}

	public static void clickSecurePurchase()
	{
		driver=DriverFactory.driver;
		System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
		driver.findElement(btn_buyflight).click();

	}
	public static void flightBookingPage()
	{
		//driver=DriverFactory.driver;
		TakesScreenshot screenshoot=((TakesScreenshot)DriverFactory.driver);
		File srcFile=screenshoot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C://Pictures//screenshot.png");
		try {
			Files.copy(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
