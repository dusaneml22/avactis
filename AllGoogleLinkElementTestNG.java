package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AllGoogleLinkElementTestNG {
	WebDriver driver;
  @Test
  public void gmailAnchor() {
	  driver.get("http://www.google.com");
	  
	  //Get all the links
	  List<WebElement> allGoogleLinks;
	  allGoogleLinks = driver.findElements(By.tagName("a"));
	  
		/*
		 * When findElements() failed, it does not give error, it gives arraylist with
		 * zero element
		 */
	  
		/* When findElement() failed,it throws Exception - NoSuchElementException */
	  
	  
	  System.out.println("No. of links on Google page: "+ allGoogleLinks.size());
	//getText()
	//getAttribute("href")
	//One by one, for each link print the visible text and url
	  for(int i=0; i<allGoogleLinks.size(); i++) {
		  System.out.println(allGoogleLinks.get(i).getText() + " - "+ allGoogleLinks.get(i).getAttribute("href"));
	  }
	  
	  for(int i=0; i<allGoogleLinks.size(); i++) {
		  WebElement currentElement = allGoogleLinks.get(i);
		  System.out.println(currentElement.getText() + " - "+ currentElement.getAttribute("href"));
	  }
	  
	  for(WebElement currentElement: allGoogleLinks) {
		  System.out.println(currentElement.getText() + " - "+ currentElement.getAttribute("href"));
	  }
	  
	
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
