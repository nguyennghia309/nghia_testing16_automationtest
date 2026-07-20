package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends pages.BasePage {
    private static final By USER_INPUT = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private static final By USER_ROLE_SELECT = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    //    <div
//        data-v-40acfd38=""
//        data-v-13cf171c=""
//        role="listbox"
//        class="oxd-select-dropdown --positon-bottom"
//        loading="false"
//    >
//        <div
//            data-v-d130bb63=""
//            data-v-13cf171c=""
//            role="option"
//            class="oxd-select-option">-- Select --
//        </div>
//        <div
//            data-v-d130bb63=""
//            data-v-13cf171c=""
//            role="option"
//            class="oxd-select-option --selected"
//        >
//        <span data-v-13cf171c="">Admin</span>
//        </div>
//        <div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option">
//            <span data-v-13cf171c="">ESS</span>
//        </div>
//    </div>
    private static final By ADMIN_ROLE_OPTION = By.xpath("//div[@role='option']//span[text()='Admin']");
    private static final By SEARCH_BUTTON = By.xpath("//button[@type='submit']");
    private static final By dataRows = By.xpath("//div[@class='oxd-table-card']");
    private static final By RECORD_COUNT_TEXT = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span");

    public AdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public  void open() {
        Allure.step("Open admin page", () -> {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
//        doi den khi xuat hien element userInput thi step tiep theo
//        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_INPUT));
////        doi den khi load dday du cac element tren page
//        wait.until(driver -> ((JavascriptExecutor)driver).
//                executeScript("return document.readyState").
//                equals("complete");
            wait.until(ExpectedConditions.visibilityOfElementLocated(USER_INPUT));
        });
    }

    public void enterUsername(String username) throws InterruptedException {
        Allure.step("Enter username: " + username, () -> {
            WebElement userInput = driver.findElement(USER_INPUT);
            highlight(userInput);

            userInput.sendKeys(username);
            unhighlight(userInput);
            Thread.sleep(2000);
        });
    }

    public void selectUserRole(String role) throws InterruptedException {
        Allure.step("Select user role: " + role, ()-> {
            WebElement roleSelect = driver.findElement(USER_ROLE_SELECT);
            highlight(roleSelect);
            roleSelect.click();
            unhighlight(roleSelect);

            String xpath = "//div[@role='option']//span[text() ='" + role + "']";
            WebElement adminRoleOption = driver.findElement(By.xpath(xpath));
            highlight(adminRoleOption);
            adminRoleOption.click();
            unhighlight(adminRoleOption);
            Thread.sleep(2000);
        });
    }

    public void clickSearchBtn() throws InterruptedException {
        Allure.step("Click search button", () -> {
            WebElement searchBtn = driver.findElement(SEARCH_BUTTON);
            highlight(searchBtn);
            searchBtn.click();
            Thread.sleep(2000);
            unhighlight(searchBtn);
        });
    }

    public void filterByUser(String username, String role) throws InterruptedException {
        enterUsername(username);
        selectUserRole(role);
        clickSearchBtn();
    }

    public Boolean checkNumberOfRecord() {
        return Allure.step("check number of record", () ->{
//            WebElement recordCountText = driver.findElement(RECORD_COUNT_TEXT);
            WebElement recordCountText = wait.until(ExpectedConditions.visibilityOfElementLocated(RECORD_COUNT_TEXT));
            String text = recordCountText.getText();
            int countRecord = Integer.parseInt(text.replaceAll("\\D+", ""));
            System.out.println("Number of record: " + countRecord);

            int countDataRows = driver.findElements(dataRows).size();
//        findElement: tra ve list cacs element -> list<WebElement>

            return countRecord == countDataRows;
        });
    }
}