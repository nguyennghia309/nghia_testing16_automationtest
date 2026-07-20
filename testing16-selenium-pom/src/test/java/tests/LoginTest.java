package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.csvReader;

import java.util.List;
import java.util.Objects;

@Epic("OrangeHRM web")
@Feature("Authenticantion")

public class LoginTest extends BaseTest {
    @Story("login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login success with Admin username and *** password and redirect to dashboard page")
    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
//        khoi tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(getDriver(), getWait());

        String username = ConfigReader.get("admin.username");
        String password = ConfigReader.get("admin.password");

        loginPage.login(username, password);

//        kiem tra expected - actual result
        String currentUrl = getDriver().getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
    @Story("login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login fail with Admin username and *** password")
    @Test(description = "Test login fail")
    public void testLoginFail() throws  InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver(), getWait());
        loginPage.login("Admin", "admin1234");
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("auth/login"));
        Assert.assertFalse(currentUrl.contains("dashboard"));
    }
//    tao data provider
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws Exception{
        String filePath = "src/test/resources/loginData.csv";
        List<String[]> data = csvReader.readCsv(filePath);
        return csvReader.toDataProviderArray(data);


    }
    @Story("login")
    @Severity(SeverityLevel.NORMAL)
    @Description("Login with data provider")
    @Test(description = "test login data provider", dataProvider = "loginData")
    public void testDataLogin(String username, String password, String expectedResult) throws InterruptedException{
        LoginPage loginPage = new LoginPage(getDriver(), getWait());
        loginPage.login(username, password);

        if (expectedResult.equalsIgnoreCase("success")) {
            String currentUrl = getDriver().getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("dashboard"));
        } else {
            Assert.assertTrue(getDriver().getCurrentUrl().contains("auth/login"));
        }

    }
}