package ru.netology.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.page.PaymentPageAccept;
import ru.netology.page.PaymentPageDecline;

import static com.codeborne.selenide.Selenide.open;

public class PositiveTests {
    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @BeforeEach
    public void setUp() {
        open("http://localhost:8080");
        Configuration.holdBrowserOpen = true;
    }

    @Test // пользователь ввел валидные данные во все поля - операция д. б. одобрена банком
    public void shouldGetBankAcceptance() {
        var paymentPageAccept = new PaymentPageAccept();
    }

    @Test // пользователь ввел валидные данные во все поля - операция д. б. отклонена банком
    public void shouldRGetBankRejection() {
        var paymentPageDecline = new PaymentPageDecline();
    }
}
