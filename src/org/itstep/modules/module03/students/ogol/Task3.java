package org.itstep.modules.module03.students.ogol;

/**
 * Вывести все трехзначные числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
 */
public class Task3 {
    public static void main (String [] args){
        String str;
        int Counter = 0;
        for ( int i = 100; i <= 999; i++){
            str = Integer.toString(i);
            if (str.charAt(0)==str.charAt(2)) {
                System.out.print( str  + "; ");
                Counter++;
            }
        }
        System.out.println();
        System.out.print( "Counter=" + Counter  + "; ");
    }
}
