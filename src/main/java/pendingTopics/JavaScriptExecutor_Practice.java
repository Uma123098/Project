package pendingTopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// to click
		//js.executeScript("arguments[0].click()", driver.findElementByXPath("//a[text()='Create New Account']"));

		Thread.sleep(5000);
		String a = "uma";
		// enter data
		//js.executeScript("arguments[0].value='"+a+"'", driver.findElementByName("firstname"));
		
		// scroll down
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);
		// scroll up
		js.executeScript("window.scrollBy(0,-100)");
		
		Thread.sleep(5000);
		// scroll bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		// scroll up to the page
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		Thread.sleep(5000);
		// scroll to the element
		js.executeScript("arguments[0].scrollIntoView()", driver.findElementByXPath("//a[text()='Help']"));
		
		js.executeScript("arguments[0].style.border='2px solid red'",  driver.findElementByXPath("//a[text()='Help']"));
		
		
	}

}
