package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OnlineTheatrePage {
    private static final SelenideElement mainOnlineTheatreTitle = $(".MainDefault__title--267Ku");

    public void checkOnlineThetreTitle(){
        mainOnlineTheatreTitle.shouldHave(text("Фильмы и сериалы по подписке Плюс Мульти"));
    }
}
