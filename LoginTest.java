package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private String browser;

    public LoginTest(String browser) {
        this.browser = browser;
    }

    @BeforeClass
    public void setUp() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void loadLoginPage() {
        driver.get("file:///C:/Users/umutk/OneDrive/Masa%C3%BCst%C3%BC/login_page/index.html"); // HTML dosyasının doğru yolunu girin
    }

    @Test
    public void testValidLogin() {
        performLogin("correctUsername", "correctPassword");

        // Giriş işlemi sonrası URL'yi bekleyelim
        wait.until(ExpectedConditions.urlToBe("file:///C:/Users/umutk/OneDrive/Masa%C3%BCst%C3%BC/login_page/home.html"));

        // URL'yi kontrol edelim
        Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/umutk/OneDrive/Masa%C3%BCst%C3%BC/login_page/home.html", "Tarayıcı: " + browser);
    }

    @Test
    public void testInvalidLogin() {
        performLogin("wrongUsername", "wrongPassword");

        // Hata mesajını bekleyelim ve kontrol edelim
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
        Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/umutk/OneDrive/Masa%C3%BCst%C3%BC/login_page/home.html", "Tarayıcı: " + browser);
    }

    private void performLogin(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
