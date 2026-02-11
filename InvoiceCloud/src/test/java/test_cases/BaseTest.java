package test_cases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.selenium.Driver_Factory;
import utilities.test_data.EnvConfig;


public class BaseTest {

   protected  WebDriver driver ;



    @BeforeMethod
    public void setUp() {
        driver = Driver_Factory.getDriver();
        driver.get("https://cqc.yalla.online:9092/Account/Login");



    }

    @AfterMethod
    public void tearDown(){
        Driver_Factory.quitDriver();
    }




}

