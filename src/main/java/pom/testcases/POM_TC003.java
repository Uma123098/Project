package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class POM_TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
		
		testCaseName="TC003";
		testCaseDescription="FTR SignUp";
		testCaseAuthor="Uma";
		testCaseCategeory="Functional";
	}
	
	@Test
	public void FTRSignup(){
		
		new HomePage(driver, test)
		.clickOnCovid19Alert()
		.mouseHoverHolidays()
		.mouseHoverStays()
		.mouseHoverTrains()
		.clickOnFTRCoachBooking()
		
		.newUserSignup();
		
		
	}
}
