package sda_scheduler.students;

import sda_scheduler.person.Person;

import java.time.LocalDate;

public class Student extends Person {

    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getLastName() {
        return super.getLastName();
    }

    public boolean hasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "\nStudent{" + super.toString() +
                "hasPreviousJavaKnowledge= " + hasPreviousJavaKnowledge +
                '}';
    }
}
