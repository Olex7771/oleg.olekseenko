package ru.job4j.condition;
/**
 * @author Oleg Olekseenko( olekseenkoo#gmail.com)
 * @version 1.5
 * @since 13.12.2017
 */
public class DummyBot {

    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "До скорой встречи.";
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        }
        return rsl;
    }
}
