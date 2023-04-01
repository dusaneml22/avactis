package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AllFlipkardLinkElementsTestNGProgram {
	WebDriver driver;
  @Test
  public void flipKardLinkElement() {
	    driver.get("https://www.flipkart.com/");
	    List<WebElement> inputElements = driver.findElements(By.tagName("input"));
	    System.out.println(inputElements.size());
	    
	    for(WebElement firstInput: inputElements) {
	    	System.out.println(firstInput.getText());
	    }

		
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
