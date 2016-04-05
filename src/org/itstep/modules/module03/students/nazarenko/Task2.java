package org.itstep.modules.module03.students.nazarenko;

/**
 * Найти числа-палиндромы (101 == 101). Вывести их и посчитать количество.
 */
public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int a;
        int b;
        int c;
        for (int i = 100; i <1000; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 100 % 10;
            if (a == c && a != b && b != c || a==c & b==c & c==a ) {
                System.out.println("Polynomial are: "+ i);
                sum++;
            }
        }
        System.out.print("Quantity is: " + sum);
    }
}
