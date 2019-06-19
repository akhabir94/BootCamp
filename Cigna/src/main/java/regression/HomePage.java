package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

 @FindBy (xpath = "//*[@id=\"includes-content\"]/nav/ul/li[2]/a")
    WebElement login;
 public void setLogin() throws InterruptedException {
     login.click();
     Thread.sleep(3000);
 }

}
