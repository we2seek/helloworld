package org.itstep.modules.module05.students.ogol_katya;

/**
 * Заполнить массив как показано ниже:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 */
public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j || (n - i - 1) < j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}