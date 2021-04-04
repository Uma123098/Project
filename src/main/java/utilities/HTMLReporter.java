package utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class HTMLReporter {

	public static ExtentReports extentReports;
	public ExtentTest test;
	public String testCaseName, testCaseDescription, testCaseAuthor, testCaseCategeory;
	
	
	public void startReport(){
		 extentReports= new ExtentReports("./reports/report.html", false);
	}
	
	public void startTest(String testName, String description){
		test = extentReports.startTest(testName, description);
	}
	
	public void logStatus(String status, String desc){
		
		long snapNumber = takeSnap();
		String imagePath = System.getProperty("user.dir")+"/screenshots/snap"+snapNumber+".jpg";
		if(status.equalsIgnoreCase("pass")){
			test.log(LogStatus.PASS, desc+test.addScreenCapture(imagePath));
		}else if(status.equalsIgnoreCase("fail")){
			test.log(LogStatus.FAIL, desc+test.addScreenCapture(imagePath));
		}
		
	}
	
	public void endTest(){
		extentReports.endTest(test);
	}
	
	public void endReport(){
		extentReports.flush();
	}
	
	public abstract long takeSnap();
	
}
