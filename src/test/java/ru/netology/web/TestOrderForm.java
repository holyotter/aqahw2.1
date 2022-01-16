package ru.netology.web;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestOrderForm {
    void shouldAccepted() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Виталий Петров-Белых");
        $("[data-test-id=phone] input").setValue("+79998338383");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно " +
                "отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}

