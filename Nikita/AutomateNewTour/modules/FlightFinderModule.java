package frm1.modules;

import frm1.pages.FlightFinderResultPage;

public class FlightFinderModule {
	public static void validateFlightFinder()
	{
		String actualFlightFinderTitle=FlightFinderResultPage.getFlightFinderResultTitle();
		String expectedFlightFinderTitle="Select a Flight: Mercury Tours";
		if(actualFlightFinderTitle.equals(expectedFlightFinderTitle))
		{
			System.out.println("PASS: Flight finder fill successfully...");
		}
		else{
			System.out.println("FAIL: Flight finder fill successfully...");
		}
	}
}
