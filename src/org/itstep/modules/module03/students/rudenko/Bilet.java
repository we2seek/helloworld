package org.itstep.modules.module03.students.rudenko;

/**
 * Created by Санек on 22.03.2016.
 */
public class Bilet {
    public static void main(String[] args) {
        int a, b, c, d, e, p, l, m, n = 0;
        for (int i = 0; i <= 999; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 100 % 10;
            d = a + b + c;
            for (int j = 0; j <= 999; j++) {
                p = j / 100;
                l = j % 100 / 10;
                m = j % 100 % 10;
                e = p + l + m;
                if (d == e) {
                    n++;
                    System.out.printf("%03d%03d", i, j);
                    //System.out.printf("%03d%n03d%n", i, j); //System.out.printf("%07d", 7845); // --> "0007845"
                    System.out.println();
                }
            }


        }
        System.out.println("Всего счастливых билетов" + n);
    }

}


