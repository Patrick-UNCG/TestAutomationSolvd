package com.solvd.qa.carina.mobile;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage implements IMobileUtils {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement userNameField;

    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public void typeUserName(String userName){
        userNameField.type(userName);
    }

    public void typePassword(String password){
        passwordField.type(password);
    }


    public void clickLoginBtn(){
        loginBtn.click();


    }


}
