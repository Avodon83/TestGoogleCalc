package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Control_Calc {

    public Control_Calc(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
