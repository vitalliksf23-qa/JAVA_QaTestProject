package qaTetst;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @BeforeEach
    public void start() {
        System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver-win64");
        driver = new ChromeDriver();
        System.out.println("test_start");
    }

    @AfterEach
    public void close() {
        driver.quit();
        System.out.println("test_close");
    }
}

