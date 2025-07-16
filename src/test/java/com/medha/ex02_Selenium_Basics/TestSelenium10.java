package com.medha.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10 {
    @Description
    @Test
    public void test_Selenium10() throws Exception{
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Medha Wanjari\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().minimize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visbile");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
            throw new Exception("CURA Healthcare Service is not visible");

        }

        driver.quit();
    }
}
