package org.itstep.modules.module03.students.lashkov;

/**
 * Вывести все трехзначные числа, у которых цыфры не повторяются и посчитать количество таких чисел. (% /)
 */
public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int sotni;
        int desiatki;
        int edenici;
        for (int ne_povtor = 100; ne_povtor <=999; ne_povtor++) {
            sotni = ne_povtor / 100;
            desiatki = ne_povtor % 100 / 10;
            edenici = ne_povtor % 10;
            if (sotni != desiatki && sotni != edenici && desiatki != edenici) {
                System.out.print(ne_povtor + " ");
                sum++;
            }
        }
        System.out.print("их количество: " + sum);
    }
}
