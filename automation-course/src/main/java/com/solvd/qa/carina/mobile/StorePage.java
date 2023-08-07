package com.solvd.qa.carina.mobile;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class StorePage extends AbstractPage implements IMobileUtils {

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView")
    private ExtendedWebElement item1;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement viewCartBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView")
    private ExtendedWebElement checkoutBtn;

    public StorePage(WebDriver driver) {
        super(driver);
    }
    public void addToCart(){
        item1.click();
    }

    public void viewCart(){
        viewCartBtn.click();
    }

    public boolean isPageOpened() {
        return viewCartBtn.isElementPresent();
    }

    public void checkoutProcess(){
        addToCart();
        viewCart();
        checkoutBtn.click();
    }

}
