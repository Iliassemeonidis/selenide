package ru.idtm.documino;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Buttons {
    private final static String REQUISITES = "Реквизиты";
    private final static String SAVE = "Сохранить";
    private final static String DELETE = "Удалить";
    private final static String CONTENT = "Контент";
    private final static String CONSIDERATION = "НА РАССМОТРЕНИЕ";
    private final static String REGISTER = "Зарегистрировать";
    private final static String REVIEW = "На Рассмотрение";
    private final static String HISTORY = "История";
    private final static String AGREEMENT = "На согласование";
    private final static String REVERT = "Вернуть";
    private final static String BRING_BACK= "Отправить повторно";
    private final static String ALL_TASKS= "Все задания";
    private final static String COMPLETE = "Завершить";
    private final static String REJECT = "Отклонить";
    private final static String FOR_ALL_WHO_ARE_NOT = "Всем, кто не согласовал на текущем этапе";
    private final static String APPROVE = "Согласовать";
    private final static String TO_SING = "На подписание";
    private final static String SING = "Подписать";
    private final static String CREATE_RESOLUTION = "Создать резолюцию";
    private final static String EXECUTE = "Исполнить";
    private final static String PRINT_CART = "Печать карточки";
    private final static String CONTINUE = "Продолжить";

    public static void requisites(){ $(byText(REQUISITES)).click(); }
    public static void clickContinue(){ $(byText(CONTINUE)).click(); }

    public static void save(){ $(byText(SAVE)).click(); }
    public static void delete(){ $(byText(DELETE)).click(); }
    public static void content(){ $(byText(CONTENT)).click(); }
    public static void consideration(){
        $(byText(CONSIDERATION)).click();
    }
    public static void register(){ $(byText(REGISTER)).click(); }
    public static void review(){ $(byText(REVIEW)).click(); }
    public static void history(){ $(byText(HISTORY)).click(); }
    public static void agreement(){ $(byText(AGREEMENT)).click(); sleep(1000); }
    public static void revert(){ $(byText(REVERT)).click(); }
    public static void bringBack(){ $(byText(BRING_BACK)).click(); }
    public static void allTasks(){ $(byText(ALL_TASKS)).click(); sleep(1000);}
    public static void complete(){ $(byText(COMPLETE)).click(); sleep(10000);}
    public static void reject(){ $(byText(REJECT)).click(); sleep(1000);}
    public static void forAllWhoAreNot(){ $(byText(FOR_ALL_WHO_ARE_NOT)).click(); sleep(10000);}
    public static void approve(){ $(byText(APPROVE)).click(); sleep(10000);}
    public static void toSing(){ $(byText(TO_SING)).click(); sleep(1000);}
    public static void sing(){ $(byText(SING)).click(); sleep(10000);}
    public static void createResolution(){ $(byText(CREATE_RESOLUTION)).click(); sleep(1000);}
    public static void execute(){ $(byText(EXECUTE)).click(); sleep(10000);}
    public static void printCart(){ $(byText(PRINT_CART)).click(); sleep(1000);}


}
