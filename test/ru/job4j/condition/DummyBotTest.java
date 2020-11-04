package ru.job4j.condition;



import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        DummyBot db = new DummyBot();
        assertThat(db.answer("Привет, Бот"), is("Привет, умник."));
    }

    @Test
    public void whenByeBot() {
        DummyBot db = new DummyBot();
        assertThat(db.answer("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenUnknownBot() {
        DummyBot db = new DummyBot();
        assertThat(db.answer("Что ты думаешь о j4 j?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }

}