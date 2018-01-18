package ru.job4j.loop;

public class Counter {

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (start % 2 == 0) {
                sum = +start;
            }
        }
        return sum;
    }
}
