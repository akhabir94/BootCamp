package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    public void setEmail() throws InterruptedException {
        email.sendKeys("prince_mafioso@hotmail.com");
        Thread.sleep(2000);
    }
    @FindBy(id = "pass")
    WebElement password;
    public void setPassword() throws InterruptedException {
        password.sendKeys("balsal69");
        Thread.sleep(2000);
    }
    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement login;
    public void setLogin() throws InterruptedException {
        login.click();
        Thread.sleep(2000);
    }
    @FindBy(name = "q")
    WebElement billgates;
    public void setBillgates() throws InterruptedException {
        billgates.sendKeys("billGates");
        Thread.sleep(2000);
    }
    @FindBy(css = "#js_1j > form > button > i")
    WebElement search;
    public void setSearch() throws InterruptedException {
        search.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "#js_3tc")
    WebElement photo_video;
    public void click_Photo_video() throws InterruptedException {
        photo_video.click();
        Thread.sleep(5000);
    }

}
