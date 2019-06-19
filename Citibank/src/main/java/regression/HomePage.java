package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"creditcards\"]")
    WebElement creditcards;

    public void setCreditcards() {
        creditcards.click();
    }

}
