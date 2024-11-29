package basetest;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import reader.ReadFromJson;

import java.io.FileNotFoundException;

public class BaseTest {

   protected WebDriver driver;

    protected HomePage homePage ;

    protected ReadFromJson  readFromJson ; // to read URL from test Data Json File


   @BeforeClass

    public void setUp(){

       driver =  new ChromeDriver();
       driver.manage().window().maximize();
       homePage = new HomePage(driver);



   }

   @BeforeMethod

   public void goHome() throws FileNotFoundException {

       readFromJson = new ReadFromJson(); // Take Object

       driver.get(readFromJson.readJsonFile().URL); //
   }




   @AfterClass

    public void tearDown(){

       driver.quit();

   }
}
