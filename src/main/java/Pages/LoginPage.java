package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandles;

public class LoginPage extends MethodsHandles {

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    // locators

    private final By userNamefield = By.id("Email");


    private final By passwordfield = By.id("Password");

    private final By login_btn = By.cssSelector(".button-1.login-button");

    // Actions

    private void insertuserName(String email){

        sendKeys(userNamefield,3,email);
    }

    private void insertpassword(String password){

        sendKeys(passwordfield,3,password);


    }

    private void clickOnLoginButton(){

        click(login_btn,3);
    }

    public void loginFeature(String email , String password){

        insertuserName(email);
        insertpassword(password);
        clickOnLoginButton();
    }


}
