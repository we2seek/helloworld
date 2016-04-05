package org.itstep.modules.module03.students.nazarenko;

/**
 * Вывести все трехзначные числа, у которых цыфры не повторяются и посчитать количество таких чисел. (% /)
 */
public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int a;
        int b;
        int c;
        for (int i = 100; i <1000; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 100 % 10;
            if (a != b && a != c && b != a && b != c && c != a && c != b) {
                sum++;
            }
        }
        System.out.print("Quantity is: " + sum);
    }
}
