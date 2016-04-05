package org.itstep.modules.module08.classwork.exceptions;

/**
 * Created by timchenko on 04.04.2016.
 */
public class Task1 {


    public static void main(String[] args) throws IllegalAccessException {
        int a = 0, d = 0;
        try {
            d = 0;
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }

        System.out.println(a);

    }
}
