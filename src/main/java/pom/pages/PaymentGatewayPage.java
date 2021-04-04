package pom.pages;

import wrappers.ProjectWrappers;

public class PaymentGatewayPage extends ProjectWrappers{

	public PaymentGatewayPage getTransID(String value) {
		getAttributeByXpath("//input[@id='txnId']", value);
		return this;
	}
}
