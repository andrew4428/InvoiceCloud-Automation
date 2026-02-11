package test_cases;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    LoginPage login = new LoginPage();



    @Test
    public void loginWithValidDataAsAdmin()
        {
         login.loginAsAdmin();
    }




}
