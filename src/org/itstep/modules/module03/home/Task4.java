package org.itstep.modules.module03.home;

/**
 * Посчитать количество (и вывести на экран) все возможные варианты счистливых билетиков. (abcdef, a+b+c = d+e+f)
 */
public class Task4 {
    public static void main(String[] args) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < 10; a++)
            for (int b = 0; b < 10; b++)
                for (int c = 0; c < 10; c++)
                    for (int d = 0; d < 10; d++)
                        for (int e = 0; e < 10; e++)
                            for (int f = 0; f < 10; f++)
                                if (a + b + c == d + e + f) {
                                    counter++;
                                }
                                /*if ((a + b + c) > 9 || (d + e + f) > 9) {
                                    if (((a + b + c) % 10 + (a + b + c) / 10) == ((d + e + f) % 10 + (d + e + f) / 10)) {
                                        sb.setLength(0);
                                        sb.append(a);
                                        sb.append(b);
                                        sb.append(c);
                                        sb.append(d);
                                        sb.append(e);
                                        sb.append(f);
                                        System.out.println(sb.toString());
                                        counter++;
                                    }
                                } else {
                                    if ((a + b + c) == (d + e + f)) {
                                        sb.setLength(0);
                                        sb.append(a);
                                        sb.append(b);
                                        sb.append(c);
                                        sb.append(d);
                                        sb.append(e);
                                        sb.append(f);
                                        System.out.println(sb.toString());
                                        counter++;
                                    }
                                }*/
        System.out.println(counter);
    }
}
