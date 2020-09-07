package ru.idtm.documino;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class UserChange {

    public static void exit() {
        sleep(10000);
        $("button.el-tooltip:nth-child(4)").click();
        if (!$(byText("Выход")).isDisplayed()) {
            $("button.el-tooltip:nth-child(5)").click();
            if (!$(byText("Выход")).isDisplayed()) {
                $("button.el-tooltip:nth-child(3)").click();
            }
        }
        sleep(1000);
        $(byText("Выход")).click();


    }

    public static void comInBoss11() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss11").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss12() {
        sleep(10000);
        $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss12").pressEnter();
        $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss51() {
        sleep(1000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss51").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss31() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss31").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss32() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss32").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInClerk2() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Clerk2").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInClerk3() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Clerk3").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInBoss21() {
        sleep(10000);
        $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Boss21").pressEnter();
        $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest1() {
        sleep(10000);

        $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Autotest1").pressEnter();
        $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest2() {
        sleep(10000);
        $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Autotest2").pressEnter();
        $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest3() {
        sleep(10000);
        $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Autotest3").pressEnter();
        $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest4() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Autotest4").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }

    public static void comInAutotest5() {
        sleep(10000);
       $("div.m-b-16:nth-child(1) > input:nth-child(1)").setValue("Autotest5").pressEnter();
       $("div.m-b-16:nth-child(2) > input:nth-child(1)").setValue("1");
        $(byText("Войти")).click();
        sleep(1000);
    }


}
