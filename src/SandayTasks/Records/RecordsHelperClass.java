package SandayTasks.Records;

import java.util.Stack;

public class RecordsHelperClass {
    public static void printStudentInfo(Student student) {
        System.out.println(student.studentInfo());
        if (student.isInHighSchool()) {
            System.out.println(student.name() + " is in high school.");
        } else {
            System.out.println(student.name() + " is not in high school.");
        }
    }

    public static void printMe() {
        Student tomer = new Student(RecordConstants.MY_NAME, RecordConstants.MY_GRADE, RecordConstants.MY_CLASS);
        printStudentInfo(tomer);
    }

    public static int numberOfStudentsInClass(Student[] students, int classNum, int grade) {
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade() == grade && students[i].classNumber() == classNum) {
                counter++;
            }
        }
        return counter;
    }

    public static int maxClassNum(Student[] students) {
        int max = 0;
        for (Student student : students) {
            if (student.classNumber() > max) {
                max = student.classNumber();
            }
        }
        return max;
    }

    public static Classroom[] sortToClassRooms(Student[] students) {
        int maxClassNum = maxClassNum(students);
        int numberOfStudentsInClass = 0;
        int indexClasses = 0;
        int indexClassesArray = 0;
        Classroom[] classrooms = new Classroom[students.length];
        for (int i = 0; i < RecordConstants.MAX_HIGH_SCHOOL_GRADE; i++) {
            for (int j = 0; j < maxClassNum; j++) {
                numberOfStudentsInClass = numberOfStudentsInClass(students, j, i);
                if (numberOfStudentsInClass != 0) {
                    indexClasses = 0;
                    for (Student student : students) {
                        if (student.classNumber() == j && student.grade() == i) {
                            classrooms[indexClassesArray].students()[indexClasses] = student;
                            indexClasses++;
                        }

                    }
                    indexClassesArray++;
                }
            }

        }
        Classroom[] finalClassroomsArray = new Classroom[indexClassesArray];
        for (int i = 0; i < indexClassesArray; i++) {
            finalClassroomsArray[i] = classrooms[i];
        }
        return finalClassroomsArray;
    }
}
