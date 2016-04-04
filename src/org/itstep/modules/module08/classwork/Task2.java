package org.itstep.modules.module08.classwork;

/**
 * Created by timchenko on 04.04.2016.
 */
public class Task2 {


    public static void main(String[] args) throws IllegalAccessException {
        int a = 0, d = 0;
        try {
            d = 0;
            a = 42 / d;
        } catch (RuntimeException e) {
            System.out.println("Division by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Runtime exception");
        }

        Netw

        System.out.println(a);

    }
}
