package fields;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Fields {
    private static final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private static final String BUTTON = "Выбрать";
    private static boolean visible;

    public static void agreement(String shortName, String department, String longName) {
        // Согласующий
        visible = $(byXpath("//div[@class='column-container']//div[4]//div[2]//div[1]//div[1]//div[3]//button[1]//div[1]//*[local-name()='svg']")).is(Condition.visible);

        if (visible) {
            $(byXpath("//div[@class='column-container']//div[4]//div[2]//div[1]//div[1]//div[3]//button[1]//div[1]//*[local-name()='svg']")).click();

            visible = $(byXpath("//div[contains(@class,'input-wrapper')]//div[contains(@class,'user-list-container')]//div//div[@class='el-tooltip']//*[local-name()='svg']")).is(Condition.visible);

            if (visible) {

                $(byXpath("//div[contains(@class,'input-wrapper')]//div[contains(@class,'user-list-container')]//div//div[@class='el-tooltip']//*[local-name()='svg']")).click();
            }
            boolean dis = $(byXpath("//*[@id=\"branchId\"]")).isDisplayed();
            if (dis) {
                $(byXpath("//*[@id=\"branchId\"]")).click();
                $(byText("Тестовый Филиал")).click();
                sleep(1000);
            }
            dis = $(byXpath("//*[@id=\"query\"]")).isDisplayed();

            if (dis) {
                $(byXpath("//*[@id=\"query\"]")).setValue(shortName).pressEnter();
                sleep(1000);
                $(byText(department)).click();
                $$(PATH).findBy(text(BUTTON)).click();
            } else {
                $$(PATH).findBy(text(BUTTON)).click();
                $("#selectedUsers").setValue(shortName);
                $(byText(longName)).click();
            }
            $(byText("Добавить")).click();


        } else {
            visible = $("#approvers").is(Condition.visible);

            if (visible) {
                $("#approvers").setValue(shortName);
                $(byText(longName)).click();
            }
        }

        boolean save = $(byXpath("/html/body/div[6]/div/div[3]/span/button[1]")).isDisplayed();
        if (!save) {
            $$(byText("Сохранить")).shouldHaveSize(7)
                    .get(6)
                    .click();
        } else $(byXpath("/html/body/div[6]/div/div[3]/span/button[1]")).click();

        sleep(1000);

    }


    public static void checking(String shortName, String department) {
        // прверяющий
        visible = $("#term").is(Condition.visible);
        if (visible) {
            $("#term").setValue("2");
        }
        $(".layout-icon").click();
        $(byXpath("//*[@id=\"branchId\"]")).setValue("Тестовый Филиал");
        $(byText("Тестовый Филиал")).click();
        sleep(1000);
        $(byXpath("//*[@id=\"query\"]")).setValue(shortName).pressEnter();
        sleep(1000);
        $(byText(department)).click();
        $$(PATH).findBy(text(BUTTON)).click();
    }


    public static void singer(String shortName, String department, String longName) {

        boolean visible = $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[9]/div/div/div/div[1]/div/div/div/div/div[1]/button")).isDisplayed();
        if (visible) {
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[9]/div/div/div/div[1]/div/div/div/div/div[1]/button")).click();
            $("div.input-select-container:nth-child(3) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)").click();
            sleep(1000);
            $(byXpath("//*[@id=\"query\"]")).setValue(shortName);
            sleep(1000);

            $(byXpath("//*[@id=\"branchId\"]")).setValue("Тестовый Филиал");
            $(byText("Тестовый Филиал")).click();
            $(byText(department)).click();
            $$(PATH).findBy(text(BUTTON)).click();
        } else {
            $("#dsid_signer_empl").setValue(shortName);
            $(byText(longName)).click();
        }
    }

}
