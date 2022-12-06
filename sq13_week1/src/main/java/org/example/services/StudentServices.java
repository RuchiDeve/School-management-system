package org.example.services;

import org.example.model.Courses;
import org.example.model.School;
import org.example.model.Students;

import java.util.List;

public interface StudentServices {
    String canTakeCourses(String courseTitle, School school, Students students);
}
