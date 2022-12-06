package org.example.model;

public class Staff extends Persons{
    private boolean isPresent;
    private String role;

    public Staff(String name, String gender, int age, boolean isPresent, String role) {
        super(name, gender, age);
        this.isPresent = isPresent;
        this.role = role;
    }

    public Staff() {
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "isPresent=" + isPresent +
                '}';
    }

}
