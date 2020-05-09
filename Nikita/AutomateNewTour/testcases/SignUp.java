package frm1.testcases;

import frm1.modules.Application;
import frm1.modules.RegisterFormModule;
import frm1.modules.SearchRegisterModule;
import frm1.modules.SearchSignUpModule;
import frm1.pages.RegisterFormPage;
import frm1.pages.SearchRegisterFormPage;
import frm1.pages.SearchSignUpPage;

public class SignUp {
	public void tstcs_open_Signup_form_newtour_site(){
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
		Application.CloseApp();
	}
}
