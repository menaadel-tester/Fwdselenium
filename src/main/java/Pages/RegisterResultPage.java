package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandles;

public class RegisterResultPage extends MethodsHandles {

    public RegisterResultPage(WebDriver driver){

        super(driver);

    }


    // locators

    private final By register_completion = By.xpath("//div[text()='Your registration completed']");

    // Actions

    public boolean registerCompletionisDisplayed(){

        return webElement(register_completion).isDisplayed();
    }


}
