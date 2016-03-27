package org.itstep.modules.module03.home;

/**
 * Вывести в консоль простые числа в интервале от 2 до 1000.
 */
public class Task1 {


    public void printPrimeNumbers1() {
        System.out.print("2 3 5 7 ");

        for (int i = 10; i <= 200; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void printPrimeNumbers2() {
        int max = 200;

        for (int i = 2; i < max; i++) {

            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }

    }


    public static void main(String[] args) {
        Task1 task = new Task1();
        task.printPrimeNumbers1(); // Корректно работает только до 100
        task.printPrimeNumbers2();

    }
}
