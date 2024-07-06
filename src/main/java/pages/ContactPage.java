package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage  extends BasePage{

    @FindBy(id="title")
    private WebElement titleField;
    @FindBy(id="description")
    private WebElement descriptionField;


    @FindBy(id="SubmitButton")
    private WebElement SubmitButton;
    public ContactPage(WebDriver driver){
        super(driver);
    }

    public void enterTitle(String title){
        titleField.sendKeys(title);

    }

    public void enterDescription(String description){
        descriptionField.sendKeys(description);

    }

    public void clickSubmitButton(){
        SubmitButton.click();

    }

    public void Submit(String title,String description){
        enterTitle(title);
        enterDescription(description);
        clickSubmitButton();

    }
}
