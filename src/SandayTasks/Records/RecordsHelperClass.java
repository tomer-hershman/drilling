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
        Stack<Student>[][] schoolClasses = new Stack[12][students.length];
        Stack<Classroom> classRooms = new Stack<Classroom>();
        Classroom classRoom = null;
        Student[] classRoomStudents = null;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < students.length; j++) {
                schoolClasses[i][j] = new Stack<Student>();
            }
        }

        for (int i = 0; i < students.length; i++) {

            schoolClasses[students[i].grade() - 1][students[i].classNumber() - 1].push(students[i]);
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < students.length; j++) {
                if (schoolClasses[i][j].size() > 0) {
                    classRoomStudents = new Student[schoolClasses[i][j].size()];
                    for (int k = 0; k < schoolClasses[i][j].size(); k++) {
                        classRoomStudents[k] = schoolClasses[i][j].pop();
                    }
                    classRoom = new Classroom(i, j, classRoomStudents);
                    classRooms.push(classRoom);
                }

            }

        }
        Classroom[] classRoomsArray = new Classroom[classRooms.size()];
        for (int i = 0; i < classRoomsArray.length; i++) {
            classRoomsArray[i] = classRooms.pop();
        }
        return classRoomsArray;
    }
}
