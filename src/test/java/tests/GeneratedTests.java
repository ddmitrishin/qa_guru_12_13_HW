package tests;

import helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.movieName;


public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.kinopoisk.ru/'", () ->
                open("https://www.kinopoisk.ru/"));

        step("Page title should have text 'Кинопоиск. Все фильмы планеты.'", () -> {
            String expectedTitle = "Кинопоиск. Все фильмы планеты.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.kinopoisk.ru/'", () ->
                open("https://www.kinopoisk.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @DisplayName("Search movie")
    void searchMovieTest() {
        step("Enter movie name", () -> {
            mainPage.searchMovie(movieName);
        });

        step("Press on movie name", () -> {
            mainPage.pressOnMovieButton();
        });

        step("Check movie name", () -> {
            mainPage.checkMovieName();
        });
    }

    @Test
    @DisplayName("Open online theatre")
    void openOnlineTheatreTest() {
        step("Press on online Theatre", () -> {
            mainPage.openOnlineTheatre();
        });

        step("Check Online Theatre Title", () -> {
            onlineTheatrePage.checkOnlineThetreTitle();
        });
    }

    @Test
    @DisplayName("Check tickets menu")
    void ticketsMenuOpenTest() {
        step("Press on tickets menu", () -> {
            mainPage.openTicketsMenu();
        });

        step("Check tickets menu title", () -> {
            mainPage.checkTicketsMenuTitle();
        });
    }
}