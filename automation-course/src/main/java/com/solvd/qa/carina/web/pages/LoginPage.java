package com.solvd.qa.carina.web.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='ap_email']")
    private ExtendedWebElement emailInputField;
    @FindBy(xpath = "//*[@id='continue']")
    private ExtendedWebElement continueBtn;
    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    private ExtendedWebElement signInHover;

    @FindBy(xpath = "//*[@id='nav-flyout-ya-signin']")
    private ExtendedWebElement signInButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.amazon.com/");
    }

    public void typeEmail(String email){
        emailInputField.type(email);
        emailInputField.hover();
    }

    public void navigateLogin(){
        signInHover.hover();
        signInButton.click();
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }


}
