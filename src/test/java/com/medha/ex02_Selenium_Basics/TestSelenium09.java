package com.medha.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Description;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import static org.assertj.core.api.Assertions.*;

public class TestSelenium09 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Medha Wanjari\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        // AsseertJ Validation
        //assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();


    }


}
