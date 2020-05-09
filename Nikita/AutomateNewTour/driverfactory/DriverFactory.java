package frm1.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	
	public DriverFactory() {
		// TODO Auto-generated constructor stub
	}

	public static WebDriver driver = null;
	public static WebDriver geWebDriver(String browserName)	{
		if(driver == null)	{
			switch(browserName) {
			case "Chrome":
			case "chrome":
			case "Google chrome":
				getChromeDriver();
				break;
			case "firefox":
			case "mozilla":
			case "Mozilla":
				getMozillaDriver();
			case "ie":
			case "Internet Explore":
			case "IE":
				getIEDriver();
			default: break;
			}
		}
		return driver;
	}


	private static void getChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver",frm1.constant.ApplicationConstant.CHROME_PATH);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(frm1.constant.ApplicationConstant.impliciteWait, TimeUnit.SECONDS);
	}

	private static void getMozillaDriver(){
		System.setProperty("webdriver.chrome.driver", frm1.constant.ApplicationConstant.MOZILLA_DRIVER_PATH);
		driver=new FirefoxDriver();
	}

	private static void getIEDriver(){
		System.setProperty("webdriver.chrome.driver", frm1.constant.ApplicationConstant.IE_DRIVER_PATH);
		driver=new InternetExplorerDriver();
	}
}
