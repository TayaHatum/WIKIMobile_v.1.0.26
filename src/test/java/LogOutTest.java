import com.telran.model.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void preconditions(){
        app.user().skipWizard();
        app.user().clickOnMenuButton();
        if (!app.user().takeUserName().contains("Hatum")){

            app.user().goToLoginForm();
            app.user().fillLoginForm(new User().withfName("hatum.testing").withPassword("Hatum12344$"));
            app.user().clickLoginButton();
        }

    }
    @Test
    public void testLogOut(){
        app.user().logout();

    }
}
