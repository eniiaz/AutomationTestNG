package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class Google {
    @Test
    public void search() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
    }

    @Test
    public void login() {
        Driver.getDriver().get("https://google.com");
        System.out.println(Driver.getDriver().getTitle());
    }

    @AfterMethod
    public void cleanUp() {
        Driver.quitBrowser();
    }
}
