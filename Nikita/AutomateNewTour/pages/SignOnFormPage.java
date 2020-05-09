package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SignOnFormPage {

	public static By txt_username1=By.xpath("//input[@name='userName']");
	public static By txt_password1=By.xpath("//input[@name='password']");
	public static By btn_login=By.xpath("//input[@name='login']");


	static WebDriver driver=null;
	public static void enterSignOnDetails(String username1, String password1)
	{
		driver=DriverFactory.driver;
		driver.findElement(txt_username1).sendKeys(username1);
		driver.findElement(txt_password1).sendKeys(password1);
	}

	public static void clickOnSignOnDetails()
	{
		driver=DriverFactory.driver;
		driver.findElement(btn_login).click();;
	}
}
