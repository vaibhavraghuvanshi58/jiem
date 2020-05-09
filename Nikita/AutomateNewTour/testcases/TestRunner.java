package frm1.testcases;

import frm1.testcases.Sanity;

public class TestRunner {

	public static void main(String[] args) {
		Sanity sanity_object=new Sanity();
		System.out.println("===== Test Case 1 Running =====");
		sanity_object.tstcs_open_newtour_site();
		
		System.out.println("===== Test Case 2 Running =====");
		sanity_object.tstcs_search_register_in_newtour_site();

		System.out.println("===== Test Case 3 Running =====");
		RegisterForm regiser_object =new RegisterForm();
		regiser_object.tstcs_register_form_for_newtour_site();

		System.out.println("===== Test Case 4 Running =====");
		SignUp signup_object=new SignUp();
		signup_object.tstcs_open_Signup_form_newtour_site();

		System.out.println("===== Test Case 5 Running =====");
		SignOn signon_object=new SignOn();
		signon_object.tstcs_SignOn_for_newtour_site();
		
		System.out.println("===== Test Case 6 Running =====");
		FlightFinder flightfinder_object=new FlightFinder();
		flightfinder_object.tstcs_flight_finder_for_newtour_site();
		
		System.out.println("===== Test Case 7 Running =====");
		SelectFlight selectflight_object=new SelectFlight();
		selectflight_object.tstcs_select_flight_for_newtour_site();
		
		System.out.println("===== Test Case 8 Running =====");
		BookFlight booklight_object=new BookFlight();
		booklight_object.tstcs_book_flight_for_newtour_site();
	}
}
