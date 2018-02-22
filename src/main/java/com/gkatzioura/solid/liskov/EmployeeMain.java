package com.gkatzioura.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String args[]) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeOnVacation());
        employees.add(new Employee());

        Project project = new Project();
        project.start(employees);

    }
}
