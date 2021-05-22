package stepdefinition;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.BingHomePage;

public class Stepdefs {
    private WebDriver driver;

    @Given("I search in bing with a random data")
    public void i_search_in_bing_with_a_random_data() {
        try {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/lib/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.bing.com");

            new BingHomePage(driver).search("automation");
        Thread.sleep(5000); // just in case if you want to see browser before closing :)
        }catch (Exception e)
        {

        }

        driver.quit();
    }
}
