package frm1.modules;

import frm1.pages.FlightConfirmationResultPage;

public class FlightConfirmationModule {
	public static void validateFlightConfirmation()
	{

		String actualFlightConfirmationPageTitle=FlightConfirmationResultPage.getFlightConfirmationResultTitle();
		String expectedFlightConfirmationPageTitle= "Sign-on: Mercury Tours";

		if(actualFlightConfirmationPageTitle.equals(expectedFlightConfirmationPageTitle))
		{
			System.out.println("PASS: Flight Booking successfully...");
		}
		else{
			System.out.println("FAIL: Flight Booking successfully...");
		}
	}
}