package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.HTMLReporter;

public class GenericWrappers extends HTMLReporter implements Wrappers {

	public RemoteWebDriver driver;
	public static Properties properties;
	
	public void loadObjects(){
		
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream("./src/test/java/Object.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
	}
		
	}
	
	public void invokeApp(String browser, String url) {
				
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "");
			    driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "");
				driver= new InternetExplorerDriver();
			}
		driver.get(url);
		driver.manage().window().maximize();
		logStatus("pass", "The "+browser+" browser launched successfully and loaded the url as - "+url);
		} catch (WebDriverException e) {
		logStatus("fail", "Browser Got closed due to unknown error");
		}
				
	}	
	
	public void enterById(String idValue, String data) {
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			logStatus("pass", "The element"+idValue+"is located successfully and entered the data as"+data+ "in the textbox");
		} catch (NoSuchElementException e) {
			logStatus("fail", "No such element exception is thrown");
		} catch (ElementNotVisibleException e){
			logStatus("fail", "Element not visible exception is thrown");
		} catch(ElementNotInteractableException e){
		    logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced web element is no longer attached to DOM");
		} catch(WebDriverException e){
			logStatus("fail", "Webdriver is unable to find and locate elements");
		}
		
	}

	public void enterByName(String nameValue, String data) {
  
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			logStatus("pass", "The element"+nameValue+"is located successfully and entered the data as"+data+ "in the textbox");
		} catch (NoSuchElementException e) {
			logStatus("fail", "No such element exception is thrown");
		} catch (ElementNotVisibleException e){
			logStatus("fail", "Element not visible exception is thrown");
		} catch(ElementNotInteractableException e){
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced web element is no longer attached to DOM");
		} catch(WebDriverException e){
			logStatus("fail", "Webdriver is unable to find and locate elements");
		} finally {
			takeSnap();
	 }
		
	}

	public void enterByXpath(String xpathValue, String data) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			logStatus("pass", "The element"+xpathValue+"is located successfully and entered the data as"+data+ "in the textbox");
		}  catch (NoSuchElementException e) {
			logStatus("fail", "No such element exception is thrown");
		} catch (ElementNotVisibleException e){
			logStatus("fail", "Element not visible exception is thrown");
		} catch(ElementNotInteractableException e){
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced web element is no longer attached to DOM");
		} catch(WebDriverException e){
			logStatus("fail", "Webdriver is unable to find and locate elements");
		} finally {
			takeSnap();
	 }
		
	}

	public void verifyTitle(String title) {

		try {
			String titleName = driver.getTitle();
			if (titleName.equals(title)) {
				logStatus("pass", "Actual title is"+title+"and expected title is"+titleName+"verified and they are same");
			} else {
				logStatus("fail", "Actual title"+title+"and expected title"+titleName+"is not same");
			}
			
		} catch (NoSuchWindowException e) {
			logStatus("fail", "There is no such window found with title"+title);
		} catch (WebDriverException e) {
			logStatus("fail", "Webdriver is unable to find and locate the window with title"+title);
		} finally {
			takeSnap();
		}
		
	}

	public void verifyTextById(String id, String text) {

		try {
			String textID = driver.findElementById(id).getText();
			if (textID.equals(text)) {
				logStatus("pass", "Actual text"+textID+"and expected text"+text+"is verified and they are same");
			}else {
				logStatus("fail", "Actual text"+textID+"and expected text"+text+"is verified and they are not same");
				}
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to verify the text"+text+"from the element located by id"+id);
		} finally {
			takeSnap();
	 }
		
	}

	public void verifyTextByXpath(String xpath, String text) {

		try {
			String textXpath = driver.findElementById(xpath).getText();
			if (textXpath.equals(text)) {
				logStatus("pass", "Actual text"+textXpath+"and expected text"+text+"is verified and they are same");
			}else {
				logStatus("fail", "Actual text"+textXpath+"and expected text"+text+"is verified and they are not same");
			}
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to verify the text"+text+"from the element located by Xpath"+xpath);
		} finally {
			takeSnap();
		}
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		
		try {
			String textXpath1=driver.findElementByXPath(xpath).getText();
			if (textXpath1.contains(text)) {
				logStatus("pass", "Actual text"+textXpath1+"and expected text"+text+"is verified and they are partially same");
			}else {
				logStatus("fail", "Actual text"+textXpath1+"and expected text"+text+"is verified and they are not same");
			}
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to verify the text"+text+"from the element located by Xpath"+xpath);
		} finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		 
		try {
			driver.findElementById(id).click();
			logStatus("pass", "Element found by ID"+id+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by ID"+id);
		} finally {
			takeSnap();
	  }
	}

	
	public void clickByClassName(String classVal) {
		
		try {
			driver.findElementByClassName(classVal).click();
			logStatus("pass", "Element found by className"+classVal+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by class name"+classVal);
		} finally {
			takeSnap();
	  }
	}

	public void clickByName(String name) {

		try {
			driver.findElementByName(name).click();
			logStatus("pass", "Element found by name"+name+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by name"+name);
		} finally {
			takeSnap();
	  }
	}

	public void clickByLink(String name) {

		try {
			driver.findElementByLinkText(name).click();
			logStatus("pass", "Element found by link text"+name+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by link Text"+name);
		} finally {
			takeSnap();
	  }
	}

	public void clickByLinkNoSnap(String name) {
		
		try {
			driver.findElementByLinkText(name).click();
			logStatus("pass", "Element found by link text"+name+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by link Text"+name);
		} 
	}

	public void clickByXpath(String xpathVal) {

		try {
			driver.findElementByXPath(xpathVal).click();
			logStatus("pass", "Element found by xpath"+xpathVal+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by xpath"+xpathVal);
		} finally {
			takeSnap();
		}
		
	}
	
	public void clickByXpath(WebElement xpathVal) {

		try {
			xpathVal.click();
			logStatus("pass", "Element found by xpath"+xpathVal+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by xpath"+xpathVal);
		} finally {
			takeSnap();
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {

		try {
			driver.findElementByXPath(xpathVal).click();
			logStatus("pass", "Element found by xpath"+xpathVal+"and clicked");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to click the element located by xpath"+xpathVal);
		}
	}

	public String getTextById(String idVal) {
	    
		String text= null;
		try {
			text=driver.findElementById(idVal).getText();
			logStatus("pass", "Getting text by using ID"+idVal+"as locator");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to get the text by using Id"+idVal+"as locator");
		} finally {
			takeSnap();
		}
		return text;
	}

	public String getTextByXpath(String xpathVal) {

		String text= null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			logStatus("pass", "Getting text by using Xpath"+xpathVal+"as locator");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to get the text by using xpath"+xpathVal+"as locator");
		} finally {
			takeSnap();
		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
 
		try {
			WebElement vistext=driver.findElementById(id);
			Select S=new Select(vistext);
			S.selectByVisibleText(value);
			
			logStatus("pass", "Element found by ID"+id+"and selected the value"+value+"by visible text");
				
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to select the value"+value+"using id"+id+"by visible text");
		} finally {
			takeSnap();
		}
		
	}

	public void selectIndexById(String id, int value) {
		
		try {
			WebElement index=driver.findElementById(id);
			Select S=new Select(index);
			S.selectByIndex(value);
			
			logStatus("pass", "Element found by ID"+id+"and selected the value"+value+"by index");
						
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to select the value"+value+"using id"+id+"by index");
		} finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {

		try {
			Set<String> parent=driver.getWindowHandles();
			ArrayList<String> list= new ArrayList<String>(parent);
			driver.switchTo().window(list.get(0));
			
			logStatus("pass", "Switched to parent window");
		
		} catch (NoSuchWindowException e) {
			logStatus("fail", "No such window exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "There is no such window found exception is thrown");
		} finally {
			takeSnap();
		}
	}
	
	public void switchToLastWindow() {

		try {
			Set<String> lastwindow=driver.getWindowHandles();
			ArrayList<String> list= new ArrayList<String>(lastwindow);
			driver.switchTo().window(list.get(list.size()-1));
			
			logStatus("pass", "Switched to latest window");
			
		} catch (NoSuchWindowException e) {
			logStatus("fail", "No such window exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "There is no such window found exception is thrown");
		} finally {
			takeSnap();
		}
		
	}

	public void acceptAlert() {
		
		try {
			driver.switchTo().alert().accept();
			logStatus("pass", "Alert is accepted successfully");
		} catch (NoAlertPresentException e){
			logStatus("fail", "No alert present exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "There is no such alert found to accept");
		} finally {
			takeSnap();
		}
	  
	}

	public void dismissAlert() {

		try {
			driver.switchTo().alert().dismiss();
			logStatus("pass", "Alert is dismissed successfully");
		} catch (NoAlertPresentException e){
			logStatus("fail", "No alert present exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "There is no such alert found to dismiss");
		} finally {
			takeSnap();
		}
		
	}

	
	public String getAlertText() {
		
		String text=null;
		
		try {
			driver.switchTo().alert().getText();
			logStatus("pass", "Got the alert text successfully");
		} catch (NoAlertPresentException e){
			logStatus("fail", "No alert present exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "There is no such alert found to get the text");
		} 		
		return text;
	}

	
	public long takeSnap() {
		
		long number = System.currentTimeMillis();
		
		try {
			File ss=driver.getScreenshotAs(OutputType.FILE);
			File ss1=new File("./screenshots/snap"+number+".jpg");
			FileUtils.copyFile(ss, ss1);
		
		} catch (WebDriverException e) {
		} catch (IOException e) {
		}
		
		return number;
	}

	
	public void closeBrowser() {
		
		try {
			driver.close();
			logStatus("pass", "Browser is closed successfully");
		} catch (NoSuchSessionException e) {
			logStatus("fail", "No such session exception is thrown");
		} catch (SessionNotCreatedException e) {
			logStatus("fail", "Session not created exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "No session found to close the browser");
		} 		
	}

	
	public void closeAllBrowsers() {
		
		try {
			driver.quit();
			logStatus("pass", "All open Browsers are closed successfully");
		} catch (NoSuchSessionException e) {
			logStatus("fail", "No such session exception is thrown");
		} catch (SessionNotCreatedException e) {
			logStatus("fail", "Session not created exception is thrown");
		} catch (WebDriverException e) {
			logStatus("fail", "No session found to close the browsers");
		} 
	}

	
	public void mouseHoverByXpath(String xpathValue) {
		
		try {
			Actions act=new Actions(driver);
			WebElement w=driver.findElementByXPath(xpathValue);
			act.click(w).perform();
			
			logStatus("pass", "Element found by Xpath and mouseHover is done successfully");
		} catch (ElementNotVisibleException e) {
			logStatus("fail", "Element not visible exception is thrown");
		} catch (ElementNotInteractableException e) {
			logStatus("fail", "Element not interactable exception is thrown");
		} catch (StaleElementReferenceException e) {
			logStatus("fail", "Referenced webelement is not visible in DOM");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to mousehover on the element located by xpath"+xpathValue);
		} finally {
			takeSnap();
		}
			
	}

	public void wait(int seconds) {

		try {
			Thread.sleep(seconds);
			logStatus("pass", "wait time is successfully applied");
		} catch (InterruptedException e) {
			logStatus("fail", "Wait time is not success");
		}
	}

	
	public void keysTab(String name) {

		try {
			driver.findElementByName(name).sendKeys(Keys.TAB);
			logStatus("pass", "Suucessfully navigated to next box");
		} catch (WebDriverException e) {
			logStatus("fail", "Not able to navigate to the next textbox");
		}
	}

	
	public void selectVisibleTextfromXpath(String xpathValue, String value) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(value);
			logStatus("pass", "selected text from xpath");
		} catch (WebDriverException e) {
			logStatus("fail", "Cannot select text from dropdown");
		}
	}

	public void selectVisibleTextbyName(String name, String value) {

		try {
			driver.findElementByName(name).sendKeys(value);
			logStatus("pass", "selected text from dropdown by name");
		} catch (WebDriverException e) {
			logStatus("fail", "Cannot select text from dropdown");
		}
		
	}

	
	public void getAttributeByXpath(String xpathValue, String value) {
			
		try {
			driver.findElementByXPath(xpathValue).getAttribute(value);
			logStatus("pass", value+"is the value");
		} catch (WebDriverException e) {
			logStatus("fail", "Cannot get the text from attribute");
		}
	}

	
}

