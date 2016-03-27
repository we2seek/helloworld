package org.itstep.modules.module02.home;

import java.util.Scanner;

/**
 * Считывать с консоли числа и выводить число четное или нет (оператор %).
 * Считывать до тех пор, пока не будет введено слово exit
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        boolean isExit = false;
        while (!isExit) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            } else if ("exit".equalsIgnoreCase(scanner.next())) {
                isExit = true;
            } else {
                System.out.println("Ошибка ввода! Пожалуйста, введите целое число, либо \"exit\" - для выхода.");
            }

        }
    }
}
