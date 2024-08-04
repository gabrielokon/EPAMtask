package pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samsungfilter_page extends BasePage {
    private WebDriverWait wait;

   

    public Samsungfilter_page(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));  
    }
    
    
    
    
    By accept = By.xpath("//input[@id= 'sp-cc-accept']");

	public void clickaccept() {

		driver.findElement(accept).click();
	}

	By all = By.xpath("//div[@class= 'nav-left']/a ");

	public void clickall() {

driver.findElement(all).click();

	} 
	
	
	public void menu() {
		scrollBy(0,1000);
	}
	
 
	By samsung = By.xpath("//*[@id=\"p_123/46655\"]/span/a/div/label/i"); 
	
	public void selectsamsung () {
		scrollToElement(samsung);
		driver.findElement(samsung).click();
	
	}
	
	
	By resolution =By.xpath("//*[@id=\"p_n_feature_four_browse-bin/14210450031\"]/span/a");
	
	public void selectresolution () {
		scrollToElement(resolution);
		driver.findElement(resolution).click();
	}
	
	
	
	
	By year = By.xpath("//*[@id=\"p_n_feature_thirteen_browse-bin/12421314031\"]/span/a/div/label/i");
	
	public void selectyear () {
		scrollToElement(year);
		driver.findElement(year).click();
	}

 By electronics = By.xpath("//a[@data-menu-id='14']");

public void clickelectronics() {

	driver.findElement(electronics).click(); 
}
	
    public void electbutton() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(electronics));
    	wait.until(ExpectedConditions.elementToBeClickable(electronics));
    	driver.findElement(electronics).click();
    }
    
    
    
    public void clickelectronics2() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(electronics));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(electronics));
        element.click();
    }

    public void scrollToElectronics() {
        scrollToElement(electronics);
    }
    
  
    
    
    
    By mobilephones = By.xpath ("//*[@id=\"a-page\"]/div[1]/div[2]/div[1]/div[1]/div/p/a[1]");

    public void clickmobilephones() {
    	driver.findElement(mobilephones).sendKeys(Keys.ENTER);
    }

    By pricerange = By.xpath("//*[@id=\"s-refinements\"]/div[47]/ul/li[3]/span/a");
    
    public void selectpricerange() {
    	scrollToElement(pricerange);
    	driver.findElement(pricerange).click();
    	
    }

  public void listprod() {
	List <WebElement> productTitleElements =  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("Span. A-size-base-plus a-color-base a-text-normal")));
	  for (WebElement titleElement : productTitleElements) {
		  String title = titleElement.getText();
		  System.out.println("Product Title: " + title);
	  }
	  
  }
 

    	
    By phonesandAccessories = By.xpath("//*[@id=\"hmenu-content\"]/ul[14]/li[8]/a");

    public void clickphonesandAccessories() {
    driver.findElement(phonesandAccessories).sendKeys(Keys.ENTER);
    	
    }

    
    
    
    
    
    
    
    
   

   
    }

