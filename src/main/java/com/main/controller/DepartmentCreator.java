package com.main.controller;

import com.main.model.Department;
import com.main.model.Human;

public class DepartmentCreator {

    public static Department createDepartment(String name, Human head) {
        Department department = new Department();
        department.setName(name);
        department.setHead(head);
        return department;
    }
}

