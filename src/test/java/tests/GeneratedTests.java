package tests;

import helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'Разработка программного обеспечения • Прикладные технологии'", () -> {
            String expectedTitle = "Разработка программного обеспечения • Прикладные технологии";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @DisplayName("Change language")
    void searchMovieTest() {
        step("Change language", () -> {
            mainPage.changeLanguageToEn();
        });

        step("Check title language", () -> {
            mainPage.checkEnLanguage();
        });
    }

    @Test
    @DisplayName("Open partners page")
    void openPartnersPageTest() {
        step("Press on 'Our Partners'", () -> {
            mainPage.openPartnersPage();
        });

        step("Check partners page title", () -> {
            partnersPage.checkPartnersTitle();
        });
    }

    @Test
    @DisplayName("Open Feedback page")
    void ticketsMenuOpenTest() {
        step("Press on 'Feedback' button", () -> {
            mainPage.chooseFeedbackPage();
        });

        step("Check 'Feedback' page title", () -> {
            feedbackPage.checkFeedbackTitle();
        });
    }
}