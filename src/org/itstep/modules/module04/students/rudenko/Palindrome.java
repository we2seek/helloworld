package org.itstep.modules.module04.students.rudenko;

/**
 * Created by Санек on 22.03.2016.
 */
public class Palindrome {
    public static void main(String[] args) {
        int a, b;
        int j = 0;
        for (int i = 100; i <= 999; i++) {
            a = i / 100;
            b = i % 100 % 10;

            if (a == b) {
                j++;
                System.out.println(i);
            }

        }
        System.out.println("Всего полиндромов" + j);
    }

}
