package org.itstep.modules.module02.home;

import java.util.Random;
import java.util.Scanner;

/**
 * Создать игру угадай число. (не обязательное)
 */
public class Task2 {
    public static void main(String[] args) {
        final int RANDOM_MIN = 1;
        final int RANDOM_MAX = 100;

        System.out.println("*** Игра \"Угадай число\" ***\n" +
                "Я загадал целое число от " + RANDOM_MIN + " до " + RANDOM_MAX + ".\n" +
                "Попробуй угадай его.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
        int userNumber;
        boolean isWin = false;

        while (!isWin) {
            System.out.print("?: ");
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == randomNumber) {
                    isWin = true;
                    System.out.println("Угадал!");
                }
                if (randomNumber > userNumber) {
                    System.out.println("Больше");
                }
                if (randomNumber < userNumber) {
                    System.out.println("Меньше");
                }
            } else {
                if ("exit".equalsIgnoreCase(scanner.next())) {
                    isWin = true;
                } else {
                    System.out.println("Пожалуйста, введите число от " + RANDOM_MIN + " до " + RANDOM_MAX);
                    System.out.println("Для выхода введите \"exit\"");
                }
            }
        }

        scanner.close();
    }
}
