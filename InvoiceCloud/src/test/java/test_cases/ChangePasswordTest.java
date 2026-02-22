package test_cases;
import pages.LoginPage;
import pages.ChangePassword;
import org.testng.annotations.Test;
import utilities.test_data.Constant;
public class ChangePasswordTest extends BaseTest {

    LoginPage login ;
    ChangePassword changePassword ;

    @Test
    public void changePasswordTest() throws InterruptedException {
       login = new LoginPage();
       login.loginAsAdmin();  
       changePassword = new ChangePassword();
      
       changePassword.openChangePassword();
       System.err.println("First login Current Password: " + Constant.Current_Password);
        
     
       changePassword.changePassword(Constant.Current_Password, 
        Constant.New_Password,
         Constant.New_Password);
         Thread.sleep(5000);// 7lwa 5 seconds to ensure the password change process is complete

         System.err.println(" changed Current Password: " + Constant.Current_Password);
        System.err.println("changed New Password: " + Constant.New_Password);
    }

     
}