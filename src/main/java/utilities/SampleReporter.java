package utilities;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReporter {
	
	// we need to specify report path
	// Test CAse Name, Test CAse Desc
	// Test Steps Status - Test CAse Passed
	// AUthor, Categeory
	
	@Test
	public void sampleReport(){
		
		//1. StartReport
		ExtentReports extentReports = new ExtentReports("./reports/SampleReport.html");
		
		// startTest
		ExtentTest test = extentReports.startTest("Sample Test CAse", "IRCTC Reg");
		test.assignAuthor("Uma");
		test.assignCategory("Dry Run");
		
		//3. LogStatus
		test.log(LogStatus.PASS, "Test Step Passed");
		test.log(LogStatus.FAIL, "Test Step Failed");
		
		test.log(LogStatus.ERROR, "Test Step Error");
		test.log(LogStatus.UNKNOWN, "Test Step Unknown");
		
		test.log(LogStatus.SKIP, "Test Step Skipped");
		test.log(LogStatus.FATAL, "Test Step Fatal");
		
		test.log(LogStatus.INFO, "Test Step Info");
		test.log(LogStatus.WARNING, "Test Step Warning");
		
		//4. EndTest
		extentReports.endTest(test);
		//5 EndReport
		extentReports.flush();
		
		
		
	}

}
