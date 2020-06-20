package sda_scheduler.groups;

import sda_scheduler.trainers.Trainer;
import sda_scheduler.students.Student;

import java.util.Set;

public class Group {

    private String name;
    private Trainer trainer;
    private Set<Student> groupOfStudents;

    public Group(String name, Trainer trainer, Set<Student> groupOfStudents) {
        this.name = name;
        this.trainer = trainer;
        this.groupOfStudents = groupOfStudents;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Set<Student> getGroupOfStudents() {
        return groupOfStudents;
    }

    @Override
    public String toString() {
        return "\nGroup{" +
                "name= '" + name + '\'' +
                ", " + trainer.toString() +
                ", \n" + groupOfStudents +
                '}';
    }
}
