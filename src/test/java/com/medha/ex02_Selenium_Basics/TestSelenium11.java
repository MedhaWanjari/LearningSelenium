package com.medha.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {
    @Description
    @Test
    public void test_Selenium11() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //WebDriver driver1 = new ChromeDriver();
        //driver1 = new FirefoxDriver();

        driver.quit();

    }

}
