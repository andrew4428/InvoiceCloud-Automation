package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import utilities.selenium.Driver_Factory;

public class BaseTest {

    protected WebDriver driver;

  @BeforeMethod
public void setUp() {
    Driver_Factory.initDriver();    
    driver = Driver_Factory.getDriver();
    driver.get("https://cqc.yalla.online:9092/Account/Login");
}
 @AfterMethod
    public void tearDown() {
       Driver_Factory.quitDriver();
    }

   
}
