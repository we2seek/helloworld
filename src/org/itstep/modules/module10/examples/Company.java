package org.itstep.modules.module10.examples;

import java.util.Iterator;

public class Company implements Iterable<Employee> {
    private Employee [] employees = new Employee[0];

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee getEmployee(int i){
        return employees[i];
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeCount(){
        return employees.length;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ArrayIterator<Employee>(employees);
    }
}
