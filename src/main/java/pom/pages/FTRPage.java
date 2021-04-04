package pom.pages;

import wrappers.ProjectWrappers;

public class FTRPage extends ProjectWrappers {

	public FTRPage switchToFtrPage () {
		switchToLastWindow();
		return this;
    }
	
	public FTRPage newUserSignup() {
		clickByXpath("//a[contains(text(),'New User? Signup')]");
		return this;
	}
}