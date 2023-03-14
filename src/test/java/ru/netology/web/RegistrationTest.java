package ru.netology.web;

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
//        $$(".tab-item").find(exactText("По номеру счёта")).click();
//        $("[name='number']").setValue("4055 0100 0123 4613 8564");
//        $("[name='phone']").setValue("+792000000000");
//        $$("button").find(exactText("Продолжить")).click();
//        $(withText("Успешная авторизация")).shouldBe(visible, Duration.ofMillis(5000));
//        $(byText("Личный кабинет")).shouldBe(visible, Duration.ofMillis(5000));

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

