package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class POM_TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="IRCTC GST Validation";
		testCaseAuthor="Uma";
		testCaseCategeory="functional";
	}
	
	@Test
	public void irctcGSTValidation(){
		
		new HomePage(driver, test)
		.clickOnCovid19Alert()
		.mouseHoverHolidays()
		.mouseHoverStays()
		.mouseHoverLounge()
		
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
		
		.switchToACPassangersPage()
		
		.selectGST("Yes")
		.enterGSTNo("4567899")
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
		.clickOnSubmitButton()
		.verifyGSTError("Please Enter Valid GSt number");
		
	
			
		
	}

}
