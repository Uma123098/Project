package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class POM_TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		
		testCaseName="TC001";
		testCaseDescription="IRCTC SignUp";
		testCaseAuthor="Uma";
		testCaseCategeory="Functional";
		dataSheetName="Samplelellle";
	}
		
	@Test(dataProvider="fetchData")	
	public void irctcSignUp(){
		
	new HomePage(driver, test)
	.clickOnCovid19Alert()
	.clickOnRegister()
	.enterUserName("Uma")
	.enterPassword("Uma@123")
	.enterCnfPassword("Uma@123")
	.enterPreferedLanguage("English")
	.enterSecurityQstn("What is your all time favorite sports team?")
	.enterSecurityAns("India")
	.clickOnContinue()

	.enterFirstName("Uma")
	.enterMiddleName("Varma")
	.enterLastName("Datla")
	.selectOccupation("PROFESSIONAL")
	.selectDateOfBirth("17-05-1995")
	.clickOnMarriedButton()
	.selectCountry("India")
	.clickOnFemaleGender()
	.enterEmail("Uma@gmail.com")
	.enterMobile("8765456788")
	.selectNationality("India")
	.clickOnContinue()
	
	.enterFlatNo("578/A")
	.enterStreet("Shradha nagar")
	.enterArea("Hanmakonda")
	.enterPincode("533005")
	.selectCity("EAST GODAVARI")
	.selectPostoffice("Sarpavaram B.O")
	.enterPhone("9765678999")
	.clickOnNo()
	.enterOfcFlatNo("345-A")
	.enterOfcStreet("Maruthi Nagar")
	.enterOfcArea("Kumpally")
	.selectCountryDropdown("India")
	.enterOfcPincode("533003")
	.enterOfcState("Andhra Pradesh")
	.selectOfcCity("Kakinada")
	.selectOfcPostoffice("Pitapuram")
	.enterOfcPhone("8900007654");
			
	}
}