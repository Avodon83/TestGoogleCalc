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
        buttonEqual.sendKeys("", Keys.ENTER);
    }

    public void buttonBracket() {
        buttonBracket.sendKeys("", Keys.ENTER);
    }

    public void buttonEndBracket() {
        buttonEndBracket.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit0() {
        buttonDigit0.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit1() {
        buttonDigit1.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit2() {
        buttonDigit2.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit3() {
        buttonDigit3.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit4() {
        buttonDigit4.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit5() {
        buttonDigit5.sendKeys("", Keys.ENTER);
    }

    public void buttonDigit6() {
        buttonDigit6.sendKeys("", Keys.ENTER);
    }

    public void buttonPlus() {
        buttonPlus.sendKeys("", Keys.ENTER);
    }

    public void buttonMinus() {
        buttonMinus.sendKeys("", Keys.ENTER);
    }

    public void buttonDivide() {
        buttonDivide.sendKeys("", Keys.ENTER);
    }

    public void buttonMultiply() {
        buttonMultiply.sendKeys("", Keys.ENTER);
    }

    public void buttonSin() {
        buttonSin.sendKeys("", Keys.ENTER);
    }
}
