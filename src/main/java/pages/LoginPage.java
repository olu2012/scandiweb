package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id="username")
    private WebElement usernameField;
    @FindBy(id="password")
    private WebElement passwordField;


    @FindBy(id="loginButton")
    private WebElement loginButton;
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUsername(String username){
        usernameField.sendKeys(username);

    }

    public void enterPassword(String password){
        usernameField.sendKeys(password);

    }

    public void clickLoginButton(){
        loginButton.click();

    }

    public void login(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();

    }
}
