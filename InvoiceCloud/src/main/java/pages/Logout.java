package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import utilities.selenium.Driver_Factory;
import utilities.shared_Component.SharedMethods;

public class Logout {
    protected WebDriver driver;
    WebDriverWait wait ;

    public Logout() {
        driver = Driver_Factory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

// Locators

private WebElement Logo() {
        
        WebElement logo = driver.findElement(By.linkText("Invoice Cloud"));
        return SharedMethods.visibilityOfElementLocated(driver, logo);
    }
    private WebElement headerDropdown() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#page-loader > div")));
        // WebElement dropdown = driver.findElement(By.cssSelector("a.dropdown-toggle"));
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.dropdown-toggle")));
         }

    private WebElement logoutButton() {
        WebElement logout = driver.findElement(By.cssSelector("a.logout"));
        return SharedMethods.visibilityOfElementLocated(driver, logout);
    }
    private WebElement logoutPopup() {
    WebElement popup = driver.findElement(By.cssSelector("div.logout-popup"));   
    return SharedMethods.visibilityOfElementLocated(driver, popup);}

 
    private WebElement confirmLogoutButton() {
    WebElement confirm = driver.findElement(By.cssSelector("button.swal-button--confirm"));
    return SharedMethods.visibilityOfElementLocated(driver, confirm);}

// Actions
  public void clickElement(WebElement element) {
        SharedMethods.visibilityOfElementLocated(driver, element);
        element.click();
    }

    public void clickConfirmLogout() {
    clickElement(confirmLogoutButton());}
    
    public void performLogout()  {
        clickElement(headerDropdown());
        clickElement(logoutButton());
        clickConfirmLogout();
        
    }
}
