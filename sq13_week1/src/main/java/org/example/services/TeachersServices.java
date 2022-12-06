package org.example.services;

import org.example.model.School;
import org.example.model.Teachers;

public interface TeachersServices {
    String canTeachCourse(String courseTitle, School school, Teachers teachers);
}
