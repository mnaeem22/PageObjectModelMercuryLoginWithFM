package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage extends BasePage {


    @FindBy(name = "userName")
    public WebElement userNameTextField;

    @FindBy(name = "password")
    public WebElement passwordTextField;
    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")
    public WebElement successMessage;


    //Initializing the Page Objects:
    public LoginPage(){

        PageFactory.initElements(driver, this);
    }


    public void enterUserName(String userName){
       userNameTextField.sendKeys(userName);
    }

    public void enterPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void pressSubmitButton(){
        submitButton.click();
    }

    public void validateLoginSuccessfullyMessage(){
        String successMessageTextActual = this.successMessage.getText();
        String successMessageTestExpected = "Login Successfully";
        Assert.assertEquals(successMessageTestExpected,successMessageTextActual);
    }

}
