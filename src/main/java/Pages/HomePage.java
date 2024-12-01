package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandles;

public class HomePage extends MethodsHandles {


    public HomePage(WebDriver driver){
        super(driver);


    }

    // locators

    private final By loginLink = By.xpath("//a[@class='ico-login']");

    private final By registerLink = By.linkText("Register");

    private final By myAccount = By.cssSelector(".ico-account");


    // Action on locators
    public LoginPage clickOnLogin(){
        click(loginLink,10);

        return new LoginPage(driver);

    }

    public RegisterPage clickOnRegister(){

        click(registerLink,3);
        return new RegisterPage(driver);

    }

    public boolean myAccountisdisplayed(){

        return webElement(myAccount).isDisplayed();




    }


}
