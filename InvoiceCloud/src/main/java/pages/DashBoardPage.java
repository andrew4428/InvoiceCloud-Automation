package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.selenium.Driver_Factory;
import utilities.shared_Component.SharedMethods;

public class DashBoardPage {

    protected WebDriver driver;


    public DashBoardPage() {
        driver = Driver_Factory.getDriver();
    }

    // Locators
    private WebElement tenantSideMenu (){
        WebElement tenantSideMenu = driver.findElement(By.linkText("Tenants"));
        return SharedMethods.visibilityOfElementLocated(driver,tenantSideMenu);
    }
}
