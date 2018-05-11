package ru.job4j.calculator;

public class Fit {
    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double rls = (height - 100) * 1.15;

        return rls;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double  rls = (height - 110) * 1.15;
        return rls;
    }
}