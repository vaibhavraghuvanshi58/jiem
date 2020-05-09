package frm1.testcases;

import frm1.modules.Application;
import frm1.modules.RegisterFormModule;
import frm1.modules.SearchRegisterModule;
import frm1.modules.SearchSignUpModule;
import frm1.modules.SignOnFormModule;
import frm1.pages.RegisterFormPage;
import frm1.pages.SearchRegisterFormPage;
import frm1.pages.SearchSignUpPage;
import frm1.pages.SignOnFormPage;

public class SignOn {
	public void tstcs_SignOn_for_newtour_site(){
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
		Application.CloseApp();
	}
}
