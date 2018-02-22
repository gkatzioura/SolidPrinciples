package com.gkatzioura.solid.liskov;

public class EmployeeOnVacation extends Employee {

    @Override
    public void work() {
        throw new IllegalArgumentException("Employees on vacation should not work");
    }
}
