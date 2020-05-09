package frm1.modules;

import frm1.pages.BookFlightResultPage;

public class BookFlightModule {
	public static void validateBookFlight()
	{
		String actualBookFlightTitle=BookFlightResultPage.getFlightResultTitle();
		String expectedBookFlightTitle="Flight Confirmation: Mercury Tours";
		if(actualBookFlightTitle.equals(expectedBookFlightTitle))
		{
			System.out.println("PASS: Flight Booking successfully...");
		}
		else{
			System.out.println("FAIL: Flight Booking successfully...");
		}
	}
}
