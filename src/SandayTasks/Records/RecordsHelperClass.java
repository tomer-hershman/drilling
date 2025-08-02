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

    public static Classroom[] sortToClassRooms(Student[] students) {
        Classroom[] classrooms = new Classroom[students.length];
        int classListLen = 0;
        for (Student student : students) {
            if (student != null)
            while (){
                if ( != null)

            }
        }
    }
}
