package org.itstep.modules.module02.students.rudenko;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        for (; ; ) {

            System.out.println("Введите целое число ");
            if (scanner.hasNext()) {
                a = scanner.next();
                if (a.equals("Exit")) {
                    break;
                } else {
                    int i = Integer.parseInt(a);
                    if (i % 2 == 0) {
                        System.out.println("Число четное");
                    } else System.out.println("Число нечетное");
                    System.out.println("Для выхода введите Exit ");

                }
            }
        }
    }
}