package com.vergingames.pages;

import com.vergingames.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Click On All Accept Cookies
    @CacheLookup
    @FindBy(xpath = "//div[@class='option']/label[@for='privacy_pref_optin']")
    WebElement acceptCookiesButton;

    //Click On Search Button
    @CacheLookup
    @FindBy(id = "Capa_1")
    WebElement clickOnSearchButton;

    //Mouse Hoover and click On Doubly Bubbly
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Doubly Bubbly')]")
    WebElement clickOnDoublyBubbly;

    //Verify text "Doubly Bubbly"
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Doubly Bubbly']")
    WebElement verifyTextDoublyBubbly;


    //=================================================================\\

    //Click On All Accept Cookies
    public void clickOnAcceptCookieButton() {
        clickOnElement(acceptCookiesButton);
        log.info("Click On Accept Cookie Button : " + acceptCookiesButton.toString());
    }

    //Click On Search Button
    public void clickOnSearchButton() {
        clickOnElement(clickOnSearchButton);
        log.info("Click On Search Button : " + clickOnSearchButton.toString());
    }

    //Mouse Hoover and click On Doubly Bubbly
    public void clickOnDoublyBubbly() {
     mouseHoverToElementAndClick(clickOnDoublyBubbly);
        log.info("Click On Search Button : " + clickOnDoublyBubbly.toString());
    }

    //Verify text "Doubly Bubbly"
    public String verifyText(){
        log.info("Getting text From : " + verifyTextDoublyBubbly.toString());
        return getTextFromElement(verifyTextDoublyBubbly);
    }
}