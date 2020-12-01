package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Control_Calc {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    @FindBy(css = "span[jsname='VssY5c']")
    public WebElement Result;

    @FindBy(css = "div[jsname='Pt8tGc']")
    public WebElement buttonEqual;

    @FindBy(css = "div[jsname='j93WEe']")
    public WebElement buttonBracket;

    @FindBy(css = "div[jsname='qCp9A']")
    public WebElement buttonEndBracket;

    @FindBy(css = "div[jsname='bkEvMb']")
    public WebElement buttonDigit0;

    @FindBy(css = "div[jsname='N10B9']")
    public WebElement buttonDigit1;

    @FindBy(css = "div[jsname='lVjWed']")
    public WebElement buttonDigit2;

    @FindBy(css = "div[jsname='pPHzQc']")
    public WebElement buttonDigit3;

    @FindBy(css = "div[jsname='xAP7E']")
    public WebElement buttonDigit4;

    @FindBy(css = "div[jsname='Ax5wH']")
    public WebElement buttonDigit5;

    @FindBy(css = "div[jsname='abcgof']")
    public WebElement buttonDigit6;

    @FindBy(css = "div[jsname='XSr6wc']")
    public WebElement buttonPlus;

    @FindBy(css = "div[jsname='pPHzQc']")
    public WebElement buttonMinus;

    @FindBy(css = "div[jsname='WxTTNd']")
    public WebElement buttonDivide;

    @FindBy(css = "div[jsname='KN1kY']")
    public WebElement buttonMultiply;

    @FindBy(css = "div[jsname='aN1RFf']")
    public WebElement buttonSin;

    public Control_Calc(WebDriver driver) {
        initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }

    public String getResult() {
        return Result.getText();
    }

    public void buttonEqual() {
        buttonEqual.click();
    }

    public void buttonBracket() {
        buttonBracket.click();
    }

    public void buttonEndBracket() {
        buttonEndBracket.click();
    }

    public void buttonDigit0() {
        buttonDigit0.click();
    }

    public void buttonDigit1() { buttonDigit1.click(); }

    public void buttonDigit2() {
        buttonDigit2.click();
    }

    public void buttonDigit3() {
        buttonDigit3.click();
    }

    public void buttonDigit4() {
        buttonDigit4.click();
    }

    public void buttonDigit5() {
        buttonDigit5.click();
    }

    public void buttonDigit6() {
        buttonDigit6.click();
    }

    public void buttonPlus() {
        buttonPlus.click();
    }

    public void buttonMinus() {
        buttonMinus.click();
    }

    public void buttonDivide() {
        buttonDivide.click();
    }

    public void buttonMultiply() {
        buttonMultiply.click();
    }

    public void buttonSin() {
        buttonSin.click();
    }
}
