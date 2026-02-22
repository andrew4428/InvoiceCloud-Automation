package test_cases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.selenium.Driver_Factory;
import pages.ChangePassword;
import utilities.test_data.Constant;
public class LoginTest extends BaseTest {

    LoginPage login ;
    ChangePassword changePassword ;

    @Test
    public void loginWithValidDataAsAdmin() throws InterruptedException
        {
         login = new LoginPage();
         login.loginAsAdmin();
            Thread.sleep(10000);
         
    }





}
