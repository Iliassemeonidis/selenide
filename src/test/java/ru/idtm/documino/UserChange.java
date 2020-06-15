package ru.idtm.documino;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class UserChange {

    public static void exit() {
        sleep(10000);
        $("button.el-tooltip:nth-child(4)").click();
        boolean visible = $(byText("Выход")).isDisplayed();
        if (!visible) {
            $("button.el-tooltip:nth-child(5)").click();
            visible = $(byText("Выход")).isDisplayed();
            if (!visible) {
                $("button.el-tooltip:nth-child(3)").click();
            }
        }
        sleep(1000);
        $(byText("Выход")).click();


    }

    public static void comInBoss11() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss11").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss12() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss12").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss51() {
        sleep(1000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss51").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss31() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss31").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss32() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss32").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInClerk2() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Clerk2").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInClerk3() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Clerk3").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss21() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss21").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest1() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Autotest1").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest2() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Autotest2").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest3() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Autotest3").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest4() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Autotest4").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest5() {
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Autotest5").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }


}
