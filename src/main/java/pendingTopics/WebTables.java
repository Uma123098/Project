package pendingTopics;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in");
		
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		Thread.sleep(10000);
		List<WebElement> list = driver.findElementsByXPath("(//table[contains(@class, 'TrainListHeader')]/tbody/tr)[1]/td/a");
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
	}

}
