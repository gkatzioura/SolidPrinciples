package com.gkatzioura.solid.liskov;

import java.util.List;

public class Project {

    public void start(List<WorkingEmployee> workingEmployees) {

        for(WorkingEmployee workingEmployee:workingEmployees) {
            workingEmployee.work();
        }
    }
}
