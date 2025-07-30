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

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class saucedemo {

    WebDriver driver;

    @BeforeAll
    static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        WebElement produs = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        assertTrue(produs.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
        driver.findElement(By.xpath("//*[@class='product_sort_container']\n")).click();
        driver.findElement(By.xpath("//option[@value='hilo']")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Brutaru");
        driver.findElement(By.id("last-name")).sendKeys("Mihai");
        driver.findElement(By.id("postal-code")).sendKeys("917025");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String actualMessage = message.getText();
        String expectedMessage = "Thank you for your order!";
        assertEquals(expectedMessage, actualMessage, "Textul nu este cel asteptat");


    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }


}
