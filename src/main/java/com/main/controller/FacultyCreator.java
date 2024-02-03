package com.main.controller;

import com.main.model.Faculty;
import com.main.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        Faculty faculty = new Faculty();
        faculty.setName(name);
        faculty.setHead(head);
        return faculty;
    }
}

