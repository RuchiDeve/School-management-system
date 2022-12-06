package org.example.model;

import java.util.List;

public class Classes {
    private String className;
    private List<Students> studentsList;
    private List<Teachers> teachersList;
    private List<Courses> coursesList;

    public Classes(String className, List<Students> studentsList, List<Teachers> teachersList, List<Courses> coursesList) {
        this.className = className;
        this.studentsList = studentsList;
        this.teachersList = teachersList;
        this.coursesList = coursesList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", studentsList=" + studentsList +
                ", teachersList=" + teachersList +
                ", coursesList=" + coursesList +
                '}';
    }
}
