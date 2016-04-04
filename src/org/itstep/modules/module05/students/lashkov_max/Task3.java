package org.itstep.modules.module05.students.lashkov_max;

/**
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 */
public class Task3 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((i <= j) & (j < arr[0].length - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
