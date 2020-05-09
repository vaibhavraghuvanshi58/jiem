package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SearchRegisterFormPage {

	public static By lnk_Register=By.xpath("//td[2][@class='mouseOut']//a");

	// //a[contains(text(),'REGISTER')]

	static WebDriver driver=null;

	public static void clickRegisterSearch()
	{
		driver=DriverFactory.driver;
		driver.findElement(lnk_Register).click();
	}
}
