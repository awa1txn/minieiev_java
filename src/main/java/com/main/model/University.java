package com.main.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University() {
        this.faculties = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    // You can implement additional methods as needed

    // New method to check equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        University that = (University) obj;

        // Check properties for equality
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(head, that.head)) return false;

        // Check faculties for equality
        if (!areFacultiesEqual(faculties, that.faculties)) return false;

        return true;
    }

    public boolean areFacultiesEqual(List<Faculty> faculties1, List<Faculty> faculties2) {
    if (faculties1.size() != faculties2.size()) return false;

    for (int i = 0; i < faculties1.size(); i++) {
        if (!Objects.equals(faculties1.get(i), faculties2.get(i))) {
            return false;
        }
    }

    return true;
    }
}


