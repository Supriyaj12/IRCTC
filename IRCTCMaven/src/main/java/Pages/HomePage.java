package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private Actions act;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]") private WebElement alert;

	@FindBy (xpath = "(//input[@aria-haspopup='true'])[1]") private WebElement from;

	@FindBy (xpath = "(//input[@aria-haspopup='true'])[2]") private WebElement to;

	@FindBy (xpath = "(//input[@type='text'])[3]") private WebElement cal;

	@FindBy (xpath = "(//a[@draggable='false'])[10]") private WebElement date;

	@FindBy (xpath = "(//span[text()='All Classes'])[1]") private WebElement allClasses;
	
	@FindBy (xpath = "//span[text()='AC First Class (1A) ']") private WebElement acFirstClass;
	
	@FindBy (xpath = "//span[text()='GENERAL']") private WebElement general;
	
	@FindBy (xpath = "//span[text()='LADIES']") private WebElement ladies;
	
	@FindBy (xpath = "//button[@type='submit']") private WebElement search;

	 public HomePage (WebDriver driver)  
		
		{
			PageFactory.initElements(driver, this);
			
			 act = new Actions(driver);
		}
	    
	    
	    public void clickOnAlert()
	    {
	    	alert.click();
	    }
	    
	     public void sendKeyToFrom()
	    {
	    	
	    	 boolean result = from.isDisplayed();
	    	 System.out.println(result);
	    	  from.sendKeys("PUNE JN - PUNE");
	    }
	    
	    public void sendKeyTo()
	    {
	       to.sendKeys("KALYAN JN - KYN");
	    }
	    
	    public void clickOnCalender()
	    {
	    	cal.click();
	    }
	    
	    public void clickOnDate()
	    {
	    	date.click();
	    }
	    
	    public void clickOnAllclasses()
	    {
	    //	act.moveToElement(allClasses).click().build().perform();
	    	allClasses.click();
	    }
	    
       public void clickOnFirstClass()
        {
	    	act.moveToElement(acFirstClass).click().build().perform();
	    }
	    public void clickOnGeneral()
	    {
	    	general.click();
	    }
	    public void clickOnLadies()
	    {
	    	ladies.click();
	    }
	    public void clickOnSearch()
	    {
	    	search.click();
	    }




}
