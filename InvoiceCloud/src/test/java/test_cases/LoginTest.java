package test_cases;

import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTest extends BaseTest {

    LoginPage login ;

    @Test
    public void loginWithValidDataAsAdmin() throws InterruptedException
        {
         login = new LoginPage();
         login.loginAsAdmin();
            Thread.sleep(10000);
         
    }





}
