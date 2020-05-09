package frm1.modules;

import frm1.pages.SearchSignUpResultPage;

public class SearchSignUpModule {
	public static void validateSignUp()
	{
		String actualeSignUpTitle=SearchSignUpResultPage.getSearchRegisterResultTitle();
		String expectedeSignUpTitle="Sign-on: Mercury Tours";
		if(actualeSignUpTitle.equals(expectedeSignUpTitle))
		{
			System.out.println("PASS: Sign-in page open Successfully...");
		}
		else{
			System.out.println("FAIL: Sign-in page open Successfully...");
		}
	}
}
