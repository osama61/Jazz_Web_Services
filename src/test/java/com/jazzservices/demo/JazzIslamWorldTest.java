    package com.jazzservices.demo;

    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.By;
    import static com.codeborne.selenide.Selenide.$;
    import static com.codeborne.selenide.Selenide.open;
    import static java.lang.Thread.sleep;

    public class JazzIslamWorldTest {

        @Test
        void islamWorldSubUnsub() throws InterruptedException {
            open("http://islamworld.com.pk/phone");
            sleep(10000);

            $(By.cssSelector("input[placeholder='3xx xxxx xxx']")).sendKeys("3260754992");
            sleep(1000);

            $(By.xpath("//button[normalize-space()='Get PIN']")).click();
            sleep(30000);

            $(By.xpath("//button[normalize-space()='Confirm']")).click();
            sleep(30000);

            $(By.cssSelector("#dropdownMenu2")).click();
            sleep(3000);

            $(By.xpath("//button[normalize-space()='UNSUBSCRIBE']")).click();
            sleep(2000);

        }
    }
