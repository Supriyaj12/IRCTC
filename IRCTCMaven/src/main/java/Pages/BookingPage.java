package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	@FindBy (xpath = "(//div[text()=' Refresh '])[2]")private WebElement sleeper;
	
//	@FindBy (xpath = "(//td[@class='ng-star-inserted'])[1]") private WebElement secondsitting;
	
	@FindBy (xpath = "(//div[@class='pre-avl'])[2]") private WebElement availbity ;
	
	@FindBy (xpath = "(//button[@type='button'])[5]") private WebElement bookNow ;
	
	@FindBy (xpath = "(//label[text()='AC 2 Tier (2A)'])[1]")private WebElement checkbox;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")private WebElement modify;
	
	
	
	 public BookingPage (WebDriver driver)  
		
		{
			PageFactory.initElements(driver, this);
			
		}
	    
	     public void clickOnSleeper()
	       {
	    	 sleeper.click();
	       }
	     
	     public void clickOnAvailable()
		    {
		    	availbity.click();
		    }
		     
	     public void clickOnCheckBox()
		    {
	    	   boolean result = checkbox.isSelected();
	    	   if(result==true)
	    	   {
	    		   checkbox.click();
	    		   System.out.println("Selected");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Not Selected");
	    	   }
		    	
		    }
         public void clickOnModify()
		    {
		    	modify.click();
		    }
         public void clickOnBookNow()

         {
        	 bookNow.click();
         }
	  }
