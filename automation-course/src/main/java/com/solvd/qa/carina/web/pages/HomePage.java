package com.solvd.qa.carina.web.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private ExtendedWebElement searchInputField;
    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    private ExtendedWebElement submitButton;


    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.amazon.com/");

    }

    public void typeSearchBar(String search){
        searchInputField.type(search);
    }

    public void clickSubmitBtn(){
        submitButton.click();
    }
}
