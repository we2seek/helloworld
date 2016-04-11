package org.itstep.modules.module10.examples;

import java.util.Iterator;

public class ExampleIterable_1 {
    public static void main(String[] args) {
        Employee[] emps = {
                new Employee("Robert Downey"),
                new Employee("Matt Damon"),
                new Employee("Leonardo DiCaprio")
        };
        Company company = new Company();
        company.setEmployees(emps);


        System.out.println("Simple for-loop:");
        for (int i = 0; i < company.getEmployeeCount(); i++) {
            System.out.println(company.getEmployee(i));
        }
        System.out.println();

        System.out.println("Foreach:");
        for (Employee emp : company) {
            System.out.println(emp);
        }
        System.out.println();

        Iterator<Employee> it = company.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
