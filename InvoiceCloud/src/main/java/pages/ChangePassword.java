package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.NoSuchElementException;
import utilities.selenium.Driver_Factory;
import utilities.shared_Component.SharedMethods;

public class ChangePassword {

    protected WebDriver driver;
    WebDriverWait wait;

    public ChangePassword() {
        driver = Driver_Factory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }    //  Locators
    private WebElement userDropdown() {
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#page-loader > div")));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.dropdown-toggle")));
    }

    private WebElement changePasswordButton() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#page-loader > div")));
        return wait .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.change-password")));
    }
    private WebElement currentPassword() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#page-loader > div")));
return wait.until(
    ExpectedConditions.visibilityOfElementLocated(
        By.xpath("/html/body/div[5]/div/div/div[2]/form/div[2]/div/div/div/input")
    )
);
    }

    private WebElement newPassword() {
        return SharedMethods.waitForVisible(driver,
                driver.findElement(By.id("NewPassword")));
    }

    private WebElement confirmPassword() {
        return SharedMethods.waitForVisible(driver,
                driver.findElement(By.xpath("//*[@id=\"ConfirmNewPassword\"]")));
    }

    private WebElement saveButton() {
        return SharedMethods.waitForVisible(driver,
                driver.findElement(By.cssSelector("button.save-button")));
    }

    //  Actions
     public void clickElement(WebElement element) {
        SharedMethods.waitForVisible(driver, element);
        element.click();
    }
    public void openChangePassword()throws InterruptedException {
        userDropdown();
        userDropdown().click();
        changePasswordButton().click();
    }
    private WebElement Verification() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#page-loader > div")));
        return wait .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast.toast-success")));
    }
    public void changePassword(String currentPass,
                               String newPass,
                               String confirmPass)throws InterruptedException {
        currentPassword().clear();
        currentPassword().sendKeys(currentPass);
        driver.findElement(By.tagName("body")).click();
        Verification();

        newPassword().clear();
        newPassword().sendKeys(newPass);

        confirmPassword().clear();
        confirmPassword().sendKeys(confirmPass);

        saveButton().click();
    }
    
}
