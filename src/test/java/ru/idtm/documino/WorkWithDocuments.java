package ru.idtm.documino;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class WorkWithDocuments {

    public static void tryToFindDocWithDescription(String description) {
        if ($(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).is(Condition.visible)) {

            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
            $(byXpath("//*[@id=\"desc\"]")).setValue(description);
            sleep(10000);
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
            sleep(1000);
        }
        else if ($("#desc").is(Condition.visible)) {
            $("#desc").setValue(description);
            sleep(10000); }


            if ($(byText("Распорядительные документы")).is(Condition.visible)) {

                $$(byText("Распорядительные документы"))
                        .first()
                        .click();
            } else if ($(byText("ОРД")).is(Condition.visible)){
                $$(byText("ОРД"))
                        .first()
                        .click();
            }else if ($(byText("Приказ")).is(Condition.visible)){
                $$(byText("Приказ"))
                        .first()
                        .click();
            }

        }

    public static void tryToFindDocWithRegNumber(String regNumber){
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(regNumber);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText("Распорядительные документы"))
                .first()
                .click();

    }


    public static void tryToFindDocWithSinger(String singer) {
        // ием по подписанту
        if ($(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).is(Condition.visible)) {

            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
            $(byXpath("//*[@id=\"desc\"]")).setValue(singer);
            sleep(10000);
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
            sleep(1000);
            if ($(byText("Распорядительные документы")).is(Condition.visible)) {

                $$(byText("Распорядительные документы"))
                        .first()
                        .click();
            }else if ($(byText("Приказ")).is(Condition.visible)){
                $$(byText("Приказ"))
                        .first()
                        .click();
            } else {
                $$(byText("ОРД"))
                        .first()
                        .click();
            }
        }else if ($("#desc").is(Condition.visible)) {
            $("#desc").setValue(singer);
            sleep(10000);

            if($(byText("Распорядительные документы")).is(Condition.visible)) {

                $$(byText("Распорядительные документы"))
                        .first()
                        .click();
            } else {
                $$(byText("ОРД"))
                        .first()
                        .click();
            }
        }

    }


    public static void tryToFindDoc(String text) {
        // ием по подписанту
        boolean visible = $(byText("Все задания")).isDisplayed();
        if (!visible) {
            $(byText("Мои задания")).click();
        }
        $(byText("Все задания")).click();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(text);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText(text))
                .first()
                .click();

    }
    public static void tryToFindDoc(String text, String description) {
        // ием по подписанту
        if (!($(byText("Все задания")).isDisplayed())) {
            $(byText("Мои задания")).click();
        }
        $(byText("Все задания")).click();
        if ($(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).is(Condition.visible)) {
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
            $(byXpath("//*[@id=\"desc\"]")).setValue(text);
            sleep(10000);
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
            sleep(1000);
            $$(byText(description))
                    .first()
                    .click();
        } else if ($("#desc").is(Condition.visible)) {
            $("#desc").setValue(text);
            sleep(10000);
            $$(byText(description))
                    .first()
                    .click();
        }

    }

    public static void visibleElement(String element) {
        boolean visible = $(byText(element)).isDisplayed();

        if (!visible) {
            $(byText("Мои задания")).click();
        }
    }
   public static void visibleElementWithText(String element, String text) {
        boolean visible = $(byText(element)).is(Condition.visible);

        if (!visible) {
            $(byText(text)).click();
        }else $(byText(element)).click();
    }
    public static void visibleElementWithXpath(String element, String text) {
        boolean visible = $(byXpath(element)).is(Condition.visible);

        if (!visible) {
            $(byXpath(text)).click();
        }else $(byXpath(element)).click();
    }
    public static void visibleElementWithXpathAndCss(String element, String text) {
        boolean visible = $(byXpath(element)).is(Condition.visible);
        if (visible) {
            $(byXpath(text)).click();

        }else  $(element).click();
    }
    //boolean visible = $(byXpath("//*[@id=\"Дата исполнения\"]")).is(Condition.visible);
//        if (visible) {
//            $(byXpath("//*[@id=\"Дата исполнения\"]")).click();
//
//        }else{ $("#period").click();}


}
