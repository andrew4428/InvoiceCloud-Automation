package utilities.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver_Factory {

    private static WebDriver driver;

    // 🔹 Initialize Driver
    public static void initDriver() {

        if (driver == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
    }

    // 🔹 Get Driver
    public static WebDriver getDriver() {

        if (driver == null) {
            initDriver();  
        }

        return driver;
    }

    // 🔹 Quit Driver
    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;   
        }
    }
}
