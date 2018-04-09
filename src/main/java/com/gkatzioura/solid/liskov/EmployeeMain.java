package com.gkatzioura.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String args[]) {

        List<WorkingEmployee> employees = new ArrayList<>();
        employees.add(new WorkingEmployeeImpl());

        Project project = new Project();
        project.start(employees);

    }
}
