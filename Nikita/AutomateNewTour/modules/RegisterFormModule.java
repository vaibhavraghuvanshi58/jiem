package frm1.modules;

import frm1.pages.RegisterFormResultPage;

public class RegisterFormModule {
	public static void validateRegisterForm()
	{
		String actualRegisterFormTitle=RegisterFormResultPage.getRegisterFormResultTitle();
		String expectedRegisterFormTitle="Register: Mercury Tours";
		if(actualRegisterFormTitle.equals(expectedRegisterFormTitle))
		{
			System.out.println("PASS: Register form fill successfully...");
		}
		else{
			System.out.println("FAIL: Register form fill successfully...");
		}
	}
}
