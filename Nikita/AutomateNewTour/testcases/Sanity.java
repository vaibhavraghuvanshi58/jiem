package frm1.testcases;

import frm1.modules.Application;
import frm1.modules.SearchRegisterModule;
import frm1.pages.SearchRegisterFormPage;

public class Sanity {

	public void tstcs_open_newtour_site(){
		Application.OpenApp();
		Application.CloseApp();
	}
	
	public void tstcs_search_register_in_newtour_site(){
		Application.OpenApp();
		SearchRegisterFormPage.clickRegisterSearch();
		SearchRegisterModule.validateSearchRegister();;
		Application.CloseApp();
	}
}
