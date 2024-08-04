package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public static WebDriver driver;

    public static void setUp() {
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver = new ChromeDriver();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
