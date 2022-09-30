package Pack23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;

public class VerifyToSearchButton {
	
	
	private WebDriver driver;
	private  HomePage home ;
	private boolean result;
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openIRCTCbrowser()
	{
		System.out.println("Before Method");
		
		  driver.get("https://www.irctc.co.in/");
		  driver.manage().window().maximize();
		  
		   home = new HomePage(driver);
		  
		  home.clickOnAlert();
		  home.sendKeyToFrom();
		  home.sendKeyTo();
		  home.clickOnCalender();
		  home.clickOnDate();
		  home.clickOnAllclasses();
		  home.clickOnFirstClass();
		  home.clickOnGeneral();
		  home.clickOnLadies();
		  home.clickOnSearch();
		  
	}
	@Test 
	public void verifyToFromHiddenList()
	{
		System.out.println("Test1");
	
		 if(result==true)
  	   {
			 home.sendKeyToFrom();
			 
  		   System.out.println("Displayed");
  	   }
  	   else
  	   {
  		   System.out.println("Not Displayed");
  	   }
	}
}