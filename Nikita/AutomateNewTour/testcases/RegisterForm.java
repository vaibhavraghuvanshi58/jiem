package frm1.testcases;


import frm1.modules.Application;
import frm1.modules.RegisterFormModule;
import frm1.pages.RegisterFormPage;
import frm1.pages.SearchRegisterFormPage;

public class RegisterForm {
	public void tstcs_register_form_for_newtour_site(){
		Application.OpenApp();
		SearchRegisterFormPage.clickRegisterSearch();
		RegisterFormPage.enterContactInformation("a", "a", "1", "a");
		RegisterFormPage.enterMailingInformation("a", "a", "a", "a", "a", "INDIA");
		RegisterFormPage.enterUserInformation("a", "a", "a");
		RegisterFormPage.clickSubmitUserInformation();
		RegisterFormModule.validateRegisterForm();
		Application.CloseApp();
		
		
	}
}
