package org.example.model;

import java.util.List;

public class Principal extends Staff{
    private List<Students> studentsList;
    private List<Applicants> applicantsList;

    public Principal(String name, String gender, int age, boolean isPresent, String role, List<Students> studentsList, List<Applicants> applicantsList) {
        super(name, gender, age, isPresent, role);
        this.studentsList = studentsList;
        this.applicantsList = applicantsList;
    }

    public Principal() {



    }

    @Override
    public String toString() {
        return "Principal{" +
                "studentsList=" + studentsList +
                ", applicantsList=" + applicantsList +
                '}';
    }
}
