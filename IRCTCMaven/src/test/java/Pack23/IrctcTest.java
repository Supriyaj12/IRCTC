package Pack23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BookingPage;
import Pages.HomePage;

public class IrctcTest {

	
	public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
      
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://www.irctc.co.in/");
	  driver.manage().window().maximize();
	  
	  HomePage home = new HomePage(driver);
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
	  
	BookingPage book = new BookingPage(driver);
	  book.clickOnSleeper();
	  book.clickOnAvailable();
	  book.clickOnModify();
	  book.clickOnBookNow();
	  book.clickOnCheckBox();
	 
   }

}
