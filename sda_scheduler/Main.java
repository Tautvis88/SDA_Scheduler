package sda_scheduler;

import sda_scheduler.exceptions.MaximumNumberOfStudentsReached;
import sda_scheduler.groups.GroupService;
import sda_scheduler.students.StudentService;

public class Main {
    public static void main(String[] args) throws MaximumNumberOfStudentsReached {

        GroupService groupService = new GroupService();
        StudentService studentService = new StudentService();

        groupService.displayAllGroups();
        System.out.println("\n---------------------");
        studentService.displayStudentsAlphabetically();
        System.out.println("\n---------------------");
        groupService.displayGroupWithMaxStudents();
        System.out.println("\n---------------------");
        studentService.displayStudentsYoungerThan25();
        System.out.println("\n---------------------");
        studentService.displayStudentsByTrainer();
        System.out.println("\n---------------------");
        studentService.displayStudentsWithJavaKnowledge();
        System.out.println("\n---------------------");
        groupService.displayGroupWithMaxStudentsWithNoJavaKnowledge();
        System.out.println("\n---------------------");
        studentService.displayGroupsAfterRemovingStudentsYoungerThan20();


        // Prikūriau daug Groups groups = new Groups() objektų. Gal reiktų jį padaryti static ir tada bus vienas,
        // pasiekiamas iš visur?
    }
}
