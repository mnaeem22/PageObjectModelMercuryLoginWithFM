package specs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import utils.Utils;

public class LoginTestPage {

    @BeforeMethod
    public  void setup() {
        BasePage.initialize();
    }

    @Test(description = "Validate Login")
    public static void ValidateLoginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName(Utils.userName);
        loginPage.enterPassword(Utils.password);
        loginPage.pressSubmitButton();
    }

    @AfterMethod
    public static void cleanUp(){
        BasePage.terminate();
    }

}
