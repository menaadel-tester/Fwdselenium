package register;

import Pages.RegisterPage;
import Pages.RegisterResultPage;
import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.ReadFromJson;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertTrue;

public class RegisterTest extends BaseTest {

    @Test
    public void testRegister() throws FileNotFoundException {

        readFromJson = new ReadFromJson();
        RegisterResultPage registerResultPage = new RegisterResultPage(driver);


        RegisterPage registerPage = homePage.clickOnRegister();
        registerPage.registerFeature(readFromJson.readJsonFile().Register.firstName,readFromJson.readJsonFile().Register.lastName,readFromJson.readJsonFile().Register.email,readFromJson.readJsonFile().Register.password,readFromJson.readJsonFile().Register.confirmpassword);
       assertTrue(registerResultPage.registerCompletionisDisplayed());


    }
}
