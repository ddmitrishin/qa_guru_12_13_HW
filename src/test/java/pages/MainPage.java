package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement landuageSelector = $(".language-selector__current");
    private final SelenideElement landuageENSelector = $(".language-selector__goto-language");
    private final SelenideElement mainTitle = $(".hero__title");
    private final SelenideElement partnersButton = $(withText("Все наши партнёры"));
    private final SelenideElement aboutCompanyButton = $(byText("О компании"));
    private final SelenideElement feedbackButton = $(byText("Отзывы"));

    public void changeLanguageToEn() {
        landuageSelector.click();
        landuageENSelector.click();
    }

    public void checkEnLanguage() {
        mainTitle.shouldHave(text("Software development"));
    }

    public void openPartnersPage() {
        partnersButton.click();
    }

    public void chooseFeedbackPage() {
        aboutCompanyButton.hover();
        feedbackButton.click();
    }

}
