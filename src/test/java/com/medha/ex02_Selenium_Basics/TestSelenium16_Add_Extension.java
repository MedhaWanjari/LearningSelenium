package com.medha.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Add_Extension {

    @Description("Option class")
    @Test
    public void test_Selenium16() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1000");
        edgeOptions.addExtensions(new File("src/test/java/com/medha/ex02_Selenium_Basics/adblock1.crx"));
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Medha Wanjari\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        // driver.manage().deleteAllCookies();

    }



    }

