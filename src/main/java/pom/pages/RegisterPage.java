package pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers{
	
	public RegisterPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	
	public RegisterPage enterUserName(String data){
		enterById("userName", data);
		//enterByXpath(properties.getProperty("RegisterPage.enterUserName"), data);
		return this;
	}
	
	public RegisterPage enterPassword(String data){
		enterById("usrPwd", data);
		//enterByXpath(properties.getProperty("RegisterPage.enterPassword"), data);
		return this;
	}
	
	public RegisterPage enterCnfPassword(String data){
		enterById("cnfUsrPwd", data);
		//enterByXpath(properties.getProperty("RegisterPage.enterCnfPassword"), data);
		return this;
	}
	
	public RegisterPage enterPreferedLanguage(String data) {
		enterByXpath(properties.getProperty("RegisterPage.selectPreferedLanguage"), data);
		return this;
	}
	
	public RegisterPage enterSecurityQstn(String data) {
		enterByXpath(properties.getProperty("RegisterPage.selectSecurityQstn"), data);
		return this;
	}
	
	public RegisterPage enterSecurityAns(String data) {
		enterByXpath(properties.getProperty("RegisterPage.enterSecurityAns"), data);
		return this;
	}
	
	public RegisterPage clickOnContinue() {
		clickByXpath(properties.getProperty("RegisterPage.clickOnContinue"));
		return this;
	}
	
	public RegisterPage enterFirstName(String data) {
		enterByXpath(properties.getProperty("RegisterPage.enterFirstName"), data);
		return this;
	}
	
	public RegisterPage enterMiddleName(String data) {
		enterByXpath(properties.getProperty("RegisterPage.enterMiddleName"), data);
		return this;
	}
	
	public RegisterPage enterLastName(String data) {
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	
	public RegisterPage selectOccupation(String value) {
		selectVisibleTextfromXpath("//span[contains(text(),'Select Occupation')]", value);
		return this;
	}
	
	public RegisterPage selectDateOfBirth(String data){
		enterByXpath("//input[contains(@placeholder,'Date Of Birth')]", data);
		return this;
	}
	
	public RegisterPage clickOnMarriedButton() {
		clickByXpath("//label[contains(text(),'Married')]");
		return this;
	}
	
	public RegisterPage clickOnUnmarriedButton() {
		clickByXpath("//label[contains(text(),'Unmarried')]");
		return this;
	}
	
	public RegisterPage selectCountry(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='resCountry']", value);
		return this;
	}
	
	public RegisterPage clickOnMaleGender() {
		clickByXpath("//span[contains(text(),'Male')]");
		return this;
	}
	
	public RegisterPage clickOnFemaleGender() {
		clickByXpath("//span[contains(text(),'Female')]");
		return this;
	}
	
	public RegisterPage clickOnTransgender() {
		clickByXpath("//span[contains(text(),'Transgender')]");
		return this;
	}
	
	public RegisterPage enterEmail(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public RegisterPage enterMobile(String data) {
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public RegisterPage selectNationality(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='nationality']", value);
		return this;
	}
	
	public RegisterPage enterFlatNo(String data) {
		enterByXpath("//input[@id='resAddress1']", data);
		return this;
	}
	
	public RegisterPage enterStreet(String data) {
		enterByXpath("//input[@id='resAddress2']", data);
		return this;
	}
	
	public RegisterPage enterArea(String data) {
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
	}
	
	public RegisterPage enterPincode(String data) {
		enterByXpath("//input[@name='resPinCode']", data);
		return this;
	}
	
	public RegisterPage selectCity(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='resCity']", value);
		return this;
	}
	
	public RegisterPage selectPostoffice(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='resPostOff']", value);
		return this;
	}
	
	public RegisterPage enterPhone(String data) {
		enterByXpath("//input[@id='resPhone']", data);
		return this;
	}
	
	public RegisterPage clickOnYes() {
		clickByXpath("//label[contains(text(),'Yes')]");
		return this;
	}
	
	public RegisterPage clickOnNo() {
		clickByXpath("//label[contains(text(),'No')]");
		return this;
	}
	
	public RegisterPage enterOfcFlatNo(String data) {
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	
	public RegisterPage enterOfcStreet(String data) {
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	}
	
	public RegisterPage enterOfcArea(String data) {
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
	}
	
	public RegisterPage selectCountryDropdown(String value) {
		selectVisibleTextfromXpath("//option[contains(text(),'Select a Country']", value);
		return this;
	}
	
	public RegisterPage enterOfcPincode(String data) {
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
	}
	
	public RegisterPage enterOfcState(String data) {
		enterByXpath("//input[@id='offState']", data);
		return this;
	}
	
	public RegisterPage selectOfcCity(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='offCity']", value);
		return this;
	}
	
	public RegisterPage selectOfcPostoffice(String value) {
		selectVisibleTextfromXpath("//select[@formcontrolname='offPostOff']", value);
		return this;
	}
	
	public RegisterPage enterOfcPhone(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		return this;
	}
		
}
