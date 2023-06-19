package org.example;

import org.example.drivers.DriverSingleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static DriverSingleton driverSingleton;
    static WebDriver driver;
    @BeforeAll
    public static void initializeObjects(){
        driverSingleton= DriverSingleton.getInstance();
        driver= driverSingleton.getDriver();
    }

    @Test
    void searchInWikipedia() {
        driver.get("https://www.wikipedia.org/");
        //Para escribir texto:
        WebElement searchBox=  driver.findElement(By.id("searchInput"));
        String busqueda="mafia";
        searchBox.sendKeys(busqueda); //permite mandar texto a un input
        //click search button
        WebElement searchButton= driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();
        WebElement pageTitle= driver.findElement(By.cssSelector("#firstHeading"));
        assertEquals(pageTitle.getText(), "Mafia");
    }

    @AfterAll
    static void closeDriver(){
        driverSingleton.closeObjectInstance();
    }

}