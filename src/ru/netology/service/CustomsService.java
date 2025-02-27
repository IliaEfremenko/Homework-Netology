package ru.netology.service;

public class CustomsService {

    public static final int POSHLINA_MASS = 100;

    public static int calculateCustoms(int price, int mass) {
        int poshlina = price / 100 + POSHLINA_MASS * mass;
        return poshlina;
    }
}
