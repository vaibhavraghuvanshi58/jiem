package frm1.testcases;

import frm1.modules.Application;
import frm1.modules.BookFlightModule;
import frm1.modules.FlightConfirmationModule;
import frm1.modules.FlightFinderModule;
import frm1.modules.RegisterFormModule;
import frm1.modules.SearchRegisterModule;
import frm1.modules.SearchSignUpModule;
import frm1.modules.SelectFlightModule;
import frm1.modules.SignOnFormModule;
import frm1.pages.BookFlightPage;
import frm1.pages.FlightConfirmationPage;
import frm1.pages.FlightFinderPage;
import frm1.pages.RegisterFormPage;
import frm1.pages.SearchRegisterFormPage;
import frm1.pages.SearchSignUpPage;
import frm1.pages.SelectFlightPage;
import frm1.pages.SignOnFormPage;

public class FlightConfirmation {
	public void tstcs_booking_confirmation_for_newtour_site(){
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
		SelectFlightPage.selectFlightDetails();
		SelectFlightPage.clickReserveFlights();
		SelectFlightModule.validateSelectFlight();
		BookFlightPage.fillPassengers("a", "a", "Hindu","a", "a", "Hindu");		
		BookFlightPage.fillCreditCard("American Express", "123456", "01", "2000", "a", "a", "a");
		BookFlightPage.fillBillingAddress("Sadhana Society", "Hadapsar", "Pune", "maharashtra", "411028", "INDIA");
		BookFlightPage.fillDeliveryAddress("Sadhana Society", "Hadapsar", "Pune", "maharashtra", "411028", "INDIA");
		BookFlightPage.clickSecurePurchase();
		BookFlightPage.flightBookingPage();
		BookFlightModule.validateBookFlight();
		FlightConfirmationPage.clickLogout();
		FlightConfirmationModule.validateFlightConfirmation();
		Application.CloseApp();
	}
}
