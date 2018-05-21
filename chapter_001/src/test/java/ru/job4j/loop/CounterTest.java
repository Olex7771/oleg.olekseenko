package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.calculator.Count;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Count counter = new Count();
        int result = counter.add(30);//напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        assertThat(result, is(30));
    }
}