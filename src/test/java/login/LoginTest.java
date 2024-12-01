package login;

import Pages.LoginPage;
import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.ReadFromJson;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {


    @Test

    public void testSuccessfulLogin() throws FileNotFoundException {

        readFromJson = new ReadFromJson();

        LoginPage loginPage = homePage.clickOnLogin();
        loginPage.loginFeature(readFromJson.readJsonFile().Login.ValidCredentials.Username,readFromJson.readJsonFile().Login.ValidCredentials.Password);
        //Assert.assertTrue(homePage.myAccountisdisplayed());


    }

    @Test

    public void testInvalidUserName() throws FileNotFoundException {

        readFromJson = new ReadFromJson();

        LoginPage loginPage = homePage.clickOnLogin();

        loginPage.loginFeature(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidUsername.Username,readFromJson.readJsonFile().Login.InvalidCredentials.InvalidUsername.Password);
    }

    @Test

    public void testInvalidPassword() throws FileNotFoundException {

        readFromJson = new ReadFromJson();
        LoginPage loginPage = homePage.clickOnLogin();
        loginPage.loginFeature(readFromJson.readJsonFile().Login.InvalidCredentials.InvalidPassword.Username ,readFromJson.readJsonFile().Login.InvalidCredentials.InvalidPassword.Password);


    }

}
