package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(name = "userName")
    private WebElement userNameTextField;

    @FindBy(name = "password")
    private WebElement passwordTextField;
    @FindBy(name = "submit")
    private WebElement submitButton;

    //Initializing the Page Objects:
    public LoginPage(){
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String userName){
        this.userNameTextField.sendKeys(userName);
    }

    public void enterPassword(String password){
        this.passwordTextField.sendKeys(password);
    }

    public void pressSubmitButton(){
        this.submitButton.click();
    }

}
