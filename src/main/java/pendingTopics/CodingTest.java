package pendingTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		int size = driver.findElementsByTagName("iframe").size();
		
		for(int i=0; i<size; i++){
			driver.switchTo().frame(i);
			if(driver.findElementByXPath("xpath").isDisplayed()){
				
				driver.findElementByXPath("xpath").click();
				Set<String> handlesSet = driver.getWindowHandles();
				List<String> list = new ArrayList<String>(handlesSet);
				driver.switchTo().window(list.get(list.size()-1));
				System.out.println(driver.findElementByXPath("").getText());
				driver.quit();
			}else{
				driver.switchTo().defaultContent();
			}
		}

	}

}
