package com.facebook.abc.gtl.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static WebElement findElement(String xpath) {
        return  DriverManager.getInstance().getDriver().findElement(By.xpath(xpath));
    }

    public static void openUrl(String url) {
        DriverManager.getInstance().getDriver().get(url);
    }

    public static void clickElement(String xpath) {
        findElement(xpath).click();
    }

    public static void sendKeysIntoBox(String xpath, String inputValue) {
        findElement(xpath).sendKeys(inputValue);
    }
}
