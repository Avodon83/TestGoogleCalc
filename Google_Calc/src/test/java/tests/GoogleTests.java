package tests;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTests {

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='j93WEe']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='N10B9']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='lVjWed']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='qCp9A']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='KN1kY']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='xAP7E']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).sendKeys("", Keys.ENTER);

        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).sendKeys("", Keys.ENTER);
        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='abcgof']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).sendKeys("", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).sendKeys("", Keys.ENTER);

        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).sendKeys("", Keys.ENTER);
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test3(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='aN1RFf']")).sendKeys("", Keys.ENTER);

        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).sendKeys("", Keys.ENTER);
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @AfterAll
    public static void shutdown(){
        driver.quit();
    }

}
