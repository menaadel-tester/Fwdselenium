package basetest;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.RegisterResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import reader.ReadFromJson;

import java.io.FileNotFoundException;
import java.util.List;

public class BaseTest {

   protected WebDriver driver;

   ChromeOptions chromeOptions; // to add chrome headless options

   EdgeOptions edgeOptions ; // to add edge headless options

    FirefoxOptions firefoxOptions ;

    protected HomePage homePage ;

    protected ReadFromJson  readFromJson ; // to read URL from test Data Json File


@Parameters("browser")
   @BeforeClass

    public void setUp(String browser){

    setupBrowsers(browser);

      // driver =  new ChromeDriver();
       driver.manage().window().maximize();
       homePage = new HomePage(driver);


   }

   // to implement the headless running mode or parallel Executions

   @Parameters("browser")

   public void setupBrowsers(String browser){

       if(browser.equalsIgnoreCase("chrome")){

           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("headlessChrome")) {
           chromeOptions = new ChromeOptions();
           chromeOptions.addArguments("--headless");
           driver = new ChromeDriver(chromeOptions);


       } else if (browser.equalsIgnoreCase("edge")) {
           driver = new EdgeDriver();

       } else if (browser.equalsIgnoreCase("headlessEdge")) {

           edgeOptions = new EdgeOptions();
           edgeOptions.addArguments("--headless");
           driver = new EdgeDriver(edgeOptions);



       } else if (browser.equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();

       } else if (browser.equalsIgnoreCase("headlessFirefox")) {
           firefoxOptions = new FirefoxOptions();
           firefoxOptions.addArguments("--headless");
           driver = new FirefoxDriver(firefoxOptions);

       }

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
