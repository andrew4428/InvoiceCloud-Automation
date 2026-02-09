package utilities.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver_Factory {

    private static WebDriver driver;

    // Create Chrome driver ONLY
    private static WebDriver chromeDriverConfig() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        // If you need headless
        // options.addArguments("--headless=new");

        return new ChromeDriver(options);
    }

    //  GET driver
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = chromeDriverConfig();
        }
        return driver;
    }


    // Quit driver properly
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;   // Allow fresh start for next test
        }
    }
}
