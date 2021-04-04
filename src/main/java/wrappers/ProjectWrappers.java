package wrappers;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utilities.DataProviderClass;

public class ProjectWrappers extends GenericWrappers{
	
	public String dataSheetName;
	
	@BeforeSuite
	public void beforeSuite(){
		startReport();
	}
	
	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	
	@BeforeMethod
	public void beforeMethod(){
		startTest(testCaseName, testCaseDescription);
		test.assignAuthor(testCaseAuthor);
		test.assignCategory(testCaseCategeory);
		invokeApp("chrome", "https://irctc.co.in");
	}
	
	@AfterMethod
	public void afterMethod(){
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass(){
		endTest();
	}
	
	@AfterTest
	public void afterTest(){
		properties=null;
	}
	
	@AfterSuite
	public void afterSuite(){
		endReport();
	}

	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException{
		return DataProviderClass.getDataFromExcelSheetTC001(dataSheetName);
	
	}
	
}
