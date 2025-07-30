import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BStackDemo {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void test() {
        driver.get("https://bstackdemo.com/");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("signin"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]/div/div[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='demouser']"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div/div[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='testingisfun99']"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-btn"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"1\"]/div[4]"))).click();


        WebElement produs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='iPhone 12']")));
        assertTrue(produs.isDisplayed());


        wait.until(ExpectedConditions.elementToBeClickable(By.className("buy-btn"))).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstNameInput"))).sendKeys("Brutaru");
        driver.findElement(By.id("lastNameInput")).sendKeys("Mihai");
        driver.findElement(By.id("addressLine1Input")).sendKeys("Strada Viilor");
        driver.findElement(By.id("provinceInput")).sendKeys("Oltenita");
        driver.findElement(By.id("postCodeInput")).sendKeys("917025");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout-shipping-continue"))).click();


        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation-message")));
        String actualMessage = message.getText();
        String expectedMessage = "Your Order has been successfully placed.";
        assertEquals(expectedMessage, actualMessage, "Textul nu este cel asteptat");


        WebElement orderText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/ol/li/div/div/div[2]")));
        String actualText = orderText.getText();
        assertTrue(actualText.contains("Your order number is"));


        WebElement totalPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout-app\"]/div/div/aside/article/section[2]/div/div/span[2]/span")));
        String actualTotalPrice = totalPrice.getText();
        assertEquals("$799.00", actualTotalPrice, "pretul este diferit");


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button"))).click();
    }

    @AfterEach
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
