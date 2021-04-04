package pom.pages;

import wrappers.ProjectWrappers;

public class ACSummaryPage extends ProjectWrappers{

	public ACSummaryPage verifyEmailID(String text) {
		verifyTextByXpath("//span[contains(text(),'Uma@gmail.com')]", text);
		return this;
	}
	
	public ACSummaryPage verifyMobileNumber(String text) {
		verifyTextByXpath("//span[contains(text(),'9765678999')]", text);
		return this;
	}
	
	public ACSummaryPage getAmount() {
		getTextByXpath("//span[contains(text(),'₹ 1,169.00 /- (Incl. of GST)')]");
		return this;		
	}
	
	public ACSummaryPage clickOnIAgreeButton() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public PaymentGatewayPage clickOnMakePayment() {
		clickByXpath("//button[contains(text(),'Make Payment')]");
		return new PaymentGatewayPage();
	}
}

