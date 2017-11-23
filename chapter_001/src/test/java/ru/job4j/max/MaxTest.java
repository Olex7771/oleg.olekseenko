package ru.job4j.max;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
public class MaxTest {

public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2,  3);
        assertThat(result, is(2));
}
}