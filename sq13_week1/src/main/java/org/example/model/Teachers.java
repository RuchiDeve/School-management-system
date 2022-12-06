package org.example.model;

import java.util.List;

public class Teachers extends Staff{
    private List<Courses> coursesList;

    public Teachers(String name, String gender, int age, boolean isPresent, String role, List<Courses> coursesList) {
        super(name, gender, age, isPresent, role);
        this.coursesList = coursesList;
    }

    public Teachers(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public Teachers() {
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }
}