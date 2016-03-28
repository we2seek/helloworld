package org.itstep.modules.module06.classwork;

/**
 * Created by timchenko on 28.03.2016.
 */
public class Task2 {
    public static int recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return n % 10 + recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(508)); // вызов рекурсивной функции
    }
}
