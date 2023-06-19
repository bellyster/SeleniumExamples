package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePage {
    static DriverSingleton driverSingleton= DriverSingleton.getInstance();
    static WebDriver driver= driverSingleton.getDriver();

    public void goToWikipedia() {
        driver.get("https://www.wikipedia.org/");
    }

    public void fillSearchBox(String search){
        //Para escribir texto:
        WebElement searchBox=  driver.findElement(By.id("searchInput"));
        String busqueda=search;
        searchBox.sendKeys(busqueda); //permite mandar texto a un input
    }

    public void clickSearch(){
        //click search button
        WebElement searchButton= driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();
    }

    public String getTitle(){
        WebElement pageTitle= driver.findElement(By.cssSelector("#firstHeading"));
        return pageTitle.getText();
    }

    public static void closeDriver(){
        driverSingleton.closeObjectInstance();
    }

}
