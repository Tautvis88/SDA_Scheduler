package sda_scheduler.students;

import sda_scheduler.dategenerator.DateGenerator;

import java.util.ArrayList;
import java.util.List;

public class Students {

    /*
    private DateGenerator dateOfBirth = new DateGenerator();

    private Student student1 = new Student("1.Petras", "Petraitis", dateOfBirth.randomDateGenerator(),
            false);
    private Student student2 = new Student("2.Jonas", "Jonaitis", dateOfBirth.randomDateGenerator(),
            false);
    private Student student3 = new Student("3.Tomas", "Tomilinas", dateOfBirth.randomDateGenerator(),
            true);
    private Student student4 = new Student("4.Marius", "Marelinas", dateOfBirth.randomDateGenerator(),
            false);
    private Student student5 = new Student("5.Julius", "Julinauskas", dateOfBirth.randomDateGenerator(),
            false);
    private Student student6 = new Student("6.Paulius", "Paulionis", dateOfBirth.randomDateGenerator(),
            true);
    private Student student7 = new Student("7.Povilas", "Poviliauskas", dateOfBirth.randomDateGenerator(),
            false);
    private Student student8 = new Student("8.Lukas", "Lukošius", dateOfBirth.randomDateGenerator(),
            true);
    private Student student9 = new Student("9.Antanas", "Antanauskas", dateOfBirth.randomDateGenerator(),
            false);
    private Student student10 = new Student("10.Saulius", "Saulėnas", dateOfBirth.randomDateGenerator(),
            false);
    private Student student11 = new Student("11.Andrius", "Andriukaitis", dateOfBirth.randomDateGenerator(),
            false);
    private Student student12 = new Student("12.Inga", "Ingulinienė", dateOfBirth.randomDateGenerator(),
            true);
    private Student student13 = new Student("13.Miglė", "Miglinienė", dateOfBirth.randomDateGenerator(),
            false);
    private Student student14 = new Student("14.Justė", "Justinienė", dateOfBirth.randomDateGenerator(),
            false);
    private Student student15 = new Student("15.Kristina", "Kristinovič", dateOfBirth.randomDateGenerator(),
            true);

    public static List<Student> studentList = new ArrayList<>();
    private static Students students = new Students();
    static {
        studentList.add(students.student1);
        studentList.add(students.student2);
        studentList.add(students.student3);
        studentList.add(students.student4);
        studentList.add(students.student5);
        studentList.add(students.student6);
        studentList.add(students.student7);
        studentList.add(students.student8);
        studentList.add(students.student9);
        studentList.add(students.student10);
        studentList.add(students.student11);
        studentList.add(students.student12);
        studentList.add(students.student13);
        studentList.add(students.student14);
        studentList.add(students.student15);
    }
     */

    private static DateGenerator dateOfBirth = new DateGenerator();

    private static Student student1;
    private static Student student2;
    private static Student student3;
    private static Student student4;
    private static Student student5;
    private static Student student6;
    private static Student student7;
    private static Student student8;
    private static Student student9;
    private static Student student10;
    private static Student student11;
    private static Student student12;
    private static Student student13;
    private static Student student14;
    private static Student student15;

    static {
        student1 = new Student("1.Petras", "Petraitis", dateOfBirth.randomDateGenerator(),
                false);
        student2 = new Student("2.Jonas", "Jonaitis", dateOfBirth.randomDateGenerator(),
                false);
        student3 = new Student("3.Tomas", "Tomilinas", dateOfBirth.randomDateGenerator(),
                true);
        student4 = new Student("4.Marius", "Marelinas", dateOfBirth.randomDateGenerator(),
                false);
        student5 = new Student("5.Julius", "Julinauskas", dateOfBirth.randomDateGenerator(),
                false);
        student6 = new Student("6.Paulius", "Paulionis", dateOfBirth.randomDateGenerator(),
                true);
        student7 = new Student("7.Povilas", "Poviliauskas", dateOfBirth.randomDateGenerator(),
                false);
        student8 = new Student("8.Lukas", "Lukošius", dateOfBirth.randomDateGenerator(),
                true);
        student9 = new Student("9.Antanas", "Antanauskas", dateOfBirth.randomDateGenerator(),
                false);
        student10 = new Student("10.Saulius", "Saulėnas", dateOfBirth.randomDateGenerator(),
                false);
        student11 = new Student("11.Andrius", "Andriukaitis", dateOfBirth.randomDateGenerator(),
                false);
        student12 = new Student("12.Inga", "Ingulinienė", dateOfBirth.randomDateGenerator(),
                true);
        student13 = new Student("13.Miglė", "Miglinienė", dateOfBirth.randomDateGenerator(),
                false);
        student14 = new Student("14.Justė", "Justinienė", dateOfBirth.randomDateGenerator(),
                false);
        student15 = new Student("15.Kristina", "Kristinovič", dateOfBirth.randomDateGenerator(),
                true);
    }

    public List<Student> createListOfAllStudents() {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);
        listOfStudents.add(student7);
        listOfStudents.add(student8);
        listOfStudents.add(student9);
        listOfStudents.add(student10);
        listOfStudents.add(student11);
        listOfStudents.add(student12);
        listOfStudents.add(student13);
        listOfStudents.add(student14);
        listOfStudents.add(student15);
    return listOfStudents;
    }

}
