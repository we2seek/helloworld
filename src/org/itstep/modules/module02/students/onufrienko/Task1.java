package org.itstep.modules.module02.students.onufrienko;

import java.util.Scanner;

/**
 * Created by well on 29.03.16.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner moiscan = new Scanner(System.in);
        int polzovatelint;
        String polzovatel;
        while (true) {
            System.out.print("Введите число: ");
            if(moiscan.hasNextInt()){
                polzovatelint = moiscan.nextInt();
                if (polzovatelint % 2 == 0) {
                    System.out.println("Чётное");
                } else {
                    System.out.println("Не чётное");
                }
            } else {
                polzovatel = moiscan.next();
                if (polzovatel.equals("exit")) {
                    break;
                }
            }

        }
    }
}
