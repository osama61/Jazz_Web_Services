package com.jazzservices.demo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class JazzIslamWorldTest {

    @BeforeAll
    static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        Configuration.browser = "chrome";
        Configuration.browserCapabilities = options;
    }

    @Test
    void islamWorldSubUnsub() {
        open("http://islamworld.com.pk/phone");
        sleep(3000);

        SelenideElement phoneInput = $(By.cssSelector("input[placeholder='3xx xxxx xxx']"));
        phoneInput.shouldBe(visible).sendKeys("3095854562");

        $(By.xpath("//button[normalize-space()='Get PIN']")).shouldBe(visible).click();
        sleep(25000);

        // Wait for the Confirm button to appear before clicking it
        $(By.xpath("//button[normalize-space()='Confirm']")).shouldBe(visible).shouldBe(clickable).click();
        sleep(15000);

        $(By.cssSelector("#dropdownMenu2")).shouldBe(visible).click();

        $(By.xpath("//button[normalize-space()='UNSUBSCRIBE']")).shouldBe(visible).click();
    }
}
