package com.medha.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium08 {
    @Description("open the url")
    @Test
    public void test_Selenium08() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Medha Wanjari\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver(); // ChromeDriver()
        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
