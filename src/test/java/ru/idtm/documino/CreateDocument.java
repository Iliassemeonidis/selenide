package ru.idtm.documino;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CreateDocument {
    
    public static void create(String documentName){
        if (!$(byText("Создать документ")).is(Condition.visible)) {
            UserChange.exit();
            UserChange.comInAutotest1();
        }

        $(byText("Создать документ")).click();
        sleep(10000);

        if ($(byText(documentName)).isDisplayed()) {
            $(byText(documentName)).click();

        }else {
           // $(byText("Создать документ")).click();
            $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog div.el-dialog__body div div.dialogue-container div.items-container div.scroll-wrap div.search-input-wrapper div.input-with-select.el-input input.el-input__inner").setValue(documentName);
            $$(byText(documentName)).first().click();
            sleep(10000);
        }
        if (!$(byText("Создать")).is(Condition.visible)) {

            $(byText("Создать")).scrollIntoView(true);
        }
        $(byText("Создать")).click();
    }
    public static void createDoc(String documentName,String otherNAme){
        if (!$(byText("Создать документ")).is(Condition.visible)) {
            UserChange.exit();
            UserChange.comInAutotest1();
        }
        $(byText("Создать документ")).click();

        sleep(10000);

        if ($(byText(documentName)).is(Condition.visible)) {
            $(byText(documentName)).click();

           sleep(1000);
            if ($$(byText(otherNAme)).size() > 3) {

                    $(byText(otherNAme)).click();
            }
        }else {
           // $(byText("Создать документ")).click();
            $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog div.el-dialog__body div div.dialogue-container div.items-container div.scroll-wrap div.search-input-wrapper div.input-with-select.el-input input.el-input__inner").setValue(documentName);

            sleep(10000);

            $(byText(documentName)).click();

            if ($(byText(otherNAme)).is(Condition.visible)) {

                $(byText(otherNAme)).click();
            }
            sleep(10000);
        }
        if (!$(byText("Создать")).is(Condition.visible)) {

            $(byText("Создать")).scrollIntoView(true);
        }
        $(byText("Создать")).click();
    }

    public static void create(String documentName, String otherNAme){
        if (!$(byText("Создать документ")).is(Condition.visible)) {
            UserChange.exit();
            UserChange.comInAutotest1();
        }
        $(byText("Создать документ")).click();
        sleep(1000);
        if ($(byText(documentName)).isDisplayed()) {
            $(byText(documentName)).click();
        }else {
            $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog div.el-dialog__body div div.dialogue-container div.items-container div.scroll-wrap div.search-input-wrapper div.input-with-select.el-input input.el-input__inner").setValue(documentName);
            if ($(byText(documentName)).is(Condition.visible)) {
                $$(byText(documentName)).first().click();

            } else {
                $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog div.el-dialog__body div div.dialogue-container div.items-container div.scroll-wrap div.search-input-wrapper div.input-with-select.el-input input.el-input__inner").setValue(otherNAme);
                $(byText(otherNAme)).click();
            }
            sleep(10000);
        }
        if (!($(byText("Создать")).is(Condition.visible))) {
            $(byText("Создать")).scrollIntoView(true);
        }
        $(byText("Создать")).click();
    }
    public static void createInDoc(String documentName, String documentName1){
        $(byText("Создать документ")).click();
        $(byText(documentName)).click();
        sleep(1000);
        $(byText(documentName1)).click();
        sleep(1000);
        if (!$(byText("Создать")).is(Condition.visible)) {

            $(byText("Создать")).scrollIntoView(true);
        }
        $(byText("Создать")).click();
    }


}
