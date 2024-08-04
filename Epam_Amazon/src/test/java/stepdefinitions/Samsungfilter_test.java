package stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Samsungfilter_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseTest;
import constants.Constants;

public class Samsungfilter_test {
    private WebDriver driver;
    private Samsungfilter_page filter;

    public Samsungfilter_test() {
        this.driver = BaseTest.driver; 
        this.filter = new Samsungfilter_page(driver);
    }
    
    
    
    

    @Given("user opens the url")
public void user_opens_the_url () {
 	driver.get(Constants.URL);
	}

	@When ("user accepts cookies")
	public void user_accepts_cookies () {
		
		filter.clickaccept();
	}
	
	
	
	@Then("user clicks all menu")
	public void user_clicks_all_menu()  {
		filter.clickall();	
	}
    @Then("scroll")
    public void scroll() {
   	filter.menu();
   	 
    }
	
	

   @Then ("user clicks electronics")
   public void user_clicks_electronics() {
   	filter.electbutton();
   }
   
   @When("user clicks phone and ac") 
   public void user_clicks_phone_and_ac () {
   	filter.clickphonesandAccessories();
   }
   
   @Then("user clicks mobilephone") 
   public void user_clicks_mobilephone() {
   	filter.clickmobilephones();
   }
   
   @When("user selects price")
   public void user_selects_price() {
   filter.selectpricerange();
   }
   
		@Then("user selects samsung")
		public void user_selects_samsung() {
			filter.selectsamsung();
			
			
		}
   
		@When("user selects resolution")
		public void user_selects_resolution() {
		filter.selectresolution();	
		}
   
		
		@Then("user selects year")
		public void user_selects_year() {
		filter.selectyear();	
		}
		
		
		
		
		
		
		
		
		
		
		@Given ("user opens url")
		public void user_opens_url() {
			driver.get(Constants.URL2);	}
		
		@Then ("list")
		public void list() {
			filter.listprod();
		}
}
		
		
		
		
