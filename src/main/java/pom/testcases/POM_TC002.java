package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.ACPassangersPage;
import pom.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class POM_TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="IRCTC Accomodations";
		testCaseAuthor="Uma";
		testCaseCategeory="functional";
	}

	@Test
	public void IrctcAccommodations(){
	
		new HomePage(driver, test)
		.clickOnCovid19Alert()
		.mouseHoverHolidays()
		.mouseHoverStays()
		.mouseHoverLounge()
		
		.switchToAccommodationPage()
		
		.selectStation("JAIPUR")
		.selectLounge("IRCTC EXECUTIVE LOUNGE JAIPUR")
		.selectPersons("3")
		.selectCheckInDate("2021-03-30")
		.selectCheckInTime("07:00")
		.selectDuration("04:00 ")
		.clickOnBook()
		.clickOnGuestLogin()
		.enterEmailID("Uma@gmail.com")
		.enterMobileNumber("9765678999")
		.clickOnLogin()
		
		.enterPassenger1Name("Uma")
		.enterPassenger1Age("25")
		.enterPassenger1Gender("Female")
		.enterPassenger2Name("Rajesh")
		.enterPassenger2Age("30")
		.enterPassenger2Gender("Male")
		.enterPassenger3Name("Sreshta")
		.enterPassenger3Age("10")
		.enterPassenger3Gender("Female")
		.selectState("Andhra Pradesh")
		.clickOnSubmit()
		
		.verifyEmailID("Uma@gmail.com")
		.verifyMobileNumber("9765678999")
		.getAmount()
		.clickOnIAgreeButton()
		.clickOnMakePayment()
		
		.getTransID("");		
		
	}

}

