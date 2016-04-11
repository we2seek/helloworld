package org.itstep.modules.module10.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Robert Downey"));
        employees.add(new Employee("Matt Damon"));
        employees.add(new Employee("Leonardo DiCaprio"));

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println();

//        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
