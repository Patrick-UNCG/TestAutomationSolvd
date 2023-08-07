package com.solvd.qa.carina.mobile;

import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest {
    @Test()
    public void testLoginAndCheckout(){
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened(), "LoginPage isn't open");
        loginPage.typeUserName("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickLoginBtn();
        StorePage storePage = new StorePage(getDriver());
        Assert.assertTrue(storePage.isPageOpened(), "StorePage isn't open");
        storePage.checkoutProcess();
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        Assert.assertTrue(checkoutPage.isPageOpened(), "CheckoutPage isn't open");
        checkoutPage.typeInfo("Patrick", "Ksor", "12121");
        checkoutPage.clickContinueBtn();
    }
}
