package sda_scheduler.person;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName= '" + String.format("%-13s",firstName) + '\'' +
                ", lastName= '" + String.format("%-13s",lastName) + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "} ";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
