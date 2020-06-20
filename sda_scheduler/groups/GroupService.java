package sda_scheduler.groups;

import sda_scheduler.exceptions.MaximumNumberOfStudentsReached;
import sda_scheduler.students.Student;

import java.util.*;

public class GroupService {

    private Groups groups = new Groups();

    public GroupService() throws MaximumNumberOfStudentsReached {
    }

    public void displayAllGroups() {
        System.out.println("The list of all groups and their trainer/students:");
        System.out.println(groups.getGroup1().toString());
        System.out.println(groups.getGroup2().toString());
        System.out.println(groups.getGroup3().toString());
        System.out.println(groups.getGroup4().toString());
    }

    public void displayGroupWithMaxStudents() throws MaximumNumberOfStudentsReached {
        System.out.println("\nThe group with the highest number of students:");
        Groups groups = new Groups();
        List<Integer> indexesOfLargestGroups = createArrayOfIndexesForLargestGroups();
        List<Group> listOfGroups = groups.createListOfGroups();
        List<Integer> groupSizes = createArrayOfGroupSizes();
        int numberOfGroupWithMaxStudents;
        if (indexesOfLargestGroups.size() > 1) {
            System.out.print("Group ");
            for (int i = 0; i < indexesOfLargestGroups.size(); i++) {
                numberOfGroupWithMaxStudents = indexesOfLargestGroups.get(i);
                System.out.print(numberOfGroupWithMaxStudents + " \"");
                System.out.print(listOfGroups.get(numberOfGroupWithMaxStudents - 1).getName());
                if (i < indexesOfLargestGroups.size() - 2) {
                    System.out.print("\", group ");
                } else if (i == indexesOfLargestGroups.size() - 2) {
                    System.out.print("\" and group ");
                }
            }
            System.out.println("\" have " + Collections.max(groupSizes) + " students each.");
        } else {
            numberOfGroupWithMaxStudents = indexesOfLargestGroups.get(0);
            System.out.println("Group " + numberOfGroupWithMaxStudents + " \"" +
                    listOfGroups.get(numberOfGroupWithMaxStudents - 1).getName() + "\" has " +
                    listOfGroups.get(numberOfGroupWithMaxStudents - 1).getGroupOfStudents().size() + " students.");
        }
    }

    private List<Integer> createArrayOfGroupSizes() throws MaximumNumberOfStudentsReached {
        List<Integer> groupSizes = new ArrayList<>();
        Groups groups = new Groups();
        List<Group> listOfGroups = groups.createListOfGroups();
        for (Group group : listOfGroups) {
            groupSizes.add(group.getGroupOfStudents().size());
        }
        return groupSizes;
    }

    private List<Integer> createArrayOfIndexesForLargestGroups() throws MaximumNumberOfStudentsReached {
        List<Integer> indexesOfLargestGroups = new ArrayList<>();
        List<Integer> groupSizes = createArrayOfGroupSizes();
        int groupNumber = 0;
        for (int size : groupSizes) {
            groupNumber++;
            if (size == Collections.max(groupSizes)) {
                indexesOfLargestGroups.add(groupNumber);
            }
        }
        return indexesOfLargestGroups;
    }

    public void displayGroupWithMaxStudentsWithNoJavaKnowledge() throws MaximumNumberOfStudentsReached {
        System.out.println("The group with the highest number of students with no previous java knowledge:");
        System.out.println(groupWithMaxStudentsWithNoJavaKnowledge());
        int countStudentsWithNoJava = 0;
        for (Student student : groupWithMaxStudentsWithNoJavaKnowledge().getGroupOfStudents()) {
            if (!student.hasPreviousJavaKnowledge()) {
                countStudentsWithNoJava++;
            }
        }
        System.out.println("Students with no Java knowledge: " + countStudentsWithNoJava);

    }

    private Group groupWithMaxStudentsWithNoJavaKnowledge() throws MaximumNumberOfStudentsReached {
        Groups groups = new Groups();

        Group groupWithMaxStudentsWithNoJavaKnowledge = null;
        int maxStudentsWithNoJavaKnowledge = 0;

        for (Group group : groups.getGroupList()) {
            int countStudentsWithNoJavaKnowledge = 0;
            for (Student student : group.getGroupOfStudents()) {
                if (!student.hasPreviousJavaKnowledge()) {
                    countStudentsWithNoJavaKnowledge++;
                }
            }
            if (countStudentsWithNoJavaKnowledge > maxStudentsWithNoJavaKnowledge) {
                groupWithMaxStudentsWithNoJavaKnowledge = group;
                maxStudentsWithNoJavaKnowledge = countStudentsWithNoJavaKnowledge;
            }
        }
        return groupWithMaxStudentsWithNoJavaKnowledge;
    }
}
