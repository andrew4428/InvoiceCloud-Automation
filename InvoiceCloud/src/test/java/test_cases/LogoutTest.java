package test_cases;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.LoginPage;
import pages.Logout;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutTest() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.loginAsAdmin();
        Logout logout = new Logout();
        logout.performLogout();
          String expectedUrl = "https://cqc.yalla.online:9092/Account/Login";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
