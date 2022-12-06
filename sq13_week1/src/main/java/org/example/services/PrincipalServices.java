package org.example.services;

import org.example.model.Applicants;
import org.example.model.School;
import org.example.model.Students;

public interface PrincipalServices {
    String PrincipalCanAdmit(int age, School school, Applicants applicants);
    String PrincipalCanExpel(String studentBehavior, boolean violateRules, School school, Students students);
}
