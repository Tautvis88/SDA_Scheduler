package sda_scheduler.students;

import sda_scheduler.groups.Group;
import sda_scheduler.groups.Groups;
import sda_scheduler.exceptions.MaximumNumberOfStudentsReached;
import sda_scheduler.trainers.Trainer;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StudentService {



    public void displayStudentsAlphabetically() throws MaximumNumberOfStudentsReached {
        System.out.println("The list of students in every group sorted alphabetically by lastName:");
        Groups groups = new Groups();
        System.out.print("GROUP 1");
        for (Student student : sortStudentsByLastName(groups.getGroup1())) {
            System.out.print(student.toString());
        }
        System.out.print("\nGROUP 2");
        for (Student student : sortStudentsByLastName(groups.getGroup2())) {
            System.out.print(student.toString());
        }
        System.out.print("\nGROUP 3");
        for (Student student : sortStudentsByLastName(groups.getGroup3())) {
            System.out.print(student.toString());
        }
        System.out.print("\nGROUP 4");
        for (Student student : sortStudentsByLastName(groups.getGroup4())) {
            System.out.print(student.toString());
        }
    }

    private Set<Student> sortStudentsByLastName(Group group) throws MaximumNumberOfStudentsReached {
        Set<Student> sortedStudentSet = new TreeSet<>(Comparator.comparing(Student::getLastName));
        sortedStudentSet.addAll(group.getGroupOfStudents());
        return sortedStudentSet;
    }

    public void displayStudentsYoungerThan25() throws MaximumNumberOfStudentsReached {
        System.out.print("Students younger than 25 from the all groups:");
        Set<Student> listOfStudentsYoungerThan25 = new LinkedHashSet<>();
        Groups groups = new Groups();

        for (Group group : groups.createListOfGroups()) {
            for (Student student : group.getGroupOfStudents()) {
                if (Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() < 25) {
                    listOfStudentsYoungerThan25.add(student);
                }
            }
        }
        System.out.println(listOfStudentsYoungerThan25.toString());
    }

    public void displayStudentsByTrainer() throws MaximumNumberOfStudentsReached {
        System.out.println("Students grouped by trainer: ");

        for (Map.Entry<Trainer, List<Student>> entry : groupsOfStudentsByTrainer().entrySet()) {
            System.out.println(entry.getKey());
            System.out.print(entry.getValue().size() + " students.");
            System.out.println(entry.getValue());
        }
    }

    private Map<Trainer, List<Student>> groupsOfStudentsByTrainer() throws MaximumNumberOfStudentsReached {

        Map<Trainer, List<Student>> studentsByTrainerMap = new HashMap<>();

        Groups groups = new Groups();

        for (Group group : groups.getGroupList()) {
            List<Student> studentsByTrainerList = studentsByTrainerMap.get(group.getTrainer());
            if (studentsByTrainerList == null) {
                studentsByTrainerList = new ArrayList<>(group.getGroupOfStudents());
                studentsByTrainerMap.put(group.getTrainer(), studentsByTrainerList);
            } else {
                studentsByTrainerList.addAll(new ArrayList<>(group.getGroupOfStudents()));
            }
        }
        return studentsByTrainerMap;
    }

    public void displayStudentsWithJavaKnowledge() throws MaximumNumberOfStudentsReached {
        System.out.println("Students with java knowledge from all groups:");
        Groups groups = new Groups();
        Set<Student> studentsWithJavaKnowledge = new LinkedHashSet<>();
        for (Group group : groups.getGroupList()) {
            for (Student student : group.getGroupOfStudents()) {
                if (student.hasPreviousJavaKnowledge()) {
                    studentsWithJavaKnowledge.add(student);
                }
            }
        }
        System.out.println(studentsWithJavaKnowledge);
    }

    public void displayGroupsAfterRemovingStudentsYoungerThan20() throws MaximumNumberOfStudentsReached {
        Groups groups = new Groups();
        int numberOfStudentsBeforeRemoval = 0;
        for (Group group : groups.getGroupList()) {
            numberOfStudentsBeforeRemoval += group.getGroupOfStudents().size();
        }

        List<Group> groupListWithoutStudentsYoungerThan20 = groupsWithoutStudentsYoungerThan20(groups.getGroupList());
        int numberOfStudentsAfterRemoval = 0;
        for (Group group : groupListWithoutStudentsYoungerThan20) {
            numberOfStudentsAfterRemoval += group.getGroupOfStudents().size();
        }
        int numberOfRemovedStudents = numberOfStudentsBeforeRemoval - numberOfStudentsAfterRemoval;
        System.out.println("Removed " + numberOfRemovedStudents + " students younger than 25.");
        for (Group group : groupListWithoutStudentsYoungerThan20) {
            System.out.println(group);
        }
    }

    private List<Group> groupsWithoutStudentsYoungerThan20(List<Group> groupList) {
        for (Group group : groupList) {
            group.getGroupOfStudents().removeIf(student ->
                    Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() < 25);
        }
        return groupList;
    }
}
