package com.main.controller;

import com.main.model.Group;
import com.main.model.Sex;
import com.main.model.Student;

public class StudentCreator {
    public static Student createStudent(String name, String surname, String patronymic, Sex sex, Group group) {
        Student student = new Student(patronymic, patronymic, patronymic, sex);
        student.setName(name);
        student.setSurname(surname);
        student.setPatronymic(patronymic);
        student.setSex(sex);
        student.setGroup(group);

        return student;
    }
}

