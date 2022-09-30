package Pack23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.BookingPage;
import Pages.HomePage;


public class IrctcTestNG {
	
	private WebDriver driver;
	private  HomePage home ;
	private BookingPage book;
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
		  
          book = new BookingPage(driver);
		
//		  book.clickOnSleeper();
	//	  book.clickOnAvailable();
//	      book.clickOnModify();
	//	  book.clickOnBookNow();
//		  book.clickOnCheckBox();
	}
	@Test 
	public void verifyToCheckBox()
	{
		System.out.println("Test1");
	
		 
    	   if(result==true)
    	   {
    		   book.clickOnCheckBox();
    		   System.out.println("Selected");
    	   }
    	   else
    	   {
    		   System.out.println("Not Selected");
    	   }
	  	}
	@Test (priority = 1)
	public void verifyToSleeperButton()
	{
		System.out.println("Test2");
		 book.clickOnSleeper();
	}
	@Test 
	public void verifyModifySearchButton()
	{
		System.out.println("Test3");
		 book.clickOnModify();
	}
	
	@Test (priority = 2)
	public void verifyAviability()
	{
		System.out.println("Test4");
		 book.clickOnAvailable();
	}
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("After Method");
	}

}
