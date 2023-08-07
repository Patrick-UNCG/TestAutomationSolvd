package com.solvd.qa.carina.mobile;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends AbstractPage implements IMobileUtils {


    @FindBy(xpath="//android.widget.EditText[@content-desc=\"test-First Name\"]")
    private ExtendedWebElement firstName;
    @FindBy(xpath="//android.widget.EditText[@content-desc=\"test-Last Name\"]")
    private ExtendedWebElement lastName;
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")
    private ExtendedWebElement zipCode;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView")
    private ExtendedWebElement continueBtn;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void typeInfo(String firstNameStr, String lastNameStr, String zipCodeStr){
        firstName.type(firstNameStr);
        lastName.type(lastNameStr);
        zipCode.type(zipCodeStr);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }

    public boolean isPageOpened(){
        return firstName.isElementPresent();
    }


}
