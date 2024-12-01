package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandles;

public class RegisterPage extends MethodsHandles {
    public RegisterPage(WebDriver driver) {

        super(driver);

    }
    //locators

    private final By genderField = By.id("gender-male");

    private final By firstNameField = By.id("FirstName");

    private final By lastNameField = By.id("LastName");

    private final By EmailField = By.xpath("(//input[@type='email'])[1]");

    private final By PasswordField = By.xpath("(//input[@type='password'])[1]");

    private final By confirmPasswordField = By.id("ConfirmPassword");

    private final By register_Btn = By.cssSelector(".button-1.register-next-step-button");

    // Actions

    private void clickOnGender(){

        click(genderField,3);


    }
    private void insertFirstName(String firstName){

        sendKeys(firstNameField,3,firstName);
    }
    private void insertLastName(String lastName){

        sendKeys(lastNameField,3,lastName);
    }

    private  void insertEmail(String email){

        sendKeys(EmailField,3,email);
    }

    private void insertPassword(String password){

        sendKeys(PasswordField,3,password);
    }

    private void insertConfirmPassword(String confirmpassword){
        sendKeys(confirmPasswordField,3,confirmpassword);
    }

    public RegisterResultPage clickOnRegisterBtn(){
        click(register_Btn,3);
        return new RegisterResultPage(driver);

    }

    public void registerFeature(String firstName, String lastName, String email, String password, String confirmpassword){

        clickOnGender();
        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(email);
        insertPassword(password);
        insertConfirmPassword(confirmpassword);
        clickOnRegisterBtn();



    }

}
