package frm1.constant;

public class ApplicationConstant {

	public static final String basePath=System.getProperty("user.dir")+"\\";
	public static final String PROJECT_NAME="New Tours";

	public static final String CHROME_PATH=basePath+"driver\\chrome\\chromedriver.exe";
	public static final String IE_DRIVER_PATH=basePath+"driver\\IE\\IEDriverServer.exe";
	public static final String MOZILLA_DRIVER_PATH=basePath+"driver\\firefox\\geckodriver.exe";

	public static final String browsername="chrome";

	public static final String ApplicationURL="http://newtours.demoaut.com/";
//public static final String ApplicationURL="http://newtours.demoaut.com/mercuryreservation.php";
	public static final int impliciteWait=20;

	public static void main(String[] args) {
		System.out.println(basePath);

	}

}
