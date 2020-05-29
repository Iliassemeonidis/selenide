package ru.idtm.documino;


import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.util.Random;
import java.util.logging.Logger;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SedoTest {
    private final Logger log = Logger.getLogger(SedoTest.class.getName());
    private final String BUTTON = "Выбрать";
    private final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private final String CONTENT = "Контент";
    private final String INPUTDOCUMENT = "ИСХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String OUTPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String INTERNAL_DOCUMENTS = "ВНУТРЕННИЕ ДОКУМЕНТЫ";
    private final String ERRAND = "ИНИЦИАТИВНОЕ ПОРУЧЕНИЕ";
    private final String MEMORANDUM_TEST = "C3(тест)";
    private final String BOSS = "Босс11";
    private final String DOC = "test.txt";


    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests().succeededTests();

    @Test
    public void tess_90() {
        OpenBrowser.openUtl();
        sleep(10000);
        $(byXpath("/html/body/div/div[3]/form/div[1]/input")).setValue("Boss11").pressEnter();
        $(byXpath("/html/body/div/div[3]/form/div[2]/input")).setValue("1");
        $(byText("Войти")).click();
    }

    @Test
    public void test_91() {
        CreateDocument.create(INPUTDOCUMENT);
    }


    @Test  // заполняем обязательные поля
    public void test_92() {
        Buttons.requisites();
//        $(byText(REQUISITES)).click();
        //Подписант
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[9]/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
        $(byXpath("//*[@id=\"query\"]")).setValue("Босс11");
        $(byText("Главный специалист")).click();
        //путь к кнопке выбрать подписанта

        $$(PATH).findBy(text(BUTTON)).click();
        // заполняем поле Внешний адресат

        //$(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[16]/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
       // $(byXpath("//*[@id=\"fio\"]")).setValue("Иванов");
        $(byXpath("//*[@id=\"dsid_agent_person\"]")).setValue("Иванов");
        sleep(1000);
        $(byText("Иванов И. И.,-")).click();
//        $$(PATH).findBy(text(BUTTON)).click();
        // Краткое содержание
        $(byXpath("//*[@id=\"dss_description\"]")).setValue("Test");
        //сохраняем
        $(byText(CONTENT)).click();
    }

    @Test
    public void test_93() {
        // добавляем контент
        Content.content(DOC);
    }

    @Test
    public void test_94() {
        // сохраняем
        Buttons.save();
        sleep(500);

    }

    @Test
    public void test_95() {
        // проверяем что заполнились Регистрационный номер, Временный номер
        Buttons.requisites();
        sleep(500);


    }

    @Test
    public void test_96() {
        // скачиваем контент
        Buttons.content();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/button[1]")).click();
        sleep(1000);

    }

    @Test
    public void test_97() {
        // удаляем документ
        Buttons.delete();
        sleep(900);
    }

//    // Входящий документ

    @Test
    public void test_98() {
        CreateDocument.create(OUTPUTDOCUMENT);
    }

    @Test
    public void test_99() {
        //Проверка на дубли
        Random rd = new Random();
        //$(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
        //$(byXpath("//*[@id=\"fio\"]")).setValue("Иванов");
        $(byXpath("//*[@id=\"dsid_agent_person\"]")).setValue("Иванов");
        sleep(1000);
        $(byText("Иванов И. И.,-")).click();
        //$$(PATH).findBy(text(BUTTON)).click();
        $(byXpath("//*[@id=\"dss_crsp_reg_number\"]")).setValue(String.valueOf(rd.nextInt(201) + 10));
        $(byXpath("//*[@id=\"dsdt_crsp_reg_date\"]")).click();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div[12]")).click();

    }

    @Test
    public void test_100() {
        //Жмем кнопку далее
        $(byText("Далее")).click();
        sleep(1100);
    }


    @Test
    public void test_101() {
        // заполняем обязательные поля
        Buttons.requisites();
        RequiredFields.addressee("Босс11");
        RequiredFields.description("Auto-test");
    }

    @Test
    public void test_102() {
        // контент загружаем
        $(byText(CONTENT)).click();
        Content.content(DOC);
        sleep(1000);

    }

    @Test
    public void test_103() {
        //Жмем кнопку зарегистрировать
        Buttons.save();
        //$(byText("Зарегистрировать")).click();
        sleep(1000);
    }

    @Test
    public void test_104() {
        //Жмем кнопку зарегистрировать
//        Buttons.register();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/button")).click();
        //$(byText("Зарегистрировать")).click();
        sleep(10000);
    }

    @Test
    public void test_105() {
        // На Рассмотрение
        //Buttons.review(); переписать кнопку
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[2]/button")).click();
        sleep(10000);
    }


    @Test
    public void test_106() {
        Buttons.requisites();
        $$("div.form-item-container:nth-child(2) > div:nth-child(1) > div:nth-child(2)").findBy(text("В канцелярии"));
    }

    @Test
    public void test_107() {
        // задание
        Buttons.history();
        $(".table-scroll-bar").shouldHave(text("Предварительное рассмотрение"));
    }

    @Test
    public void test_108() {
        // На резолюцию
        test_98();
        test_99();
        test_100();
        test_101();
        test_102();
        test_103();
        test_104();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/button")).click();
        sleep(1000);
    }


    @Test
    public void test_109() {
        // проверка статус доркумента
        $$("div.form-item-container:nth-child(2) > div:nth-child(1) > div:nth-child(2)").findBy(text("В подразделении"));
    }

    @Test
    public void test_110() {
        // задание
        Buttons.history();
        $(".table-scroll-bar").shouldHave(text("Рассмотрение"));
    }

     //служебная записка
    @Test
    public void test_111() {
        CreateDocument.createInDoc(INTERNAL_DOCUMENTS, MEMORANDUM_TEST);
        Buttons.requisites();
    }

    @Test
    public void test_112() {
        //
        $$(byXpath("//*[@id=\"dsid_stamp\"]"))
                .first()
                .click();
        $(byText("Общего пользования")).click();

    }

    @Test
    public void test_113() {
        // описание
        RequiredFields.description("Служебка");
    }

    @Test
    public void test_114() {
        // адресат
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[10]/div/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
        //$(byXpath("//*[@id=\"query\"]")).setValue(BOSS);
        $(byText("Ведущий специалист")).click();
        sleep(1000);
        $$(PATH).findBy(text(BUTTON)).click();
    }

    @Test
    public void test_115() {
        // подписант
        $(byXpath("//*[@id=\"dsid_signer_empl\"]")).setValue("Босс11");
        sleep(1000);
        $(byText("Босс11 , Главный специалист, АО \"ПЭС\"")).click();
    }


    @Test
    public void test_116() {
        // контен
        $(byText(CONTENT)).click();
        Content.content(DOC);
        sleep(1000);
    }

    @Test
    public void test_117() {
        Buttons.save();
        sleep(1000);
        Buttons.content();
        sleep(1000);
    }

    @Test
    public void test_118() {
        // сохраняем док
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/button")).click();
        sleep(1000);
    }

    @Test
    public void test_119() {
        // нахолдим нашу служебку
        $(byText("Задания от меня")).click();
        $$(byText("Служебка"))
                .first()
                .click();
    }


//    @Test
//    public void test_120() {
////     история проверка нужного значения
//        Buttons.history();
//        $(".table-scroll-bar").shouldHave(text("Рассмотрение"));
//    }


    // Создание Исполнительного поручения

    @Test
    public void test_121() {
        CreateDocument.create(ERRAND);
        Buttons.requisites();
    }

    @Test
    public void test_122() {
        // заполняем поля
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
        $(byXpath("//*[@id=\"query\"]")).setValue(BOSS);
        $(byText("Главный специалист")).click();
        $$(PATH).findBy(text(BUTTON)).click();

        $(byXpath("//*[@id=\"dss_description\"]")).setValue("Auto-test");
        $(byXpath("//*[@id=\"dsdt_control_date\"]")).click();
        $(byText("5")).click();
    }


    @Test
    public void test_123() {
        Buttons.content();
        Content.content(DOC);
    }

    @Test
    public void test_124() {
        Buttons.save();
        sleep(1000);
        Buttons.requisites();
        sleep(1000);
    }


}
