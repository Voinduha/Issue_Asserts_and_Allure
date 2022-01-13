package ru.ya.danvu;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void afterEach() {
        WebSteps WebSteps = new WebSteps();
        WebSteps.attachPageSource();
    }
}