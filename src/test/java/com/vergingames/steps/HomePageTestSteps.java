package com.vergingames.steps;

import com.vergingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageTestSteps {
    @Given("I am On home Page")
    public void iAmOnHomePage() {
    }

    @When("I Accept All Cookies")
    public void iAcceptAllCookies() {
        new HomePage().clickOnAcceptCookieButton();
    }

    @And("I Click on Search")
    public void iClickOnSearch() {
        new HomePage().clickOnSearchButton();

    }

    @And("I MouseHover and click On Doubly Bubbly")
    public void iMouseHoverAndClickOnDoublyBubbly() {
        new HomePage().clickOnDoublyBubbly();
    }


    @Then("I verify text {string}")
    public void iVerifyText(String text) {
        Assert.assertEquals(new HomePage().verifyText(),text, "Incorrect text Displayed");
    }


}
