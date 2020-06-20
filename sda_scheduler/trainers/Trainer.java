package sda_scheduler.trainers;

import sda_scheduler.person.Person;

import java.time.LocalDate;

public class Trainer extends Person {

    private boolean isAuthorized;


    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }

    @Override
    public String toString() {
        return "\nTrainer{" + super.toString() +
                "isAuthorized=" + isAuthorized +
                '}';
    }
}
