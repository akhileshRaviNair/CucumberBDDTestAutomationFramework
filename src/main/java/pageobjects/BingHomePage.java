package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BingHomePage
{
    WebDriver driver;

    public  BingHomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public BingHomePage search(String keyword)
    {
        driver.findElement(By.id("sb_form_q")).sendKeys(keyword);
        driver.findElement(By.id("sb_form_q")).sendKeys(Keys.ENTER);

        return  this;
    }
}

