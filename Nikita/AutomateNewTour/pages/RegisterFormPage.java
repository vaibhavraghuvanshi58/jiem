package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import frm1.driverfactory.DriverFactory;

public class RegisterFormPage {
	public static By txt_firstname=By.xpath("//input[@name='firstName']");
	public static By txt_lastname=By.xpath("//input[@name='lastName']");
	public static By txt_phone=By.xpath("//input[@name='phone']");
	public static By txt_email=By.xpath("//input[@name='userName']");
	public static By txt_address1=By.xpath("//input[@name='address1']");
	public static By txt_address2=By.xpath("//input[@name='address2']");
	public static By txt_city=By.xpath("//input[@name='city']");
	public static By txt_state=By.xpath("//input[@name='state']");
	public static By txt_postalcode=By.xpath("//input[@name='postalCode']");
	public static By dropdown_country=By.xpath("//select[@name='country']");
	public static By txt_username=By.xpath("//input[@name='email']");
	public static By txt_password=By.xpath("//input[@name='password']");
	public static By txt_confirmpassword=By.xpath("//input[@name='confirmPassword']");
	public static By btn_submit=By.xpath("//input[@name='register']");


	static WebDriver driver=null;
	public static void enterContactInformation(String firstname, String lastname, String phone, String email)
	{
		driver=DriverFactory.driver;
		driver.findElement(txt_firstname).sendKeys(firstname);
		driver.findElement(txt_lastname).sendKeys(lastname);
		driver.findElement(txt_phone).sendKeys(phone);;
		driver.findElement(txt_email).sendKeys(email);
	}

	public static void enterMailingInformation(String address1, String address2, String city, String state, String postalcode, String country)
	{
		driver=DriverFactory.driver;
		driver.findElement(txt_address1).sendKeys(address1);
		driver.findElement(txt_address2).sendKeys(address2);
		driver.findElement(txt_city).sendKeys(city);
		driver.findElement(txt_state).sendKeys(state);
		driver.findElement(txt_postalcode).sendKeys(postalcode);
		Select countryname = new Select(driver.findElement(dropdown_country));
		countryname.selectByVisibleText(country);
	}

	public static void enterUserInformation(String username, String password, String confirmpassword)
	{
		driver=DriverFactory.driver;
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(txt_confirmpassword).sendKeys(confirmpassword);
	}

	public static void clickSubmitUserInformation()
	{
		driver=DriverFactory.driver;
		driver.findElement(btn_submit).click();
	}





}
