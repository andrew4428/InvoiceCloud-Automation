package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.selenium.Driver_Factory;
import utilities.shared_Component.SharedMethods;
import utilities.test_data.Constant;
public class LoginPage {

    protected WebDriver driver;


    public LoginPage() {
        driver = Driver_Factory.getDriver();
    }


    // Locators

    private WebElement change(){
        WebElement change = driver.findElement(By.linkText("Change"));
        return  SharedMethods.visibilityOfElementLocated(driver,change);
    }

    private WebElement username(){
        WebElement username = driver.findElement(By.xpath("//*[@name = 'UsernameOrEmailAddress']"));
        return  SharedMethods.visibilityOfElementLocated(driver,username);
    }

    private WebElement password(){
        WebElement password = driver.findElement(By.xpath("//*[@name = 'Password']"));
        return  SharedMethods.visibilityOfElementLocated(driver,password);
    }

    private WebElement loginBtn(){
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id = 'LoginButton']"));
        return  SharedMethods.visibilityOfElementLocated(driver,loginBtn);
    }





    // Actions

    public void clickOnChange(){
        change().click();
    }

    public void enterUserName(String userName){
        username().sendKeys(userName);
    }

    public  void enterPassword(String password){
        password().sendKeys(password);
    }


    public void clickOnLoginBtn(){
        loginBtn().click();
    }



    public void loginAsAdmin(){
        enterUserName(Constant.ADMIN_USERNAME);
        enterPassword(Constant.Current_Password);
        clickOnLoginBtn();
    }


    public void loginAsTenantAdmin(){


    }










}
