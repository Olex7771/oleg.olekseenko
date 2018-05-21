package ru.job4j.calculator;

public class Count {
    public int add(int finish) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            int sum = 0;
            sum = sum + i;
            }
        return finish;
    }
}