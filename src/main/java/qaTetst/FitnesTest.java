// Generated by Selenium IDE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import org.junit.jupiter.api.Test;
import qaTetst.WebDriverSettings;

import java.net.MalformedURLException;
import java.net.URL;
public class FitnesTest extends WebDriverSettings {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Test
    public void FitnesTest1() {
        // Открыть сайт "Фитнес-клуб "
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice2//qa_tester/module03/practice2/");
        // Раскрыть на весь экран
        driver.manage().window().setSize(new Dimension(1920, 1080));
        // Кликнуть на инпут "ВАШЕ ИМЯ"
        driver.findElement(By.name("name")).click();
        // Ввести в инпут имя "VITAMIN"
        driver.findElement(By.name("name")).sendKeys("vitamin");
        // Кликнуть на инпут рост
        driver.findElement(By.name("height")).click();
        // Ввести в инпут рост "180"
        driver.findElement(By.name("height")).sendKeys("180");
        // Кликнуть на инпут вес
        driver.findElement(By.name("weight")).click();
        // Ввести в инпут вес "80"
        driver.findElement(By.name("weight")).sendKeys("80");
        // Нажать на "Enter"
        driver.findElement(By.name("weight")).sendKeys(Keys.ENTER);
        // Закрыть браузер
        driver.close();
    }
    @Test
    public void fitnesTest3() {
        // Открыть сайт "Фитнес-клуб "
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice2//qa_tester/module03/practice2/");
        // Раскрыть на весь экран
        driver.manage().window().setSize(new Dimension(1920, 1080));
        // Кликнуть на инпут "ВАШЕ ИМЯ"
        driver.findElement(By.name("name")).click();
        // Ввести в инпут имя "VITAMIN"
        driver.findElement(By.name("name")).sendKeys("vitamin");
        // Кликнуть на инпут рост
        driver.findElement(By.name("height")).click();
        // Ввести в инпут рост "170"
        driver.findElement(By.name("height")).sendKeys("170");
        // Кликнуть на инпут вес
        driver.findElement(By.name("weight")).click();
        // Ввести в инпут вес "40"
        driver.findElement(By.name("weight")).sendKeys("40");
        // Нажать на "Enter"
        driver.findElement(By.name("weight")).sendKeys(Keys.ENTER);
        // Проверяем  значение  ИМТ
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".user-info"));
            assert(elements.size() > 0);
        }
        // Закрыть браузер
        driver.close();
    }
    @Test
    public void fitnesTest2() {
        // Открыть сайт "Фитнес-клуб "
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice2//qa_tester/module03/practice2/");
        // Раскрыть на весь экран
        driver.manage().window().setSize(new Dimension(1920, 1080));
        // Кликнуть на инпут "ВАШЕ ИМЯ"
        driver.findElement(By.name("name")).click();
        // Ввести в инпут имя "VITAMIN"
        driver.findElement(By.name("name")).sendKeys("vitamin");
        // Кликнуть на инпут рост
        driver.findElement(By.name("height")).click();
        // Ввести в инпут рост "180"
        driver.findElement(By.name("height")).sendKeys("160");
        // Кликнуть на инпут вес
        driver.findElement(By.name("weight")).click();
        // Ввести в инпут вес "80"
        driver.findElement(By.name("weight")).sendKeys("100");
        // Нажать на кнопку"Получить предложения"
        driver.findElement(By.id("get-offer")).click();
        // Закрыть браузер
        driver.close();
    }
}

