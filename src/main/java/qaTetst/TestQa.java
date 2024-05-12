package qaTetst;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestQa extends WebDriverSettings {

    @Test
    public void Test1() {
        driver.get("https://dev.by/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='navbar__toggler']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@class='menu__input-search form-control-plaintext h-100 w-100 d-block']"));
    }
    @Test
    public void Test2() {
        driver.get("https://dev.by/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='navbar__toggler']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@class='menu__input-search form-control-plaintext h-100 w-100 d-block']"));
    }
    @Test
    public void Test3() throws InterruptedException {
        // Открыть сайт "Фитнес-клуб "
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice2/");
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
    }

}
