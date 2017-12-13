package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleg Olekseenko (olekseenkoo3@gmail.com)
 * @version 1.5
 * @since 21.11.2017
 */

public class DummyBotTest {

        public void whenGreetBot() {
            DummyBot bot = new DummyBot();
            assertThat(
                    bot.answer("Привет, Бот."),
                    is("Привет, умник."));
        }

        public void whenByuBot() {
            DummyBot bot = new DummyBot();
            assertThat(
                    bot.answer("Пока."),
                    is("До скорой встречи."));
        }
        public void whenUnknownBot() {
            DummyBot bot = new DummyBot();
            assertThat(
                    bot.answer("Сколько будет 2 + 2?"),
                    is("Это ставит меня в тупик. Спросите другой вопрос."));
        }
   }