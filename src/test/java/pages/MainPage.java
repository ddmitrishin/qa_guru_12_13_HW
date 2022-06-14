package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static tests.TestData.movieName;

public class MainPage {
    private final SelenideElement searchField = $(".styles_searchInputElement__qNbS4");
    private final SelenideElement onlineMovieButton = $(by("data-tid", "de7c6530"));
    private final SelenideElement movieNameButton = $(byText(movieName));
    private final SelenideElement movieNameText = $(by("data-tid", "75209b22"));
    private final SelenideElement ticketsMenu = $(by("data-tid", "6a319a9e"));
    private final SelenideElement tiketsMenuTitle = $(".level2");

    public void searchMovie(String movieName) {
        searchField.setValue(movieName).pressEnter();
    }

    public void pressOnMovieButton() {
        movieNameButton.click();
    }

    public void openOnlineTheatre() {
        onlineMovieButton.click();
    }

    public void checkMovieName() {
        movieNameText.shouldHave(text(movieName));
    }

    public void openTicketsMenu() {
        ticketsMenu.click();
    }

    public void checkTicketsMenuTitle() {
        tiketsMenuTitle.shouldHave(text("Билеты в кино"));
    }

}
