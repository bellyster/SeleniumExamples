package org.example.steps;
import cucumber.api.java.en.*;
import org.example.pages.BasePage;
import org.junit.Assert;

public class SearchSteps {
    BasePage wikipedia= new BasePage();

    @Given("^I go to the website$")
    public void navigateToWikipedia(){
        wikipedia.goToWikipedia();
    }
    @When ("^I type the word Mafia$")
    public void typeMafia(){
        wikipedia.fillSearchBox("Mafia");
    }
    @And ("^I click search button$")
    public void clickSearch(){
        wikipedia.clickSearch();
    }
    @Then ("^I go to the mafia page$")
    public void goToMafiaPage(){
        String result = wikipedia.getTitle();
        wikipedia.closeDriver();
        Assert.assertEquals(result, "Mafia");
    }
}
