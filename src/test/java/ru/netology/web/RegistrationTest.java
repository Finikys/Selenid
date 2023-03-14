package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class RegistrationTest {
    @Test
    void shouldRegisterByAccountNumberDOMModification() {
        open("http://localhost:9999");
        $("[placeholder='Город']").setValue("Волгоград");
        $("[placeholder='Дата встречи']").sendKeys(Keys.CONTROL + "a");
        $("[placeholder='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $("[placeholder='Дата встречи']").setValue("31032023");
        $("[name='name']").setValue("Бирюков Александр");
        $("[name='phone']").setValue("+79999999999");
        $("[class='checkbox__box']").click();
        $("[class='button__text']").click();
        $("[class='notification__title']").shouldBe(visible, Duration.ofSeconds(12));
    }
}

