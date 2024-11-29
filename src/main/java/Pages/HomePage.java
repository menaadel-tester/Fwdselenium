package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandles;

public class HomePage extends MethodsHandles {


    public HomePage(WebDriver driver){
        super(driver);


    }

    // locators

    private final By loginLink = By.linkText("Log in");

    // Action on locators
    public LoginPage clickOnLogin(){
        click(loginLink,3);

        return new LoginPage(driver);

    }


}
