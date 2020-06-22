package ru.idtm.documino;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CreateDocument {
    
    public static void create(String documentName){
        $(byText("Создать документ")).click();
        boolean visible = $(byText(documentName)).isDisplayed();
        if (visible) {
            $(byText(documentName)).click();
        }else {
           // $(byText("Создать документ")).click();
            $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog div.el-dialog__body div div.dialogue-container div.items-container div.scroll-wrap div.search-input-wrapper div.input-with-select.el-input input.el-input__inner").setValue(documentName);
            $$(byText(documentName)).first().click();
            sleep(10000);
        }

        $(byText("Создать")).click();
    }
    public static void createInDoc(String documentName, String documentName1){
        $(byText("Создать документ")).click();
        $(byText(documentName)).click();
        sleep(1000);
        $(byText(documentName1)).click();
        sleep(1000);
        $(byText("Создать")).click();
    }


}
