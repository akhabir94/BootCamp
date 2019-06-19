package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage extends CommonAPI {


    @FindBy(id = "signInBtn")
    WebElement username;

    public void setUsername(){
        username.click();
    }
}
