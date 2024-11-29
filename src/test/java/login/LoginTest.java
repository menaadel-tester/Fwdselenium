package login;

import Pages.LoginPage;
import basetest.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test

    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickOnLogin();
        loginPage.loginFeature("mena@gmail.com","M@m0102273135");


    }
}
