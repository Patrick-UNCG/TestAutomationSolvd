package com.solvd.qa.carina.web;

import com.solvd.qa.carina.web.pages.HomePage;
import com.solvd.qa.carina.web.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {

    @Test()
    public void login(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.navigateLogin();
        Assert.assertTrue(loginPage.isPageOpened(), "LoginPage isn't open");
        loginPage.typeEmail("patrickksor2@gmail.com");
        loginPage.clickContinueBtn();
    }

    @Test()
    public void search(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "HomePage isn't open");
        homePage.typeSearchBar("Headphones");
        homePage.clickSubmitBtn();
    }


}
