package frm1.testcases;

import frm1.modules.Application;
import frm1.modules.FlightFinderModule;
import frm1.modules.RegisterFormModule;
import frm1.modules.SearchRegisterModule;
import frm1.modules.SearchSignUpModule;
import frm1.modules.SignOnFormModule;
import frm1.pages.FlightFinderPage;
import frm1.pages.RegisterFormPage;
import frm1.pages.SearchRegisterFormPage;
import frm1.pages.SearchSignUpPage;
import frm1.pages.SignOnFormPage;

public class FlightFinder {
	public void tstcs_flight_finder_for_newtour_site(){
		Application.OpenApp();
		SearchRegisterFormPage.clickRegisterSearch();
		SearchRegisterModule.validateSearchRegister();
		RegisterFormPage.enterContactInformation("a", "a", "1", "a");
		RegisterFormPage.enterMailingInformation("a", "a", "a", "a", "a", "INDIA");
		RegisterFormPage.enterUserInformation("a", "a", "a");
		RegisterFormPage.clickSubmitUserInformation();
		RegisterFormModule.validateRegisterForm();
		SearchSignUpPage.clickOnSignUp();
		SearchSignUpModule.validateSignUp();
		SignOnFormPage.enterSignOnDetails("a", "a");
		SignOnFormPage.clickOnSignOnDetails();
		SignOnFormModule.validateSignOnForm();
		FlightFinderPage.selectFlightDetails("2", "London", "December", "22", "New York", "December", "22");
		FlightFinderPage.selectPreferences("Blue Skies Airlines");
		FlightFinderPage.clickFlightFinder();
		FlightFinderModule.validateFlightFinder();
		Application.CloseApp();
	}
}
