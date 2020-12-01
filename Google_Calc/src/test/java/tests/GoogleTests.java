package tests;

import org.junit.After;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Control_Calc;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTests {

    private static WebDriver driver;
    private static Control_Calc searchPage;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new Control_Calc(driver);
    }

    @BeforeEach
    public void setup(){
        driver.get("https://google.com");
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1(){
        searchPage.search("Калькулятор");
        searchPage.buttonBracket();
        searchPage.buttonDigit1();
        searchPage.buttonPlus();
        searchPage.buttonDigit2();
        searchPage.buttonEndBracket();
        searchPage.buttonMultiply();
        searchPage.buttonDigit3();
        searchPage.buttonMinus();
        searchPage.buttonDigit4();
        searchPage.buttonDigit0();
        searchPage.buttonDivide();
        searchPage.buttonDigit5();
        searchPage.buttonEqual();
        assertAll (
                () -> assertEquals("1",searchPage.getResult())
        );
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2(){
        searchPage.search("Калькулятор");
        searchPage.buttonDigit6();
        searchPage.buttonDivide();
        searchPage.buttonDigit0();
        searchPage.buttonEqual();
        assertAll (
                () -> assertEquals("Infinity",searchPage.getResult())
        );
    }

    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test3(){
        searchPage.search("Калькулятор");
        searchPage.buttonSin();
        searchPage.buttonEqual();
        assertAll (
                () -> assertEquals("Error",searchPage.getResult())
        );
    }

    @AfterAll
    public static void shutdown(){
        driver.quit();
    }

}
