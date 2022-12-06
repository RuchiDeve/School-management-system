package org.example.services.servicesImplementation;

import org.example.model.Courses;
import org.example.model.School;
import org.example.model.Students;
import org.example.model.Teachers;
import org.example.services.TeachersServices;

import java.util.List;

public class TeachersImplementation implements TeachersServices {

    public String canTeachCourse(String courseTitle, School school, Teachers teachers) {
        List<Courses> coursesList = school.getCoursesList();
        for(int i=0; i<coursesList.size(); i++){
            if(teachers.getCoursesList().get(i).getCourseTitle().equalsIgnoreCase(courseTitle)){
                return teachers.getName() + " can take " + courseTitle;
            }
        }
        return teachers.getName() + " cannot take " + courseTitle;
    }
}
