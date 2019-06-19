package regressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import regression.HomePage;
import regression.SignOnPage;

public class TestSignOnPage extends CommonAPI {
    SignOnPage signOnPage;
    String url = "https://online.citi.com/US/login.do";
    @BeforeClass
    public void init(){
        signOnPage = PageFactory.initElements(driver,SignOnPage.class);

    }

    @AfterMethod
    public void recap(){
        driver.get(url);
    }

    @Test(enabled = true)
    public void setSignOnPage_account(){
        signOnPage.setUsername();
    }
}
