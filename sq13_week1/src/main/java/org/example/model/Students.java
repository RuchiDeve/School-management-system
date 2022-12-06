package org.example.model;

import java.util.List;

public class Students extends Persons{
    private String studentBehaviour;
    private boolean violateRules;
    private List<Courses> corsesList;

    public Students(String name, String gender, int age, String studentBehaviour, boolean violateRules, List<Courses> courses) {
        super(name, gender, age);
        this.studentBehaviour = studentBehaviour;
        this.violateRules = violateRules;
        this.corsesList = courses;
    }

    public Students() {

    }

    public String getStudentBehaviour() {
        return studentBehaviour;
    }

    public void setStudentBehaviour(String studentBehaviour) {
        this.studentBehaviour = studentBehaviour;
    }

    public boolean isViolateRules() {
        return violateRules;
    }

    public void setViolateRules(boolean violateRules) {
        this.violateRules = violateRules;
    }

    public List<Courses> getCorsesList() {
        return corsesList;
    }

    public void setCorsesList(List<Courses> corsesList) {
        this.corsesList = corsesList;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentBehaviour='" + studentBehaviour + '\'' +
                ", violateRules=" + violateRules +
                ", corsesList=" + corsesList +
                '}';
    }
}
