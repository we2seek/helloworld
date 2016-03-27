package org.itstep.modules.module03.home;

/**
 * Посчитать количество (и вывести на экран) все возможные варианты счистливых билетиков. (abcdef, a+b+c = d+e+f)
 */
public class Task4_1 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, counter = 0, temp;
        for (int i = 0; i < 1000000; i++) {
            temp = i;
            a = temp / 100000;
            temp %= 100000;
            b = temp / 10000;
            temp %= 10000;
            c = temp / 1000;
            temp %= 1000;

            d = temp / 100;
            temp %= 100;

            e = temp / 10;
            f = temp % 10;

            /*if ((a + b + c) > 9 || (d + e + f) > 9) {
                if ((a + b + c) % 10 + (a + b + c) / 10 == (d + e + f) % 10 + (d + e + f) / 10) {
                    counter++;
                    System.out.println(i);
                }

            } else if ((a + b + c) == (d + e + f)) {
                counter++;
                System.out.println(i);
            }*/
            if ((a + b + c) == (d + e + f)) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Total: " + counter);
    }
}
