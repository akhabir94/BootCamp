package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[3]")
    WebElement politics;
    public void setPolitics(){
        politics.click();
    }

    @FindBy (xpath = "//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[2]/a")
    WebElement congress;
    public void setCongress(){
        congress.click();
    }
}
