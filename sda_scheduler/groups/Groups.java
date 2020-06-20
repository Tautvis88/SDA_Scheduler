package sda_scheduler.groups;

import sda_scheduler.exceptions.MaximumNumberOfStudentsReached;
import sda_scheduler.trainers.Trainers;
import sda_scheduler.students.Student;
import sda_scheduler.students.Students;

import java.util.*;

public class Groups {

    /*
    private Trainers trainers = new Trainers();

    private Group group1 = new Group("JavaVilnius7", trainers.getTrainer1(), createGroupOfRandomStudents());
    private Group group2 = new Group("TestKaunas5", trainers.getTrainer1(), createGroupOfRandomStudents());
    private Group group3 = new Group("PythonVilnius1", trainers.getTrainer3(), createGroupOfRandomStudents());
    private Group group4 = new Group("TestVilnius6", trainers.getTrainer2(), createGroupOfRandomStudents());

    public static List<Group> groupList = new ArrayList<>();
    private static Groups groups;

    static {
        try {
            groups = new Groups();

            groupList.add(groups.group1);
            groupList.add(groups.group2);
            groupList.add(groups.group3);
            groupList.add(groups.group4);

        } catch (MaximumNumberOfStudentsReached exception) {
            exception.printStackTrace();
        }
    }

    public Set<Student> createGroupOfRandomStudents() {

        Set<Student> groupOfRandomStudents = new LinkedHashSet<>();
        Random random = new Random();
        int randomSizeOfStudentGroup = 0;
        while (randomSizeOfStudentGroup < 2) {
            randomSizeOfStudentGroup = random.nextInt(11);
        }
        int randomStudentNumber = 0;
        for (int i = 0; i < randomSizeOfStudentGroup; i++) {
            try {
                randomStudentNumber = random.nextInt(15);
                groupOfRandomStudents.add(Students.studentList.get(randomStudentNumber));
                if (groupOfRandomStudents.size() > 5) {
                    throw new MaximumNumberOfStudentsReached("\"The last added student will be deleted.\"");
                }
            } catch (MaximumNumberOfStudentsReached exception) {
                exception.printStackTrace();
                groupOfRandomStudents.remove(Students.studentList.get(randomStudentNumber));
                break;
            }
        }
        return groupOfRandomStudents;
    }

     */

    private static Trainers trainers = new Trainers();

    private List<Group> groupList = createListOfGroups();

    private static Group group1;
    private static Group group2;
    private static Group group3;
    private static Group group4;

    static {
        group1 = new Group("JavaVilnius7", trainers.getRandomTrainer(), createGroupOfRandomStudents());
        group2 = new Group("TestKaunas5", trainers.getRandomTrainer(), createGroupOfRandomStudents());
        group3 = new Group("PythonVilnius1", trainers.getRandomTrainer(), createGroupOfRandomStudents());
        group4 = new Group("TestVilnius6", trainers.getRandomTrainer(), createGroupOfRandomStudents());
    }

    public static Set<Student> createGroupOfRandomStudents() {
        Students students = new Students();

        Set<Student> groupOfRandomStudents = new LinkedHashSet<>();
        Random random = new Random();
        int randomSizeOfStudentGroup = 0;
        while (randomSizeOfStudentGroup < 2) {
            randomSizeOfStudentGroup = random.nextInt(11);
        }
        int randomStudentNumber = 0;
        for (int i = 0; i < randomSizeOfStudentGroup; i++) {
            try {
                randomStudentNumber = random.nextInt(15);
                groupOfRandomStudents.add(students.createListOfAllStudents().get(randomStudentNumber));
                if (groupOfRandomStudents.size() > 5) {
                    throw new MaximumNumberOfStudentsReached("\"The last added student will be deleted.\"");
                }
            } catch (MaximumNumberOfStudentsReached exception) {
                exception.printStackTrace();
                groupOfRandomStudents.remove(students.createListOfAllStudents().get(randomStudentNumber));
                break;
            }
        }
        return groupOfRandomStudents;
    }

    public Groups() throws MaximumNumberOfStudentsReached {
    }

    public List<Group> createListOfGroups() {

        List<Group> listOfGroups = new ArrayList<>();
        listOfGroups.add(group1);
        listOfGroups.add(group2);
        listOfGroups.add(group3);
        listOfGroups.add(group4);

        return listOfGroups;
    }

    public Group getGroup1() {
        return group1;
    }

    public Group getGroup2() {
        return group2;
    }

    public Group getGroup3() {
        return group3;
    }

    public Group getGroup4() {
        return group4;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
