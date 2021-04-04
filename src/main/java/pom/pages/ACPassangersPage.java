package pom.pages;

import wrappers.ProjectWrappers;

public class ACPassangersPage extends ProjectWrappers{
	
	public ACPassangersPage switchToACPassangersPage() {
		switchToLastWindow();
		return this;
	}
	
	public ACPassangersPage enterPassenger1Name(String data) {
		enterByXpath("(//input[@placeholder='Name'])[position()=1]", data);
		return this;
	}

	public ACPassangersPage enterPassenger1Age(String data) {
		enterByXpath("(//input[@placeholder='Age'])[position()=1]", data);
		return this;
	}
	
	public ACPassangersPage enterPassenger1Gender(String data) {
		enterByXpath("(//select[@class='browser-default custom-select font-14 ng-untouched ng-pristine ng-invalid'])[position()=1]", data);
		return this;
	}
	
	public ACPassangersPage enterPassenger2Name(String data) {
		enterByXpath("(//input[@placeholder='Name'])[position()=2]", data);
		return this;
	}

	public ACPassangersPage enterPassenger2Age(String data) {
		enterByXpath("(//input[@placeholder='Age'])[position()=2]", data);
		return this;
	}
	
	public ACPassangersPage enterPassenger2Gender(String data) {
		enterByXpath("(//select[@class='browser-default custom-select font-14 ng-untouched ng-pristine ng-invalid'])[position()=2]", data);
		return this;
	}
	
	public ACPassangersPage enterPassenger3Name(String data) {
		enterByXpath("(//input[@placeholder='Name'])[position()=3]", data);
		return this;
	}

	public ACPassangersPage enterPassenger3Age(String data) {
		enterByXpath("(//input[@placeholder='Age'])[position()=3]", data);
		return this;
	}
	
	public ACPassangersPage enterPassenger3Gender(String data) {
		enterByXpath("(//select[@class='browser-default custom-select font-14 ng-untouched ng-pristine ng-invalid'])[position()=3]", data);
		return this;
	}
	
	public ACPassangersPage selectGST(String value) {
		selectVisibleTextfromXpath("//select[@name='gstGet']", value);
		return this;
	}
	
	public ACPassangersPage enterGSTNo(String data) {
		enterByXpath("//input[@name='gstNo']", data);
		return this;
	}
	
	public ACPassangersPage verifyGSTError(String text) {
		verifyTextContainsByXpath("//span[contains(text(),'Please Enter Valid GSt number')]", text);
		return this;
	}
	
	public ACPassangersPage selectState(String value) {
		selectVisibleTextfromXpath("//select[@name='state']", value);
		return this;
	}
	
	public ACSummaryPage clickOnSubmit() {
		clickByXpath("//button[contains(text(),'Submit')]");
		return new ACSummaryPage();
	}
	
	public ACPassangersPage clickOnSubmitButton() {
		clickByXpath("//button[contains(text(),'Submit')]");
		return this;
	}
	
}
