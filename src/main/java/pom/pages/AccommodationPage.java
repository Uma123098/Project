package pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class AccommodationPage extends ProjectWrappers{
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test = test;
	}
	
	public AccommodationPage switchToAccommodationPage() {
		switchToLastWindow();
		return this;
	}

	public AccommodationPage selectStation(String value) {
		selectVisibleTextfromXpath("//select[@name='city']", value);
		return this;
	}
	
	public AccommodationPage selectLounge(String value) {
		selectVisibleTextfromXpath("//select[@name='laungecity']", value);
		return this;
	}
	
	public AccommodationPage selectPersons(String value) {
		selectVisibleTextfromXpath("//select[@name='selPassangers']", value);
		return this;
	}
	
	public AccommodationPage selectCheckInDate(String value) {
		selectVisibleTextfromXpath("//input[@name='acservicecheckindate']", value);
		return this;
	}
	
	public AccommodationPage selectCheckInTime(String value) {
		selectVisibleTextfromXpath("//select[@name='checkInTime']", value);
		return this;
	}
	
	public AccommodationPage selectDuration(String value) {
		selectVisibleTextfromXpath("//select[@name='checkOutTime']", value);
		return this;
	}
	
	public AccommodationPage clickOnBook() {
		clickByXpath("//button[contains(text(),'Book')]");
		return this;
	}
	
	public AccommodationPage clickOnGuestLogin() {
		clickByXpath("//a[contains(text(),'Guest User Login ')]");
		return this;
	}
	
	public AccommodationPage enterEmailID(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}

	public AccommodationPage enterMobileNumber(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}

	public ACPassangersPage clickOnLogin() {
		clickByXpath("//button[contains(text(),'Login')]");
		return new ACPassangersPage();
	}
		
}
