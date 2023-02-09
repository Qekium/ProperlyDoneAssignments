package com.qekium;

import java.util.Scanner;

public class Converter { // Конвертер градусов Цельсия в Фаренгейты
    public static void main(String[] args) { // Доработать бы. Прикрутить else-if,
        System.out.println("Введите °С: ");  // сделать обратный Ф в С, все через сканер.
        Scanner c = new Scanner(System.in);
        double f = c.nextDouble() * 1.8 + 32;
        System.out.println("Ваш результат в °F: \n" + f);
    }
}
