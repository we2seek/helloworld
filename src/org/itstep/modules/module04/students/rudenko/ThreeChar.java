package org.itstep.modules.module04.students.rudenko;

public class ThreeChar {
    public static void main(String[] args) {
        int b, c, d;
        int j = 0;
        for (int i = 100; i <= 999; i++) {
            b = i / 100;
            c = i % 100 / 10;
            d = i % 100 % 10;
            if (b != c) {
                if (b != d) {
                    if (c != d) {
                        j++;
                        System.out.println(i);
                    }
                }
            }

        }
        System.out.println("Не повторяющихся чисел" + j);
    }
}



