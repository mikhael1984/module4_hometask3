package com.epam.bytya.module4_hometask3;

import com.epam.bytya.module4_hometask3.tests.wktsTestFirefox;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Mikhail_Mereminskiy on 8/12/2016.
 */
public class Highlighter {

    private static WebDriver webDriver = wktsTestFirefox.getDriver();

    public static void highlightWithJS(WebElement element) {
        String bg = element.getCssValue("backgroundColor");
        JavascriptExecutor js = ((JavascriptExecutor) webDriver);
        js.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
