package utilities.shared_Component;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SharedMethods {


    private static int TIMEOUT = 60;


    public static WebElement waitForVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Wait a moment to ensure the page scrolls and loads any new content
        try {
            Thread.sleep(4000); // Sleep for 4 seconds to let the page load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
