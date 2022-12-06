package org.example.services.servicesImplementation;

import org.example.model.Applicants;
import org.example.model.School;
import org.example.model.Staff;
import org.example.model.Students;
import org.example.services.PrincipalServices;

public class PrincipalImplementation implements PrincipalServices {
    public String PrincipalCanAdmit(int age, School school, Applicants applicants){
        Staff principal = school.getPrincipal();
        if(applicants.getAge() < 9 || applicants.getAge() > 25){
            return principal.getName() + " would not admit " + applicants.getName();
        }else {
            return principal.getName() + " will admit " + applicants.getName();
        }
    }



    public String PrincipalCanExpel(String studentBehavior, boolean violateRules, School school, Students students){
        Staff principal = school.getPrincipal();
        if(students.getStudentBehaviour() == studentBehavior && students.isViolateRules() == violateRules){
            return principal.getName() + " cannot expel " + students.getName();
        }else {
            return principal.getName() + " can expel " + students.getName();
        }
    }
}
