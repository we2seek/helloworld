package org.itstep.modules.module10.examples;

import java.util.*;

/**
 * Created by well on 11.04.16.
 */
public class Main2 {

    public static void main(String[] args) {

        Collection<Employee> collection = new ArrayList<>();
        collection.add(new Employee("John Smith"));
        collection.add(new Employee("Emma Brown"));
        collection.add(new Employee("Taras Shevchenko"));

        Iterator<Employee> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            System.out.println(e);
        }
        System.out.println();

        for (Employee e : collection) {
            System.out.println(e);
        }
        System.out.println();

        collection.forEach(System.out::println);
        System.out.println();

        Iterator<Employee> it = collection.iterator();
        int counter = 0;
        while (it.hasNext()) {
            Employee e = it.next();
            if (counter++ > 1) {
                it.remove();
            }
        }

        collection.forEach(System.out::println);

        List<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");

        words.subList(1, 3).clear();

        words.forEach(System.out::println);

        int indexOfFour = 3 + words.subList(3, 5).indexOf("Four");
        System.out.println("Index of four: " + indexOfFour);

        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new LinkedList<>();

        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new LinkedList<>();

        Set<Integer> set;
    }


}
