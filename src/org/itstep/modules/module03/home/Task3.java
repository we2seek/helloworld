package org.itstep.modules.module03.home;

/**
 * Вывести все трехзначные числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
 */
public class Task3 {
    public static void main(String[] args) {
        int a, b, c, reverse, counter = 0;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 100 % 10;

            reverse = c * 100 + b * 10 + a;

            if (i == reverse) {
                System.out.println(i);
                counter++;
            }

        }
        System.out.println("Total: " + counter);
    }
}
