package com.gkatzioura.solid.liskov;

import java.util.List;

public class Project {

    public void start(List<Employee> employees) {

        for(Employee employee:employees) {
            employee.work();
        }
    }
}
