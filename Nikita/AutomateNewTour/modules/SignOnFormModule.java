package frm1.modules;

import frm1.pages.SignOnFormResultPage;

public class SignOnFormModule {
	public static void validateSignOnForm()
	{
		String actualSignOnPageTitle=SignOnFormResultPage.getSignOnFormResultTitle();
		String expectedSignOnPageTitle="Find a Flight: Mercury Tours:";
		if(actualSignOnPageTitle.equals(expectedSignOnPageTitle))
		{
			System.out.println("PASS: SignOn successfully...");
		}
		else{
			System.out.println("FAIL: SignOn successfully...");
		}
	}
}
