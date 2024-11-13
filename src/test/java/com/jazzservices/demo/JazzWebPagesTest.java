package com.jazzservices.demo;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class JazzWebPagesTest {

    @Test
    public void HETest() throws InterruptedException {

        // Jazz Islam World
        open("http://islamworld.com.pk/landing");
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
        Selenide.sleep(30000);
        String JIWHe = executeJavaScript("return document.querySelector(\"input[placeholder='3xx xxxx xxx']\").value;");
        System.out.println("Islam World HE Number is: " + JIWHe);

        $(By.xpath("//button[normalize-space()='Get PIN']")).click();
        sleep(40000);

        $(By.xpath("//button[normalize-space()='Confirm']")).click();
        sleep(60000);

        $(By.cssSelector("#dropdownMenu2")).click();
        sleep(5000);

        $(By.xpath("//button[normalize-space()='UNSUBSCRIBE']")).click();
        sleep(10000);

    }


}
