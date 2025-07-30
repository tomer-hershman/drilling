package SandayTasks.Records;

public class RecordsHelperClass {
    public static void printStudentInfo(Student student) {
        student.printStudentInfo();
        if (student.isInHighSchool()) {
            System.out.println(student.name() + " is in high school.");
        } else {
            System.out.println(student.name() + " is not in high school.");
        }
    }
}
