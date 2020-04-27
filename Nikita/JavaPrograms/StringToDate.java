/*Create Date as String*/
package Session11Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String sDate1 = "25/04/2020";  
		String sDate2 = "25-Apr-2020";  
		String sDate3 = "04 25, 2020";  
		String sDate4 = "Sat, Apr 25 2020";  
		String sDate5 = "Sat, Apr 25 2020 20:00:00";  
		String sDate6 = "25-Apr-2020 20:00:00"; 
		Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate1);
		Date date2=new SimpleDateFormat("dd-MMM-yyyy").parse(sDate2);
		Date date3=new SimpleDateFormat("MM dd, yyyy").parse(sDate3);
		Date date4=new SimpleDateFormat("E, MMM dd yyyy").parse(sDate4);
		Date date5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss").parse(sDate5);
		Date date6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").parse(sDate6);
		
		System.out.println(sDate1+"\t\t\t"+date1);
		System.out.println(sDate2+"\t\t\t"+date2);
		System.out.println(sDate3+"\t\t\t"+date3);
		System.out.println(sDate4+"\t\t"+date4);
		System.out.println(sDate5+"\t"+date5);
		System.out.println(sDate6+"\t\t"+date6);
		
	}

}
