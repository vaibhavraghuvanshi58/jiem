package frm1.modules;

import frm1.pages.SelectFlightResultPage;

public class SelectFlightModule {
	public static void validateSelectFlight()
	{
		String actualSelectFlightTitle=SelectFlightResultPage.getSelectFlightResultTitle();
		String expectedSelectFlightTitle="Book a Flight: Mercury Tours";
		if(actualSelectFlightTitle.equals(expectedSelectFlightTitle))
		{
			System.out.println("PASS: Select Flight successfully...");
		}
		else{
			System.out.println("FAIL: Select finder successfully...");
		}
	}
}
