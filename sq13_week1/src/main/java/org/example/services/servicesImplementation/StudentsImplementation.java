package org.example.services.servicesImplementation;

import org.example.model.Courses;
import org.example.model.School;
import org.example.model.Students;
import org.example.services.StudentServices;

import java.util.List;

public class StudentsImplementation implements StudentServices {
    public String canTakeCourses(String courseTitle, School school, Students students) {
        List<Courses> coursesList = school.getCoursesList();
        for(int i=0; i<coursesList.size(); i++) {
            if(students.getCorsesList().get(i).getCourseTitle().equalsIgnoreCase(courseTitle)){
                return students.getName() + " can take " + courseTitle;
            }
        }
        return students.getName() + " cannot take " + courseTitle;
    }
}
