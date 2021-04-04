package pendingTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://facebook.com");
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Forgotten password?").click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		

	}

}
