package org.itstep.modules.module10.examples;

public class Employee /*implements Comparable<Employee>*/ {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [" + name + ']';
    }


    /*@Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }*/
}
