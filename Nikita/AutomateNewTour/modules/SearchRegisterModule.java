package frm1.modules;


import frm1.pages.SearchRegisterResultPage;


public class SearchRegisterModule {
	
	public static void validateSearchRegister()
	{
		String actualSearchRegisterTitle=SearchRegisterResultPage.getSearchRegisterResultTitle();
		String expectedSearchRegisterTitle="Register: Mercury Tours";
		if(actualSearchRegisterTitle.equals(expectedSearchRegisterTitle))
		{
			System.out.println("PASS: SignUp page open Successfully...");
		}
		else{
			System.out.println("FAIL: SignUp page open Successfully...");
		}
	}
	
}
