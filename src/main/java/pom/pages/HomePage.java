package pom.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement covid19Alert;
	
	
	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);		
	}
	
	public HomePage clickOnCovid19Alert(){
		clickByXpath(covid19Alert);
		return this;
	}
	
	public RegisterPage clickOnRegister(){
		clickByXpath(properties.getProperty("HomePage.clickOnRegister"));
		return new RegisterPage(driver, test);
	}
	
	public HomePage mouseHoverHolidays(){
		mouseHoverByXpath(properties.getProperty("HomePage.mouseHoverHolidays"));
		return this;
	}
	
	public HomePage mouseHoverStays(){
		mouseHoverByXpath(properties.getProperty("HomePage.mouseHoverStays"));
		return this;
	}
	
	public AccommodationPage mouseHoverLounge(){
		mouseHoverByXpath(properties.getProperty("HomePage.mouseHoverLounge"));
		return new AccommodationPage(driver, test);
	}
	
	public HomePage mouseHoverTrains() {
		mouseHoverByXpath("(//strong[contains(text(),'TRAINS')])[position()=1]");
		return this;
	}
	
	public FTRPage clickOnFTRCoachBooking() {
		clickByXpath("(//span[contains(text(),'FTR Coach/Train Booking')])[position()=1]");
		return new FTRPage();
	}
	
	
	
}
  