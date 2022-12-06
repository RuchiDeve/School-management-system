package org.example;

import org.example.model.*;
import org.example.services.servicesImplementation.PrincipalImplementation;
import org.example.services.servicesImplementation.StudentsImplementation;
import org.example.services.servicesImplementation.TeachersImplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Students studentsList = new Students();

        Courses math = new Courses("Mathematics");
        Courses English = new Courses("English Language");
        List<Courses> coursesList = new ArrayList<>(Arrays.asList(math,English));

        Teachers teacher1= new Teachers("chi", "male",38, true, "Teacher", coursesList);
        Teachers teacher2 = new Teachers("Uruchi", "female",28, false, "Teacher", coursesList);
        List<Teachers> teachersList = new ArrayList<>(Arrays.asList(teacher1,teacher2));

        Students s1 = new Students("Violet","female", 23, "good", false, coursesList);
        Students s2 = new Students("Jane","female", 29, "good", false, coursesList);
        List<Students> students = new ArrayList<>(Arrays.asList(s1,s2));

        Applicants applicant1 =new Applicants("Godwin" , "male",45);
        Applicants applicant2 =new Applicants("Godwin" , "male",45);
        List<Applicants> applicantsList = new ArrayList<>(Arrays.asList(applicant1, applicant2));

        Classes  classes = new Classes("jss1", students, teachersList, coursesList);

        Principal principal = new Principal("Tiwo", "male", 35,true, "Principal", students, applicantsList );

        School school = new School("Decagon", teachersList, students, classes ,coursesList, principal,applicant1);

        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        TeachersImplementation teachersImplementation = new TeachersImplementation();
        StudentsImplementation studentsImplementation = new StudentsImplementation();
        System.out.println(principalImplementation.PrincipalCanExpel("good", true, school, s1));
        System.out.println(principalImplementation.PrincipalCanAdmit(27, school, applicant1));
        System.out.println(studentsImplementation.canTakeCourses("Mathematics", school, s1));
        System.out.println(teachersImplementation.canTeachCourse("English Language", school, teacher1));

        final String path = "src/StaffDetails.csv";
        String line = "";
        List<Staff> staffList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null){
                String[] column = line.split(",");
                staffList.add(new Staff(column[0], column[1], Integer.parseInt(column[2]), Boolean.parseBoolean(column[3]), column[4]));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(staffList);
        System.out.println(staffList.get(0).getName());
    }
}