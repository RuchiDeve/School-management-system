package org.example.model;

import java.util.List;

public class Courses {
    private String courseTitle;



    public Courses(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseTitle='" + courseTitle + '\'' +
                '}';
    }
}
