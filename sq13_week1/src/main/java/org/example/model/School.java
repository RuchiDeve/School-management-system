package org.example.model;

import java.util.List;

public class School {
    private String name;
    private List<Teachers> teacher;
    private List<Students> studentList;
    private Classes classes;
    private List<Courses> coursesList;
    private Staff Principal;
    private Applicants applicant;

    public School(String name, List<Teachers> teacher, List<Students> studentList, Classes classes, List<Courses> coursesList, Staff principal, Applicants applicant) {
        this.name = name;
        this.teacher = teacher;
        this.studentList = studentList;
        this.classes = classes;
        this.coursesList = coursesList;
        Principal = principal;
        this.applicant = applicant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teachers> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teachers> teacher) {
        this.teacher = teacher;
    }

    public List<Students> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Students> studentList) {
        this.studentList = studentList;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public Staff getPrincipal() {
        return Principal;
    }

    public void setPrincipal(Staff principal) {
        Principal = principal;
    }

    public Applicants getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicants applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                ", classes=" + classes +
                ", coursesList=" + coursesList +
                ", Principal=" + Principal +
                ", applicant=" + applicant +
                '}';
    }
}
