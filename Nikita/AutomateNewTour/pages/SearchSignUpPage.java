package frm1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm1.driverfactory.DriverFactory;

public class SearchSignUpPage {
	
	public static By lnk_signup=By.xpath("//a[contains(text(),' sign-in ')]");
	static WebDriver driver=null;
	public static void clickOnSignUp()
	{
		driver=DriverFactory.driver;
		driver.findElement(lnk_signup).click();
	}
}
