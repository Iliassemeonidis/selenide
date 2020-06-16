package ru.idtm.documino;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class RequiredFields {
    private final static String BUTTON = "Выбрать";
    private final static String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";


    public static void description(String text) {
        boolean visible = $(byXpath("//*[@id=\"dss_description\"]")).isDisplayed();
        if (visible) {
            $(byXpath("//*[@id=\"dss_description\"]")).setValue(text);
        }else{
//            visible = $("#dss_description").isDisplayed();
            $("#dss_description").setValue(text);
        }


    }

    public static void addressee(String text) {
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[11]/div/div/div[1]/div/div/div/div/div/div/div[1]/button")).click();
        $(byXpath("//*[@id=\"query\"]")).setValue(text);
        $(byText("Главный специалист"))
                .click();
        $$(PATH).findBy(text(BUTTON)).click();

    }
    public static void addressee(String name, String emploer, String fulleName) {
        boolean visblle = $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[11]/div/div/div[1]/div/div/div/div/div/div/div[1]/button")).isDisplayed();
        if (visblle) {

            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[11]/div/div/div[1]/div/div/div/div/div/div/div[1]/button")).click();
            $(byXpath("//*[@id=\"query\"]")).setValue(name);
            $(byText(emploer))
                    .click();
            $$(PATH).findBy(text(BUTTON)).click();
        }else{
            visblle = $(byXpath("//*[@id=\"drid_addressee_empl\"]")).is(visible);
            if (visblle) {
                $(byXpath("//*[@id=\"drid_addressee_empl\"]")).setValue(name);
            } else {
                visblle = $("#dsid_main_performer_empl").is(visible);
                if (visblle) {
                    $("#dsid_main_performer_empl").setValue(name);
                } else
                    $("#drid_addressee_empl").setValue(name);
            }
            sleep(1000);
            $(byText(fulleName)).click();

        }

        visblle = $("#dsdt_control_date").isDisplayed();
        if (visblle) {
            $("#dsdt_control_date").click();
            $(byText("5")).click();
        }


    }
    public static void signatory(String text) {
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[11]/div/div/div[1]/div[1]/div/div/div/div/div[1]/button")).click();
        $(byXpath("//*[@id=\"query\"]")).setValue(text);
        $(byText("Главный специалист"))
                .click();
        $$(PATH).findBy(text(BUTTON)).click();

    }

    public static void completeFieldsForProactiveAssignments(String name,String fulleName) {
        $("#dsid_main_performer_empl").setValue(name);
        $(byText(fulleName)).click();
       $("#dsdt_control_date").click();
       $(byText("5")).click();
    }


}
