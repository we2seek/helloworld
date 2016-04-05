package org.itstep.modules.module03.students.lashkov;

import java.util.Scanner;

/**
 * Найти числа-палиндромы (101 == 101). Вывести их и посчитать количество.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        isPalindrome(a);
    }
    public static String reversString(String a) {
        String e = "";
        for (int i = a.length() - 1; i >= 0; --i)
            e += a.charAt(i);
        return e;
    }
    public static boolean isPalindrome(String a){
        if(a.equals(reversString(a))) {
            System.out.println("палиндром");
        }
        else{
            System.out.println("не палиндром");
        }
        return a.equals(reversString(a));
    }
}
