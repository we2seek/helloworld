package org.itstep.modules.module03.home;

/**
 * Вывести все трехзначные числа, у которых цифры не повторяются и посчитать их количество.
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b, c, counter = 0;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 10;

            if (a != b && a != c && b != c) {
                System.out.println(i);
                counter++;
            }

        }
        System.out.println("Total: " + counter);
    }
}
